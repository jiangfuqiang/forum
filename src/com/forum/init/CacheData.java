package com.forum.init;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.forum.common.SystemConstant;
import com.forum.common.exception.InitSystemException;

public class CacheData {

	
	
	private Logger log = Logger.getLogger(CacheData.class);
	
	//存放系统配置文件中信息
	public static final Map<String, String> SYSTEM_CONFIG_INFO = new HashMap<String, String>();
	//存放sql语句
	public static final Map<String, String> JDBC_CACHE = new HashMap<String, String>();
	
	private DocumentBuilder documentBuilder;
	
	public CacheData(){}
	
	/**
	 * 
	 * 功能: 初始化系统数据
	 * 作者: jiangfuqiang
	 * 创建日期:2013-6-26
	 * 修改者: mender
	 * 修改日期: modifydate
	 */
	private void initData() {
		
		initPropertyFile(SystemConstant.SYSTEM_CONFIG_FILE_PATH, SYSTEM_CONFIG_INFO);
		try {
			documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			log.info("初始化document对象错误");
		}
		initSqlFile(SYSTEM_CONFIG_INFO.get("jdbc_file_path") + File.separator +SYSTEM_CONFIG_INFO.get("database_type"), false);
		
	}
	
	
	/**
	 * 
	 * 功能:初始化properties文件 
	 * 作者: jiangfuqiang
	 * 创建日期:2013-6-23
	 * 修改者: mender
	 * 修改日期: modifydate
	 */
	private void initPropertyFile(String path, Map<String, String> map) {
		File file = new File(this.getClass().getResource(path).getFile());
		if(!file.exists()) {
			try {
				throw new InitSystemException("配置文件不存在,路径"+file.getAbsolutePath());
			} catch(Exception e) {}
		}
		
		Properties pro = new Properties();
		try {
			log.info("开始读取文件"+file.getName());
			pro.load(new FileInputStream(file));
			Set<Entry<Object, Object>> entrys = pro.entrySet();
			for(Entry<Object, Object> entry : entrys) {
				if(map.containsKey(String.valueOf(entry.getKey()))) {
					throw new InitSystemException("配置文件中已经存在配置"+entry.getKey().toString());
				}
				map.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
			}
			log.info("读取文件"+file.getName()+"完毕");
		} catch(Exception e) {
			try {
				throw new InitSystemException("配置文件不存在");
			} catch (InitSystemException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			pro.clear();
		}
	}
	
	private void initSqlFile(String path, boolean flag) {
		File file = null;
		if(!flag)
			file = new File(this.getClass().getResource(path).getFile());
		else
			file = new File(path);
		if(file.exists()) {
			if(file.isDirectory()) {
				File[] files = file.listFiles();
				for(File f : files) {
					initSqlFile(f.getAbsolutePath(), true);
				}
			} else {
				if(file.getName().endsWith("xml")) {
					log.info("正在解析" + file.getAbsolutePath());
					parseSqlXml(file.getAbsolutePath());
					log.info("解析" + file.getAbsolutePath()+"完毕");
				}
			}
		}
	}
	
	private void parseSqlXml(String filePath) {
		try {
			Document document = documentBuilder.parse(new File(filePath));
			Element root = document.getDocumentElement();
			NodeList nodes = root.getElementsByTagName("sql");
			if(nodes.getLength() > 0) {
				for(int i = 0; i < nodes.getLength(); i++) {
					Node node = nodes.item(i);
					if(node.getNodeType() == Element.ELEMENT_NODE) {
						if(JDBC_CACHE.containsKey(node.getNodeValue())) {
							throw new InitSystemException("已经有【"+node.getNodeValue()+"】存在了");
						}
						JDBC_CACHE.put(node.getNodeValue(), node.getTextContent());
					}
				}
			}
		} catch (SAXException e) {
			System.exit(0);
		} catch (IOException e) {
			System.exit(0);
		} catch(Exception e) {
			
		}
		
	}
}

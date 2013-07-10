package com.forum.common;

import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;

import com.forum.init.CacheData;
import com.sun.org.apache.xml.internal.security.utils.Base64;

/**
 * 
 * 功能: 加密与解密
 * 创建日期:2013-6-28
 * Title:
 * Description：对本文件的详细描述，原则上不能少于50字
 * @author jiangfuqiang
 * @version 1.0
 */
public class EncryptAndDencrypt {
	
	private static Signature sign = null;
	static {
		try {
			sign = Signature.getInstance("DSA");
		} catch (NoSuchAlgorithmException e) {
			
		}
	}
	
	/**
	 * 
	 * 功能: 加密数据
	 * 作者: jiangfuqiang
	 * 创建日期:2013-6-30
	 * 修改者: mender
	 * 修改日期: modifydate
	 * @param data
	 * @return
	 */
	public static String encryptData(String data) throws Exception{
		sign.initSign((PrivateKey)CacheData.KEY_CACHE.get("prikey"));
		sign.update(data.getBytes());
		return String.valueOf(Base64.encode(sign.sign()));
	}
	
	/**
	 * 
	 * 功能: 验证输入的数据与存储的数据是否相等
	 * 作者: jiangfuqiang
	 * 创建日期:2013-6-30
	 * 修改者: mender
	 * 修改日期: modifydate
	 * @param data
	 * @param content
	 * @return
	 * @throws Exception
	 */
	public static boolean verifyData(String data, String encryptedData) throws Exception {
		sign.initVerify((PublicKey) CacheData.KEY_CACHE.get("pubkey"));
		byte[] buff = data.getBytes();
		sign.update(Base64.decode(encryptedData.getBytes()));
		return sign.verify(buff);
	}
	
	/**
	 * 
	 * 功能: 解密数据
	 * 作者: jiangfuqiang
	 * 创建日期:2013-6-30
	 * 修改者: mender
	 * 修改日期: modifydate
	 * @param data
	 * @return
	 */
	public static String dencryptData(String target, String content) throws Exception{
		sign.initVerify((PublicKey) CacheData.KEY_CACHE.get("pubkey"));
		byte[] buff = Base64.decode(target.getBytes());
		sign.update(content.getBytes());
		return String.valueOf(sign.sign());
	}
}

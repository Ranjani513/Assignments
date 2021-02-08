package demo;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class crypto {
	public static String encrypt(byte[] key,byte[] key1,String value) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
		IvParameterSpec iv=new IvParameterSpec(key1);
		SecretKeySpec skey=new SecretKeySpec(key,"AES");
		Cipher ci=Cipher.getInstance("AES/CBC/PKCS5PADDING");
		ci.init(ci.ENCRYPT_MODE,skey,iv);
		byte[] e = ci.doFinal(value.getBytes("UTF-8"));
        String encoded = Base64.getEncoder().encodeToString(e);

		return encoded;
	}

	public static String decrypt(byte[] key, byte[] key1, String encryptrd) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		// TODO Auto-generated method stub
		IvParameterSpec iv=new IvParameterSpec(key1);
		SecretKeySpec skey=new SecretKeySpec(key,"AES");
		Cipher ci=Cipher.getInstance("AES/CBC/PKCS5PADDING");
		ci.init(ci.DECRYPT_MODE,skey,iv);
		
		byte[] original = ci.doFinal(Base64.getDecoder().decode(encryptrd));

		return new String(original);
	}

	public static void main(String[] args) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
		// TODO Auto-generated method stub
        SecureRandom sr=new SecureRandom();
        byte key[]=new byte[16];
        sr.nextBytes(key);
        byte key1[]=new byte[16];
        sr.nextBytes(key1);
        String e="how are you";
        String encryptrd=encrypt(key,key1,e);
        System.out.println(encryptrd);
        String decrypted=decrypt(key,key1,encryptrd);
        System.out.println(decrypted);
        
        
	}



}

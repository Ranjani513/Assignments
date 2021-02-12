package demo;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Signature;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class Keypair {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException {
		// TODO Auto-generated method stub
		String original="Ranjani";
		SecureRandom sr=new SecureRandom();
		   final KeyGenerator kpg=KeyGenerator.getInstance("DES");
		   kpg.init(sr);
		   SecretKey key=kpg.generateKey();
		 //  KeyPair kp=kpg.generateKeyPair();
		   final String cipherName = "DES/ECB/PKCS5Padding";
		   Cipher cipher = Cipher.getInstance(cipherName);
		   cipher.init(cipher.ENCRYPT_MODE,key);
		   final byte[] originalBytes = original.getBytes("UTF-8");
		  
			byte[] cipherTextBytes = cipher.doFinal(originalBytes);
			String encryptedstring = new String(cipherTextBytes, "UTF-8");
			System.out.println(encryptedstring);
/*
			Signature sig = Signature.getInstance("SHA256WithRSA");
			sig.initSign(kp.getPrivate());
			sig.update(originalBytes);
			cipher.init(cipher.DECRYPT_MODE, kp.getPrivate());
			byte[] decryptedBytes = cipher.doFinal(cipherTextBytes);
			String decryptedstring = new String(decryptedBytes, "UTF-8");
			System.out.println(decryptedstring);
*/
			
	}

}

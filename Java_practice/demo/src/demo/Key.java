package demo;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class Key {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException, SignatureException {
		// TODO Auto-generated method stub
		String original="Ranjani";
   final KeyPairGenerator kpg=KeyPairGenerator.getInstance("RSA");
   kpg.initialize(2048);
   KeyPair kp=kpg.generateKeyPair();
   final String cipherName = "rsa/ecb/oaepwithsha-256andmgf1padding";
   Cipher cipher = Cipher.getInstance(cipherName);
   cipher.init(cipher.ENCRYPT_MODE,kp.getPublic());
   final byte[] originalBytes = original.getBytes("UTF-8");
  
	byte[] cipherTextBytes = cipher.doFinal(originalBytes);
	String encryptedstring=new String(cipherTextBytes, "UTF-8");
	System.out.println(encryptedstring);
	Signature sig = Signature.getInstance("SHA256WithRSA");
	sig.initSign(kp.getPrivate());
	sig.update(originalBytes);
	cipher.init(cipher.DECRYPT_MODE, kp.getPrivate());
	byte[] decryptedBytes = cipher.doFinal(cipherTextBytes);
	String decryptedstring = new String(decryptedBytes, "UTF-8");
	System.out.println(decryptedstring);

	

	}

}

package demo;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class Signature1 {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException, SignatureException {
		// TODO Auto-generated method stub
		String original="Ranjani";
   final KeyPairGenerator kpg=KeyPairGenerator.getInstance("DSA");
   kpg.initialize(2048);
   KeyPair kp=kpg.generateKeyPair();
   final String cipherName = "dsa/ecb/oaepwithsha-256andmgf1padding";
//   Cipher cipher = Cipher.getInstance(cipherName);
 //  cipher.init(cipher.ENCRYPT_MODE,kp.getPublic());
//   final byte[] originalBytes = original.getBytes("UTF-8");
  
//	byte[] cipherTextBytes = cipher.doFinal(originalBytes);
	PrivateKey key=kp.getPrivate();
	
	Signature sig = Signature.getInstance("SHA256withDSA");
	sig.initSign(key);
	byte b[]=original.getBytes();
	sig.update(b);
	byte[] sign=sig.sign();
	System.out.println(sign);

	

	}

}

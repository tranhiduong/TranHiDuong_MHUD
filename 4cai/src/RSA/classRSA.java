/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RSA;

/**
 *
 * @author hoang hiep
 */
import java.io.FileInputStream;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import javax.swing.JOptionPane;
public class classRSA {
    private PublicKey publickey;
    private PrivateKey privatekey;
    private KeyPairGenerator keyGen;
    private KeyPair pair;

    public classRSA() throws NoSuchAlgorithmException {
        this.keyGen = KeyPairGenerator.getInstance("RSA");
        this.keyGen.initialize(1024);
        this.pair = this.keyGen.generateKeyPair();
        this.privatekey = pair.getPrivate();
        this.publickey = pair.getPublic();
    }
    
    public PublicKey getPK(){
        return publickey;
    }
    public PrivateKey getPriK(){
        return privatekey;
    }
    public byte []EnCrypt(byte []data){
        try {
            byte[] b= publickey.getEncoded();
            System.out.println(b);
            X509EncodedKeySpec spec = new X509EncodedKeySpec(b);
            System.out.println(spec);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            publickey = keyFactory.generatePublic(spec);
           Cipher cipher = Cipher.getInstance("RSA");            
           cipher.init(Cipher.ENCRYPT_MODE, publickey);
            return (cipher.doFinal(data));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể Mã hóa ",
                        "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }    
    }
    public byte []DeCrypt(byte []data, PrivateKey key){
        try {
          
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE, key);
            return cipher.doFinal(data);
        } catch (Exception e) {
            return null;
        }
    }
  
}

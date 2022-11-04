/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AES;

import java.security.Key;
import java.security.Security;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
/**
 *
 * @author hoang hiep
 */
public class classAES {
    private Key key;

    public Key getKey() {
        return key;
    }
    public byte []EnCrypt(byte []data){
        key = null;
        try {
           
            KeyGenerator kg = KeyGenerator.getInstance("AES");
            Cipher cipher = Cipher.getInstance("AES");
            key = kg.generateKey();
            cipher.init(Cipher.ENCRYPT_MODE, key);
            return (cipher.doFinal(data));
        } catch (Exception e) {
            return null;
        }
    }
    public byte []DeCrypt(byte []data, Key key){
        try {
       
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, key);
            return cipher.doFinal(data);
        } catch (Exception e) {
            return null;
        }
    }
}

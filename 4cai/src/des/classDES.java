/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package des;

import java.security.Key;
import java.security.Security;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

/**
 *
 * @author QuocTrong
 */
public class classDES {
     private Key key;

    public Key getKey() {
        return key;
    }
    public byte []EnCrypt(byte []data){
        key = null;
        try {
           
            KeyGenerator kg = KeyGenerator.getInstance("DES");
            Cipher cipher = Cipher.getInstance("DES");
            key = kg.generateKey();
            cipher.init(Cipher.ENCRYPT_MODE, key);
            return (cipher.doFinal(data));
        } catch (Exception e) {
            return null;
        }
    }
    public byte []DeCrypt(byte []data, Key key){
        try {
          //  KeyGenerator kg = KeyGenerator.getInstance("DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.DECRYPT_MODE, key);
            return cipher.doFinal(data);
        } catch (Exception e) {
            return null;
        }
    }
}

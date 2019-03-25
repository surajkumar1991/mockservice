package com.vuclip.ubs.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class VenisoHashUtils {

    private static String CIPHER_NAME = "AES/CBC/PKCS5PADDING";
    private static int CIPHER_KEY_LEN = 16; //128 bits

    private static Logger logger = LogManager.getLogger(VenisoHashUtils.class);

    public static String decrypt(String key, String data) {
        try {
            data = URLDecoder.decode(data, StandardCharsets.UTF_8.name());
            String[] parts = data.split(":");
            IvParameterSpec iv = new IvParameterSpec(Base64.getDecoder().decode(parts[1]));
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance(VenisoHashUtils.CIPHER_NAME);
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
            byte[] decodedEncryptedData = Base64.getDecoder().decode(parts[0]);
            byte[] original = cipher.doFinal(decodedEncryptedData);
            return new String(original);
        } catch (Exception ex) {
            logger.error("Exception while decrypt data from venios key {} data {}", key, data, ex);
        }

        return null;
    }


    public static String encrypt(String key, String data) {
        try {
            String iv = "RandomInitVector";
            if (key.length() < VenisoHashUtils.CIPHER_KEY_LEN) {
                int numPad = VenisoHashUtils.CIPHER_KEY_LEN - key.length();
                for (int i = 0; i < numPad; i++) {
                    key += "0"; //0 pad to len 16 bytes
                }
            } else if (key.length() > VenisoHashUtils.CIPHER_KEY_LEN) {
                key = key.substring(0, CIPHER_KEY_LEN); //truncate to 16 bytes
            }
            IvParameterSpec initVector = new IvParameterSpec(iv.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance(VenisoHashUtils.CIPHER_NAME);
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, initVector);
            byte[] encryptedData = cipher.doFinal((data.getBytes()));
            String base64_EncryptedData = Base64.getEncoder().encodeToString(encryptedData);
            String base64_IV = Base64.getEncoder().encodeToString(iv.getBytes("UTF-8"));
            return URLEncoder.encode(base64_EncryptedData + ":" + base64_IV, StandardCharsets.UTF_8.name());

        } catch (Exception ex) {
            logger.error("Exception while decrypt data from venios key {} data {}", key, data, ex);
        }
        return null;
    }
}

package com.cskt.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/**
 * 类名称: MD5
 * 类描述: TODO
 * 创建人: 李谟卓
 * 创建时间 2021/1/6
 *
 * @Version 1.0
 */
public class MD5 {
    /**
     * 加密方法
     * @param plainText 需要加密的字符串
     * @param length 加密完成后需要的长度
     * @return
     */
    public static String getMd5(String plainText, int length) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            byte b[] = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));
            }
        // 32位
        // return buf.toString();
        // 16位
        // return buf.toString().substring(0, 16);
            return buf.toString().substring(0, length);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 生成1111-9999之间的随机数
     * @return
     */
    public static int getRandomCode() {
        int max = 9999;
        int min = 1111;
        Random random = new Random();
        return random.nextInt(max) % (max - min + 1) + min;
    }

}

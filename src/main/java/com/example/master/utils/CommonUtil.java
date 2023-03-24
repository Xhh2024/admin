package com.example.master.utils;

import java.security.MessageDigest;

/**
 * 普通工具类
 * @author 谢环环
 * @date 2023/03/25
 */
public class CommonUtil {

    /**
     * MD5加密处理， 可以让别人在数据库看不了密码
     * 参考资料: https://baike.baidu.com/item/MD5/212708?fr=aladdin
     * @param data
     * @return
     */
    public static String MD5(String data)  {
        try {
            java.security.MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] array = md.digest(data.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte item : array) {
                sb.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString().toUpperCase();
        } catch (Exception exception) {
        }
        return null;
    }
}

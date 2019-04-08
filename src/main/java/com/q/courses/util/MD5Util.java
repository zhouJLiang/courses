package com.q.courses.util;

import org.springframework.util.DigestUtils;

/**
 * @Author zjl
 * @Date: 2019/4/8 16:46
 */
public class MD5Util {

    public static String toMd5(String id) {
        String encodeStr = DigestUtils.md5DigestAsHex(id.getBytes());
        return encodeStr;
    }

    public static boolean verifyKey(String id, String md5) {
        String key = toMd5(id);
        if (key.equals(md5)) {
            return true;
        } else
            return false;
    }
}

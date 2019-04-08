package com.q.courses;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

/**
 * @Author zjl
 * @Date: 2019/4/8 17:26
 */
@SpringBootTest
public class Md5Test {
    @Test
    public void md5(){
        String str = "123456";
        String encodeStr = DigestUtils.md5DigestAsHex(str.getBytes());
        System.out.println(encodeStr);
    }
}

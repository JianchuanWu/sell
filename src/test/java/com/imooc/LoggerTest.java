package com.imooc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by wujianchuan
 * 2017/9/10 20:35
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    @Test
    public void test1() {

        String name = "imooc";
        String password = "123456";
        log.info("name:{},password:{}", name, password);
        log.debug("debug...");
        log.error("error...");
    }
}

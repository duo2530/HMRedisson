package com.itheima.redisson;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.itheima.redisson.service.RMapCacheOpertions;

import lombok.SneakyThrows;

/**
 * @ClassName RMapCacheOpertionsTest.java
 * @Description TODO
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RMapCacheOpertionsTest {

    @Autowired
    RMapCacheOpertions rMapCacheOpertions;

    @SneakyThrows
    @Test
    public void rMapOperTest(){
        rMapCacheOpertions.rMapCache();
        Thread.sleep(6000000);
    }
}

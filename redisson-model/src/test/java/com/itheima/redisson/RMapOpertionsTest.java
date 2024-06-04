package com.itheima.redisson;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.itheima.redisson.service.RMapOpertions;

/**
 * @ClassName RMapOpertionsTest.java
 * @Description hash表操作
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RMapOpertionsTest {

    @Autowired
    RMapOpertions rMapOpertions;

    @Test
    public void rMapOperTest(){
        rMapOpertions.rMapOper();
    }
}

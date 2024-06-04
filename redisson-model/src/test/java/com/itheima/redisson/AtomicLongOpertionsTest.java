package com.itheima.redisson;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.itheima.redisson.service.AtomicLongOpertions;

/**
 * @ClassName AtomicLongOpertionsTest.java
 * @Description 原子整长型操作
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AtomicLongOpertionsTest {

    @Autowired
    AtomicLongOpertions atomicLongOpertions;

    @Test
    public void atomicLongOperTest(){
        atomicLongOpertions.atomicLongOper();
    }
}

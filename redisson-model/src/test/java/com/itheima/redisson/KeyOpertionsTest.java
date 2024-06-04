package com.itheima.redisson;


import com.itheima.redisson.service.KeyOpertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.api.RKeys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * KeyOpertionsTest
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class KeyOpertionsTest {

    @Autowired
    KeyOpertions keyOpertions;

    @Test
    public void foundedKeys() {
        keyOpertions.foundedKeys();
    }

    @Test
    public void deleteKeys(){
        keyOpertions.deleteKeys();
    }
}

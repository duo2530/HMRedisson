package com.itheima.redisson;

import com.itheima.redisson.service.RLockOpertions;
import lombok.SneakyThrows;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName RLockOpertionsTest.java
 * @Description 可重入锁操作测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RLockOpertionsTest {

    @Autowired
    RLockOpertions rLockOpertions;

    @Test
    public void  lockTest() throws InterruptedException{
        //模拟并发，2个线程同时强同一对象
        CountDownLatch countDownLatch = new CountDownLatch(2);
        new Thread("name-A"){
            @SneakyThrows
            public void run(){
                countDownLatch.countDown();
                rLockOpertions.lock();
            }
        }.start();
        new Thread("name-B"){
            @SneakyThrows
            public void run(){
                countDownLatch.countDown();
                rLockOpertions.lock();
            }
        }.start();
        countDownLatch.await();
        Thread.sleep(600000);
    }

    @Test
    public void  lockLaseTimeTest() throws InterruptedException{
        //模拟并发，2个线程同时强同一对象
        CountDownLatch countDownLatch = new CountDownLatch(2);
        new Thread("name-A"){
            @SneakyThrows
            public void run(){
                countDownLatch.countDown();
                rLockOpertions.lockLaseTime();
            }
        }.start();
        new Thread("name-B"){
            @SneakyThrows
            public void run(){
                countDownLatch.countDown();
                rLockOpertions.lockLaseTime();
            }
        }.start();
        countDownLatch.await();
        Thread.sleep(600000);
    }

    @Test
    public void  tryLockTest() throws InterruptedException {
        //模拟并发，2个线程同时强同一对象
        CountDownLatch countDownLatch = new CountDownLatch(2);
        new Thread("name-A"){
            @SneakyThrows
            public void run(){
                countDownLatch.countDown();
                rLockOpertions.tryLock();
            }
        }.start();
        new Thread("name-B"){
            @SneakyThrows
            public void run(){
                countDownLatch.countDown();
                rLockOpertions.tryLock();
            }
        }.start();
        countDownLatch.await();
        Thread.sleep(600000);
    }


    @Test
    public void tryLockWaitTimeTest() throws InterruptedException {
        //模拟并发，2个线程同时强同一对象
        CountDownLatch countDownLatch = new CountDownLatch(2);
        new Thread("name-A"){
            @SneakyThrows
            public void run(){
                countDownLatch.countDown();
                rLockOpertions.tryLockWaitTime();
            }
        }.start();
        new Thread("name-B"){
            @SneakyThrows
            public void run(){
                countDownLatch.countDown();
                rLockOpertions.tryLockWaitTime();
            }
        }.start();
        countDownLatch.await();
        Thread.sleep(600000);
    }

    @Test
    public void tryLockleasTimeTimeTest() throws InterruptedException {
        //模拟并发，5个线程同时强同一对象
        CountDownLatch countDownLatch = new CountDownLatch(5);
        new Thread("name-A"){
            @SneakyThrows
            public void run(){
                countDownLatch.countDown();
                rLockOpertions.tryLockleasTime();
            }
        }.start();
        new Thread("name-B"){
            @SneakyThrows
            public void run(){
                countDownLatch.countDown();
                rLockOpertions.tryLockleasTime();
            }
        }.start();
        new Thread("name-C"){
            @SneakyThrows
            public void run(){
                countDownLatch.countDown();
                rLockOpertions.tryLockleasTime();
            }
        }.start();
        new Thread("name-D"){
            @SneakyThrows
            public void run(){
                countDownLatch.countDown();
                rLockOpertions.tryLockleasTime();
            }
        }.start();
        new Thread("name-E"){
            @SneakyThrows
            public void run(){
                countDownLatch.countDown();
                rLockOpertions.tryLockleasTime();
            }
        }.start();
        countDownLatch.await();
        Thread.sleep(600000);
    }

}

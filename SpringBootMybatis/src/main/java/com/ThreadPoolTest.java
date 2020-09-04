package com;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Wang
 * @date 2020-09-03
 * 测试线程池
 */
public class ThreadPoolTest {

    private static ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
            .setNameFormat("demo-pool-%d").build();

    /**
     * 创建线程池
     */
    private static ExecutorService pool = new ThreadPoolExecutor(5, 200,
            1000L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<Runnable>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
    /**
     * 任务数量
     */
    private static final Integer TASK_COUNT = 2000;

    /**
     * 票总数
     */
    private static Integer ticket = 100;

    public static void main(String[] args) {

        /**
         * 公平锁
         */
        Lock lock = new ReentrantLock(true);


        for (int i = 0; i < TASK_COUNT; i++) {
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    lock.lock();
                    try {
                        if (ticket > 0) {
                            ticket--;
                            System.out.println("票数还有" + ticket + "张");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } finally {
                        lock.unlock();
                    }

                }
            });
        }
    }
}

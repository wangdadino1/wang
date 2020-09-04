package com.wang;

import java.sql.SQLOutput;

/**
 * @author WangXian
 * @version v1.0
 * @date 2020-08-06
 * 模拟双十一商品抢购
 */
public class Test{


    /**
     * 乔丹鞋数量
     */
    private static   Integer jordanShoes = 10000;

    /**
     * 耐克鞋数量
     */
    private  static Integer nike = 10000;
    /**
     * 李宁鞋数量
     */
    private  static Integer liNing = 20000;
    /**
     * 抢鞋的人数
     */
    private final static Integer PEOPLE_COUNT = 200000;

    /**
     * 线程数
     */
    private final static Integer THREAD_COUNT = 10;

    public static void main(String[] args) {
        while (jordanShoes>0){
        for(int i=0;i<THREAD_COUNT;i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (this) {
                        if(jordanShoes>0) {
                            jordanShoes--;
                            System.out.println("乔丹鞋还剩" + jordanShoes + "双！");
                        }
                    }
                }
            });
            thread.start();
        }
        }
    }

}

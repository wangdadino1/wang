package com.wang;

import java.sql.SQLOutput;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author WangXian
 * @date 2020-08-06
 */
public class Ticket implements Runnable{

    /**
     * 票总数
     */
    //private  static  Integer tickets = 1000;

    AtomicInteger tickets = new AtomicInteger(0);

    private  final Integer allTicket =1000;
    @Override
    public void run() {
     sellTickets();
    }

    public  void sellTickets(){
        if (tickets.get()<allTicket){
            tickets.getAndIncrement();
            System.out.println(Thread.currentThread().getName() + "抢到了" + "1张票，余票还剩" + (allTicket-tickets.get()) + "张");
        }
    }
}

package thread.control.test;

import util.MyLogger;

import static util.MyLogger.*;
import static util.ThreadUtils.sleep;

public class JoinTest1Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyTask(), "t1");
        Thread t2 = new Thread(new MyTask(), "t2");
        Thread t3 = new Thread(new MyTask(), "t3");

        // t1 : 1
        // sleep(1000)
        // t1 : 2
        // sleep(1000)
        // t1 : 3
        // sleep(1000)
        t1.start(); //3초
        t1.join();

        //t2 : 1
        // sleep(1000)
        //t2 : 2
        // sleep(1000)
        //t2 : 3
        // sleep(1000)
        t2.start(); //3초
        t2.join();

        //t3 : 1
        // sleep(1000)
        //t3 : 2
        // sleep(1000)
        //t3 : 3
        // sleep(1000)
        t3.start(); //3초
        t3.join();
    }

    static class MyTask implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                log(i);
                sleep(1000);
            }
        }
    }
}

package thread.executor.reject;

import thread.executor.RunnableTask;
import util.MyLogger;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

import static util.MyLogger.*;

public class RejectMainV4 {
    public static void main(String[] args) {

        // CallerRunsPolicy 정책 - 작업을 요청 한 스레드가 요청 초과 시 본인이 대신 task 수행
        // 작업의 생산 속도가 너무 빠르다면, 해당 정책을 사용하면 느려짐으로써 생산 속도를 조절할 수 있다.
        ExecutorService executor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS,
                new SynchronousQueue<>(), new MyRejectedExecutionHandler());

        executor.submit(new RunnableTask("task1"));
        executor.submit(new RunnableTask("task2"));
        executor.submit(new RunnableTask("task3"));
        executor.submit(new RunnableTask("task4"));


        executor.close();

    }

    static class MyRejectedExecutionHandler implements RejectedExecutionHandler {

        // 실패한 요청의 누적 작업 로그

        static AtomicInteger count = new AtomicInteger(0);

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            int i = count.incrementAndGet();
            log("[경고] 거절된 누적 작업 수: " + i);
        }
    }
}

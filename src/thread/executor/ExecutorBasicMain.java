package thread.executor;

import util.MyLogger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static thread.executor.ExecutorUtils.*;
import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class ExecutorBasicMain {
    public static void main(String[] args) {
        ExecutorService es = new ThreadPoolExecutor(2, 2, 0, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>());
        log("== 초기 상태 ==");
        printState(es);

        es.execute(new RunnableTask("taskA")); // BlockingQueue에 보관, 스레드 1 생성
        es.execute(new RunnableTask("taskB")); // BlockingQueue에 보관, 스레드 2 생성
        es.execute(new RunnableTask("taskC")); // BlockingQueue에 보관
        es.execute(new RunnableTask("taskD")); // BlockingQueue에 보관
        log("== 작업 수행 중 ==");
        printState(es);

        sleep(3000);
        log("== 작업 수행 완료 ==");


        printState(es);

        es.close();
        log("== shutdown 완료 ==");
        printState(es);




    }
}

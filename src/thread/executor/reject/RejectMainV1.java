package thread.executor.reject;

import thread.executor.RunnableTask;
import util.MyLogger;

import java.util.concurrent.*;

import static util.MyLogger.*;

public class RejectMainV1 {
    public static void main(String[] args) {

        // 기본 정책 AbortPolicy() - RejectedExecutionException 예외 발생
        ExecutorService executor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS,
                new SynchronousQueue<>(), new ThreadPoolExecutor.AbortPolicy());

        executor.submit(new RunnableTask("task1"));

        try {
            executor.submit(new RunnableTask("task2"));
        } catch (RejectedExecutionException e) {
            log("요청 초과");
            // 포기, 다시 시도 등 다양한 고민을 하면 된다.
            log(e);
        }

        executor.close();

    }
}

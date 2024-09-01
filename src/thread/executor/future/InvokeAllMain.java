package thread.executor.future;

import thread.executor.CallableTask;
import util.MyLogger;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static util.MyLogger.log;

public class InvokeAllMain {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(10);

        CallableTask task1 = new CallableTask("task1", 1000);
        CallableTask task2 = new CallableTask("task2", 2000);
        CallableTask task3 = new CallableTask("task3", 3000);

        List<CallableTask> tasks = List.of(task1, task2, task3);
        List<Future<Integer>> futures = es.invokeAll(tasks);

        for (Future<Integer> future : futures) {
            Integer value = future.get(); //모든 작업이 끝나야 return
            log("value = " + value);
        }

        es.close();
    }
}

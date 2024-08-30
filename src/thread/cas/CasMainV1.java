package thread.cas;

import java.util.concurrent.atomic.AtomicInteger;

public class CasMainV1 {
    public static void main(String[] args) {

        AtomicInteger atomicInteger = new AtomicInteger(0);

        System.out.println("start value = " + atomicInteger.get());

        boolean result1 = atomicInteger.compareAndSet(0, 1);//값이 0이면 1로 셋팅
        System.out.println("result1 = " + result1 + ", value = " + atomicInteger.get());

        boolean result2 = atomicInteger.compareAndSet(0, 1);//값이 0이면 1로 셋팅
        System.out.println("result2 = " + result2 + ", value = " + atomicInteger.get());


    }
}

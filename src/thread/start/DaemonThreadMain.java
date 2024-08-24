package thread.start;

public class DaemonThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");
        DaemondThread daemondThread = new DaemondThread();
        daemondThread.setDaemon(true); // 데몬 스레드 여부
        daemondThread.start();
        System.out.println(Thread.currentThread().getName() + ": main() end");
    }

    static class DaemondThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": run()");

            try {
                Thread.sleep(10000); //10초간 실행 후 종료
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + ": end()");

        }
    }
}

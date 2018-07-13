package thread.interrupt;

public class InterruptExample {
    private static class MyTread extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
                System.out.println("Thread run");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread myTread = new MyTread();
        myTread.start();
        myTread.interrupt();
        System.out.println("Main run");
        /*
         * 通过调用一个线程的 interrupt() 来中断该线程，
         * 如果该线程处于阻塞、限期等待或者无限期等待状态，
         * 那么就会抛出 InterruptedException，从而提前结束该线程
         * */
    }
}

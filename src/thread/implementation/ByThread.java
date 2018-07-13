package thread.implementation;

public class ByThread extends Thread{
    // Thread同样拓展了Runnable接口
    public void run() {
        System.out.println("Running...");
    }

    public static void main(String[] args) {
        ByThread thread = new ByThread();
        thread.start();
    }
}

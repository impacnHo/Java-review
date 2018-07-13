package thread.implementation;
/**
 * 创建线程的方法1：实现Runnable接口
 * 通过调用Thread的start()方法启用线程
 * */
public class ByRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Running...");
    }

    public static void main(String[] args) {
        ByRunnable instance = new ByRunnable();
        Thread thread = new Thread(instance);
        thread.start();
    }
}

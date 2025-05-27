class MyThread extends Thread {
    private String message;

    public MyThread(String msg) {
        this.message = msg;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message + " - iteration " + (i + 1));
            try {
                Thread.sleep(200); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");

        t1.start();
        t2.start();
    }
}

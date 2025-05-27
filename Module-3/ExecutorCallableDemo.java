import java.util.concurrent.*;

public class ExecutorCallableDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Callable<String> task = () -> {
            Thread.sleep(1000);
            return "Task completed by " + Thread.currentThread().getName();
        };

        Future<String> future1 = executor.submit(task);
        Future<String> future2 = executor.submit(task);

        System.out.println(future1.get());
        System.out.println(future2.get());

        executor.shutdown();
    }
}


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
  public static void main(String[] args){
    Runnable task1 = () -> {
      System.out.println("1 : " + Thread.currentThread().getName());
    };
    Runnable task2 = () -> {
      System.out.println("2 : " + Thread.currentThread().getName());
    };
    Runnable task3 = () -> {
      System.out.println("3 : " + Thread.currentThread().getName());
    };
    Runnable task4 = () -> {
      System.out.println("4 : " + Thread.currentThread().getName());
    };
    Runnable task5 = () -> {
      System.out.println("5 : " + Thread.currentThread().getName());
    };

    ExecutorService exc = Executors.newFixedThreadPool(2);
    exc.submit(task1);
    exc.submit(task2);
    exc.submit(task3);
    exc.submit(task4);
    exc.submit(task5);
    exc.shutdown();
  }
}

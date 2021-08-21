import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
  int cnt = 0;
  ReentrantLock rl = new ReentrantLock();

  public void inc(){
    rl.lock();
    try{
      cnt++;
    } finally{
      rl.unlock();
    }
  }
  public void dec(){
    rl.lock();
    try{
      cnt--;
    } finally{
      rl.unlock();
    }
  }
  public int getCnt(){ return cnt; }
}

public class MutualAccessReentrantLock {
  public static void main(String[] args) throws InterruptedException{
    Counter c = new Counter();

    Runnable task1 = () -> {
      for(int i=0; i<1000; i++)
        c.inc();
    };
    Runnable task2 = () -> {
      for(int i=0; i<1000; i++)
        c.dec();
    };

    ExecutorService exc = Executors.newFixedThreadPool(2);
    exc.submit(task1);
    exc.submit(task2);
    exc.shutdown();
    exc.awaitTermination(100, TimeUnit.SECONDS);
    System.out.println(c.getCnt());
  }
}
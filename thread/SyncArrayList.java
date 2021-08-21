import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

public class SyncArrayList {
  public static void main(String[] args) throws InterruptedException{
    List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());
    for(int i=0; i<10; i++)
      list.add(i);
    System.out.println(list);

    Runnable task = () -> {
      synchronized(list){
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext())
          it.set(it.next() + 1);
      }
    };
    ExecutorService exc = Executors.newFixedThreadPool(3);
    exc.submit(task);
    exc.submit(task);
    exc.submit(task);
    exc.shutdown();
    exc.awaitTermination(100, TimeUnit.SECONDS);
    System.out.println(list);
  }
}

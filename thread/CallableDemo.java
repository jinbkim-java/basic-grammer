import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
 public static void main(String[] args) throws InterruptedException, ExecutionException{
  Callable<Integer> task = () -> {
    int sum = 0;
    for(int i=0; i<10; i++)
      sum += i;
    return sum;
  };
  ExecutorService exc = Executors.newSingleThreadExecutor();
  Future<Integer> fu = exc.submit(task);

  Integer ret = fu.get();
  System.out.println(ret);
  exc.shutdown();
 }
}
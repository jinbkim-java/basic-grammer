class Counter {
  int cnt = 0;

  public void inc(){
    synchronized(this){
      cnt++;
    }
  }
  public void dec(){
    synchronized(this){
      cnt--;
    }
  }
  public int getCnt(){ return cnt; }
}

public class MutualAccess {
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

    Thread t1 = new Thread(task1);
    Thread t2 = new Thread(task2);
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    System.out.println(c.getCnt());
  }
}
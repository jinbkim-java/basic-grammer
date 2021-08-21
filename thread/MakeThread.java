public class MakeThread {
  public static void main(String[] args){
    Runnable task1 = () -> {
      try{
        System.out.println("Thread name : " + Thread.currentThread().getName());
        for(int i=0; i<5; i++){
          System.out.print(i + " ");
          Thread.sleep(10);
        }
      }
      catch(InterruptedException e){
        e.printStackTrace();
      }
    };
    Runnable task2 = () -> {
      try{
        System.out.println("Thread name : " + Thread.currentThread().getName());
        for(int i=10; i<15; i++){
          System.out.print(i + " ");
          Thread.sleep(10);
        }
      }
      catch(InterruptedException e){
        e.printStackTrace();
      }
    };
  Thread t1 = new Thread(task1);
  Thread t2 = new Thread(task2);
  t1.start();
  t2.start();
  }
}
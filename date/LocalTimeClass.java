import java.time.Duration;
import java.time.LocalTime;


public class LocalTimeClass {
  public static void main(String[] args){
   LocalTime now = LocalTime.now();
   System.out.println("현재시간 : " + now);

   LocalTime start = LocalTime.of(10,20,30);
   System.out.println("시작시간 : " + start);

   LocalTime end = LocalTime.of(12,30,40);
   System.out.println("끝난시간 : " + end);

   Duration between = Duration.between(start, end);
   System.out.println("이용시간 : " + between);
  }
}
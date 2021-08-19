import java.time.Instant;
import java.time.Duration;
import java.util.List;
import java.util.Arrays;

public class InstantClass {
  public static long fibo(long n) {
    if (n == 1 || n == 2)
      return 1;
    return fibo(n - 1) + fibo(n - 2);
  }

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(44, 45, 46);
    Instant start = Instant.now();  // 스톱워치 시작
    list.stream()  // 순차 스트림 생성
      .map(n -> fibo(n))
      .forEach(n -> System.out.println(n));

    Instant end = Instant.now();  // 스톱워치 멈춤
    Duration between = Duration.between(start, end);  // 시각차 객체
    System.out.println("sequential : " + between.toSeconds());
    System.out.println();
    
    start = Instant.now();
    list.parallelStream()  // 병렬 스트림 생성
      .map(n -> fibo(n))
      .forEach(n -> System.out.println(n));
    System.out.println();

    end = Instant.now();
    between = Duration.between(start, end);
    System.out.println("parallel : " + between.toSeconds());

  }
}

import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamExample2 {
  public static void main(String[] args) {
    Stream.of("jinbkim", "hjung", "juhlee")
      .sorted((s1, s2) -> s1.length() - s2.length()) // 정렬기준
      .forEach(s -> System.out.print(s + " "));
    System.out.println();

    // 최종 연산이 존재하지 않아 중간 연산도 진행되지 않음
    IntStream.of(1, 2, 3)
      .peek(s -> System.out.print(s + " "));
    IntStream.of(4, 5, 6)
      .peek(s -> System.out.print(s + " "))
      .sum();
    System.out.println();
  
    int[] numbers = { 1, 2, 3, 4, 5 };
    if (IntStream.of(numbers).allMatch(n -> n % 2 == 0))
      System.out.println("모두 짝수.");
    if (IntStream.of(numbers).anyMatch(n -> n % 2 == 0))
      System.out.println("짝수가 하나 이상 존재함.");
    if (IntStream.of(numbers).noneMatch(n -> n % 2 == 0))
      System.out.println("짝수가 하나도 없음.");
    
    String[] friends = {"jinbkim", "hjung", "juhlee"};
    Stream<String> ss = Arrays.stream(friends);
    List<String> st = ss
      .filter(s -> s.length()<6)  // 6자 미만 문자열 걸러냄
      .collect(  // 걸러낸 문자열로 스트림 생성
        () -> new ArrayList<>(),  // 데이터를 저장할 저장소
        (c, s) -> c.add(s),  // c : 첫번째 인자를 통해 생성된 객체, s : 스트림
        (list1, list2) -> list1.addAll(list2)  // 의미 없는 람다식
      );
    System.out.println(st);

    ss = Arrays.stream(friends);
    List<String> st2 = ss
      .parallel()  // 병렬스트림
      .filter(s -> s.length()<6)  // 6자 미만 문자열 걸러냄
      .collect(  // 걸러낸 문자열로 스트림 생성
        () -> new ArrayList<>(),  // 데이터를 저장할 저장소
        (c, s) -> c.add(s),  // c : 첫번째 인자를 통해 생성된 객체, s : 스트림
        (list1, list2) -> list1.addAll(list2)  // 데이터를 하나로 묶는 과정
      );
  System.out.println(st2);
  }
}

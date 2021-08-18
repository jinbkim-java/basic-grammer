import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class StreamExample {
  public static void main(String[] args){
    String[] names1 = {"jinbkim", "hjung"};
    Arrays.stream(names1)  // 배열에 저장된 데이터를 대상으로 스트림 생성
      .filter(s -> s.length() > 5)   // 조건에 따라 데이터 일부를 걸러냄
      .forEach(s -> System.out.print(s + " "));
    System.out.println();

    List<String> list = Arrays.asList(names1);  
    list.stream()  // 리스트에 저장된 데이터를 대상으로 스트림 생성
      .map(s -> s.length())  // 매핑된 새로운 스트림 생성
      .forEach(s -> System.out.print(s + " "));
    System.out.println();

    String[] names2 = {"juhlee", "seokim"};
    List<String> list2 = Arrays.asList(names2);  
    list2.stream()
      .flatMap(s -> Stream.of(s.length()))
      .forEach(s -> System.out.print(s + " "));
    System.out.println();
    
    // 데이터를 축소하는 연산
    BinaryOperator<String> bop = (s1, s2) -> {
      if (s1.length() < s2.length())
        return s2;
      else
        return s1;
    };
    System.out.println(list.stream().reduce("", bop));  // 제일 길이가 긴 문자열만 남음
    
    Stream<String> st1 = Stream.of(names1);
    Stream<String> st2 = Stream.of(names2);
    // 두개의 스트림을 연결하여 하나의 스트림 생성
    Stream.concat(st1, st2).forEach(s -> System.out.print(s + " "));
  }
}
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class CopyCollection {
  public static void main(String[] args){
    List<String> src = Arrays.asList("jinbkim", "hjung", "juhlee"); 
    List<String> dest = new ArrayList<>(src);  // 복사본 만들기
    Collections.sort(dest);
    System.out.println((dest));

    Collections.copy(dest, src);  // dest에 src에 저장된 내용으로 덮어씀
    System.out.println((dest));
  }
}
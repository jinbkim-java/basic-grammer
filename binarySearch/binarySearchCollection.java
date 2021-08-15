import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StrCmp implements Comparator<String> {
  @Override
  public int compare(String s1, String s2){
    return s2.compareToIgnoreCase(s1);  // 대소문자 구분없이 내림차순 정렬
  }
}

public class binarySearchCollection {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("jinbkim");
    list.add("hjung");
    list.add("juhlee");
    list.add("seokim");
    Collections.sort(list);
    int idx = Collections.binarySearch(list, "jinbkim");
    System.out.println(idx + ": " + list.get(idx));

    Collections.sort(list, new StrCmp());
    idx = Collections.binarySearch(list, "jinbkim", new StrCmp());
    System.out.println(idx + ": " + list.get(idx));
  }
}
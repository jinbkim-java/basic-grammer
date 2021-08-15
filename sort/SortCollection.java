import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;

class Man implements Comparable<Man> {
  private String name;

  public Man(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }

  @Override
  public int compareTo(Man m) {
    return this.name.compareTo(m.name); // 오름차순으로 정렬
  }
}

class Student extends Man {
  private int score;

  public Student(String name, int score) {
    super(name);
    this.score = score;
  }

  @Override
  public String toString() {
    return "<" + super.toString() + ", " + score + ">";
  }
}

public class SortCollection {
  public static void main(String[] args) {
    List<Student> list = new ArrayList<>();
    list.add(new Student("jinbkim", 100));
    list.add(new Student("hjung", 90));
    list.add(new Student("juhlee", 80));
    Iterator<Student> it;
    for (it = list.iterator(); it.hasNext();)
      System.out.println(it.next().toString());
    System.out.println();

    Collections.sort(list); // 오름차순으로 정렬
    for (it = list.iterator(); it.hasNext();)
      System.out.println(it.next().toString());
    System.out.println();
  }
}
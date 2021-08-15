import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Man {
  protected String name;

  public Man(String name){
    this.name = name;
  }

  @Override
  public String toString(){
    return name;
  }
}

class ManCmp implements Comparator<Man>{
  @Override
  public int compare(Man m1, Man m2){
    return m1.name.compareTo(m2.name);  // 오름차순으로 정렬
  }
}

class Student extends Man {
  private int score;

  public Student(String name, int score){
    super(name);
    this.score = score;
  }

  @Override
  public String toString(){
    return "<" + super.toString() + ", " + score + ">";
  }
}

public class SortCollection2 {
  public static void main(String[] args) {
    List<Student> list = new ArrayList<>();
    list.add(new Student("jinbkim", 100));
    list.add(new Student("hjung", 90));
    list.add(new Student("juhlee", 80));
    Iterator<Student> it;
    for (it = list.iterator(); it.hasNext();)
      System.out.println(it.next().toString());
    System.out.println();

    Collections.sort(list, new ManCmp()); // 오름차순으로 정렬
    for (it = list.iterator(); it.hasNext();)
      System.out.println(it.next().toString());
    System.out.println();  
  }
}

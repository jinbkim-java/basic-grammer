import java.util.HashSet;
import java.util.Iterator;

class Man {
	String name;
	int age;

	public Man(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return ("< " + name + " " + age + " >");
	}

	@Override
	public boolean equals(Object obj) {
		if (name == ((Man)obj).name && age == ((Man)obj).age)
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
			return java.util.Objects.hash(name, age);  // 전달된 인자  기반의 해쉬값 반환
	}
}

public class Hash {
	public static void main(String[] args) {
		HashSet<Man> set = new HashSet<>();  // HashSet 기본생성자
		// 해쉬셋에 객체 저장
		set.add(new Man("jinbkim", 27));
		set.add(new Man("jinbkim", 27));  // 데이터 중복 저장 허용 X
		set.add(new Man("hjung", 27));
		set.add(new Man("juhlee", 25));
		for(Man m : set)
			System.out.println(m.toString() + ' ');
	}
}
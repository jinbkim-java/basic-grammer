import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class Man implements Comparable<Man> {
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
	public int compareTo(Man m) {
		if (this.name != m.name)
			return this.name.compareTo(m.name);  // 이름 오름차순
		else  // 이름이 같으면
			return this.age - m.age;  // 나이 오름차순
	}
}

class ManComparator implements Comparator<Man>{
	public int compare(Man m1, Man m2) {
		if (m1.name != m2.name)
			return m2.name.compareTo(m1.name); // 이름 내림차순
		else
			return m2.age - m1.age;  // 나이 내림차순
	}
}

public class Tree {
	public static void main(String[] args) {
		TreeSet<Man> tree = new TreeSet<>(new ManComparator());  // ManComparator : 정렬기준
		tree.add(new Man("jinbkim", 27));
		tree.add(new Man("jinbkim", 26));
		tree.add(new Man("hjung", 27));
		tree.add(new Man("juhlee", 25));
		Iterator<Man> it;
		for (it = tree.iterator(); it.hasNext();)
			System.out.print(it.next().toString() + ' ');
		System.out.println();

		TreeSet<Man> tree2 = new TreeSet<>();
		tree2.add(new Man("jinbkim", 27));
		tree2.add(new Man("jinbkim", 26));
		tree2.add(new Man("hjung", 27));
		tree2.add(new Man("juhlee", 25));
		for (it = tree2.iterator(); it.hasNext();)
			System.out.print(it.next().toString() + ' ');
		System.out.println();
	}
}
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.ListIterator;

public class list {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();  // ArrayList 기본생성자
		// 리스트에 객체 저장
		list.add("jinbkim");
		list.add("jinbkim");
		list.add("hjung");
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + ' ');
		System.out.println();

		list = new LinkedList<>(list);  // 리스트 객체를 인자로 받는 LinkedList 생성자
		for (String s : list)
			System.out.print(s + ' ');
		System.out.println();

		Iterator<String> it = list.iterator();  // 단방향 반복자의 맨앞
		while (it.hasNext())  // next() 메소드가 반환할 대상이 있는지
			if (it.next() == "jinbkim")  // next() : 다음 객체의 참조 값을 반환
				it.remove();
		for (it = list.iterator(); it.hasNext();)
			System.out.print(it.next() + ' ');
		System.out.println();

		list = Arrays.asList("jinbkim", "hjung", "juhlee");
		ListIterator<String> it2 = list.listIterator();  // 양방향 반복자의 맨앞
		while (it2.hasNext())
			System.out.print(it2.next() + ' ');
		System.out.println();

		while (it2.hasPrevious())  // previous() 메소드가 반환할 대상이 있는지
			System.out.print(it2.previous() + ' ');  // previous() : 이전 객체의 참조 값을 반환
		System.out.println();
	}
}
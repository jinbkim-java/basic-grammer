import java.util.Deque;
import java.util.ArrayDeque;

public class ArrayDequeCollection {
	public static void main(String[] args){
		Deque<String> d = new ArrayDeque<>();  // 리스트를 기반으로 하는 덱 구현
		// 덱 앞에서 객체 넣기
		d.offerFirst("jinbkim");  
		d.offerFirst("hjung");
		System.out.println(d.pollFirst());  // 덱 앞에서 객체 꺼내기

		d.offerLast("juhlee");  // 덱 뒤에서 객체 넣기
		System.out.println(d.pollLast());  // 덱 뒤에서 객체 꺼내기
	}
}

import java.util.Queue;
import java.util.LinkedList;

public class LinkedListQueue{
	public static void main(String[] args){
		Queue<String> q = new LinkedList<>();  // 연결리스트로 큐 구현
		// 큐에 객체 넣기
		q.offer("jinbkim");
		q.offer("hjung");
		q.offer("juhlee");
		
		System.out.println("q.poll() : " + q.poll());  // 큐의 맨앞 꺼내기
		System.out.println("q.peek() : " + q.peek());  // 큐의 맨앞 확인
		
	}
}
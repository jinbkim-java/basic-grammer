import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class HashMapCollection {
	public static void main(String[] args){
		HashMap<Integer, String> map = new HashMap<>();
		// Key-Value 기반으로 데이터 저장
		map.put(1, "jinbkim");
		map.put(3, "juhlee");
		map.put(2, "hjung");
		System.out.println("map.get(1) : " + map.get(1));  // Key가 1인 데이터 탐색

		map.remove(1);  // Key가 1인 데이터 제거
		System.out.println("map.get(1) : " + map.get(1));  // Key가 1인 데이터 탐색

		// 여기에 모든 key를 담아서 반환
		// 이를 통한 순차적 접근 가능
		Set<Integer> ks = map.keySet();
		for (Integer k : ks)
			System.out.println("<" + k.toString() + ", " + map.get(k) + ">");

		// Set은 Iterable을 상속하므로 반복자를 얻어 순차적 접근 가능
		Iterator<Integer> it;
		for(it=ks.iterator(); it.hasNext();)
			System.out.print(map.get(it.next()) + ' ');
	}
}

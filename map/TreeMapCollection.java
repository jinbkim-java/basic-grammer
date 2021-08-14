import java.util.TreeMap;
import java.util.Set;
import java.util.Comparator;
import java.util.TreeMap;

class cmp implements Comparator<Integer>{
	public int compare(Integer n1, Integer n2){
		return n2.intValue() - n1.intValue();  // 내림차순 정렬
	}
}

public class TreeMapCollection {
	public static void main(String[] args){
		TreeMap<Integer, String> map = new TreeMap<>();
		// 정렬 상태를 유지
		map.put(1, "jinbkim");
		map.put(3, "juhlee");
		map.put(2, "hjung");
		Set<Integer> ks = map.keySet();
		for (Integer k : ks)
			System.out.println("<" + k.toString() + ", " + map.get(k) + ">");
		System.out.println();

		map = new TreeMap<>(new cmp());  // 내림차순 정렬
		map.put(1, "jinbkim");
		map.put(3, "juhlee");
		map.put(2, "hjung");
		ks = map.keySet();
		for (Integer k : ks)
			System.out.println("<" + k.toString() + ", " + map.get(k) + ">");
	}
}

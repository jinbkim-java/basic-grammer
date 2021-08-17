import java.util.function.Supplier;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class SupplierInterface {
	public static List<Integer> makeList(Supplier<Integer> s, int n){
		List<Integer> list = new ArrayList<>();
		for (int i=0; i<n; i++)
			list.add(s.get());
		return list;
	}
	
	public static void main(String[] args){
		Supplier<Integer> s = () -> {
			Random rand = new Random();
			return rand.nextInt(5);
		};

		List<Integer> list = makeList(s, 10);
		System.out.println(list);
	}
}

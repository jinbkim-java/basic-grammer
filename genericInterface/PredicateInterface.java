import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterface {
	// p : boolean test(T t)
	public static int sumTotal(Predicate<Integer> p, List<Integer> list){
		int total = 0;
		for (int n : list)
			if (p.test(n))
				total += n;
		return total;
	}
	
	public static void main(String[] args){
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		int s;
		s = sumTotal(n -> n%2 == 0, list);
		Sysytem.out.println("Even Total : " + s);
		s = sumTotal(n -> n%2 != 0, list);
		System.out.println("Odd Total : " + s);
	}
}
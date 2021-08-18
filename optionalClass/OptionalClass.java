import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args){
		Optional<String> op1 = Optional.of("jinbkim");  // Optional 객체 생성
		if(op1.isPresent())  // Optional 객체에 내용물이 있는지 없는지 확인
			System.out.println(op1.get());

		Optional<String> op2 = Optional.ofNullable("hjung");  // Optional 객체 생성
		op2.ifPresent(s -> System.out.println(s));  // Optional 객체의 내용물이 있으면 accept 메소드 호출

		// apply 메소드가 반환하는 대상을 자동적으로 Optional 객체에 담아서 반환됨
		Optional<String> op3 = op1.map(s -> s.toUpperCase()).map(s -> s.replace('I', '_'));
		System.out.println(op3.get());

		Optional<String> op4 = Optional.empty();  // 빈 Optional 객체 생성
		System.out.println(op4.map(s -> s.toString()).orElse("Empty~"));

		// apply 메소드가 반환하는 대상을 Optional 객체로 직접 감싸서 반환해야 함
		Optional<String> op5 = op3.flatMap(s -> Optional.of(s.toLowerCase()));
		System.out.println(op5.get());
	}
}
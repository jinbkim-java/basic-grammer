class Man {
	String name;

	public Man(String name) {
		this.name = name;
	}

	public void introduce() {
		System.out.println("name : " + name);
	}
}

class Student extends Man {
	int score;

	public Student(String name, int score) {
		super(name);  // 부모 클래스의 생성자 호출
		this.score = score;
	}

	@Override  // 부모클래스에 introduce 메소드가 없다면 에러
	public void introduce() {
		super.introduce();  // 부모 클래스의 introduce 메소드 호출
		System.out.println("score : " + score);
	}
}

public class OverrideAnnotation {
	public static void main(String[] args) {
		Man m = new Man("jinbkim");
		Student s = new Student("hjung", 100);

		m.introduce();
		System.out.println();
		s.introduce();
	}
}
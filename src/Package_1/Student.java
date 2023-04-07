package Package_1;

public class Student extends Person {
	private int grade;
	
	public int getSal() {
		return grade;
	}
	public Student(String name, int age, int height, int weight, int grade) {
		super(name, age, height, weight);
		this.grade = grade;
	}
	public void studentInfo() {
		System.out.println("이름:" + getName());
		System.out.println("나이:" + getAge());
		System.out.println("키:" + getHeight());
		System.out.println("몸무게:" + getWeight());
		System.out.println("학년:" + grade);
		System.out.println();
	}
}

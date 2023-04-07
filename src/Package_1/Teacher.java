package Package_1;

public class Teacher extends Person {
	private int sal;
	
	public int getGrade() {
		return sal;
	}
	public Teacher(String name, int age, int height, int weight, int sal) {
		super(name, age, height, weight);
		this.sal = sal;
	}
	public void teacherInfo() {
		System.out.println("이름:" + getName());
		System.out.println("나이:" + getAge());
		System.out.println("키:" + getHeight());
		System.out.println("몸무게:" + getWeight());
		System.out.println("급여:" + sal);
		System.out.println();
	}
}

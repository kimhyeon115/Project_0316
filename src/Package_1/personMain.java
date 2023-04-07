package Package_1;

public class personMain {

	public static void main(String[] args) {
		Student student = new Student("홍길동", 29, 179, 73, 3);
		Teacher teacher = new Teacher("전우치", 37, 182, 81, 300);
		student.studentInfo();
		teacher.teacherInfo();
	}
}

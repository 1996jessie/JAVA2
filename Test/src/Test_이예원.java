import java.util.ArrayList;
import java.util.Scanner;

class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
class Student extends Person{
	private int java;
	private int jsp;

	public Student(String name, int age, int java, int jsp) {
		super(name, age); //부모의 생성자로 가서 name과 age에 입력한 값을 대입
		this.java = java;
		this.jsp = jsp;
	}
	public Student() {
		super();
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	@Override
	public String toString() { //toString 오버라이딩
		return getName()+","+getAge()+","+java+","+jsp+" 평균:"+(java+jsp)/2.0;
	}
	
	
}
public class Test_이예원 {
	public static void main(String[] args) {
		ArrayList<Student> lists = new ArrayList<Student>(); //ArrayList 저장소에 Student 리턴타입을 넣겠다
		Scanner sc = new Scanner(System.in);
		
		int i; 
		do {
			System.out.println("이름입력");
			String inputName = sc.next();
			System.out.println("나이입력");
			int inputAge = sc.nextInt();
			System.out.println("자바입력");
			int inputJava = sc.nextInt();
			System.out.println("jsp입력");
			int inputJsp = sc.nextInt();
			Student s = new Student(inputName, inputAge, inputJava, inputJsp); //입력한 값을 하나의 student 객체로 묶음
			lists.add(s); //lists에 s의 값을 넣겠다
			System.out.println("*****************");
			System.out.println("계속?");
			String retry = sc.next();
			if(retry.equals("n")) { //입력한 값이 n이면 일치하므로 반복문을 빠져나가서 System.out.println("ArrayList 사용한 결과");로 간다 
				break;
			}else {
				continue;
			}
		}while(true);
		
		System.out.println("ArrayList 사용한 결과");
		
		for(i=0;i<lists.size();i++) { //lists의 크기만큼 반복해서 ArrayList 사용한 결과 출력
			System.out.println(lists.get(i)); //오버라이딩한 toString 자동으로 뒤에 붙음
		}
		do { 
			boolean flag = false; //후에 있을 작업을 위해 초기화, 반복할 때마다 계속해서 다시 초기화됨
			System.out.println("찾는 이름:");
			String findName = sc.next();
			for(i=0;i<lists.size();i++) { //lists의 크기만큼 반복
				if(lists.get(i).getName().equals(findName)) { //찾는 값이 lists의 i번째 방에 있는 getName과 같은지 비교
					System.out.println(lists.get(i).getAge()+","+lists.get(i).getJava()+","+lists.get(i).getJsp()); //lists의 i번째 방에 있는 getAge, getJava, getJsp 가져오기
					flag = true; //초기화해놓은 값을 true로 바꿈
				}
			}if(flag == false) { //마지막 방까지 다 돌았는데도 일치하는 이름이 없다면 flag값 변하지 않아 계속해서 false
				System.out.println("찾는 이름 없음");
			}System.out.println("계속?");
			String retry = sc.next();
			if(retry.equals("n")) {//입력한 값이 n이면 일치하므로 반복문을 빠져나가서 System.out.println("프로그램을 종료합니다.");로 감
				break;
			}else {
				continue;
			}
		}while(true);
		System.out.println("프로그램을 종료합니다.");
	}
}

import java.util.ArrayList;
import java.util.Scanner;

class Person_ywl {
	private String name;
	private int age;
	
	public Person_ywl() {
		super();
	}

	public Person_ywl(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
class Student_ywl extends Person_ywl{
	private int java;
	private int jsp;
	public Student_ywl(String name, int age, int java, int jsp) {
		super(name, age); //부모의 생성자로 가서 name과 age에 입력한 값을 대입
		this.java = java;
		this.jsp = jsp;
	}

	public Student_ywl() {
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

	public String toString() {
		return getName()+","+getAge()+","+java+","+jsp+" 평균:"+(java+jsp)/2.0;
	}
}

public class Test_이예원_풀이 {
	public static void main(String[] args) {
		ArrayList<Student_ywl> lists = new ArrayList<Student_ywl>(); //

		Scanner sc = new Scanner(System.in);
		String retry;
		String name;
		int age;
		int java;
		int jsp;
		int i;
		
		while(true) {
			System.out.println("이름입력:");
			name = sc.next();
			System.out.println("나이입력:");
			age = sc.nextInt();
			System.out.println("자바입력:");
			java = sc.nextInt();
			System.out.println("jsp입력:");
			jsp = sc.nextInt();
			Student_ywl s = new Student_ywl(name, age, java, jsp);//
			lists.add(s);
			System.out.println("*******************");

			System.out.println("계속?");
			retry = sc.next(); 
			if(retry.equals("n")) {
				break;
			}
		}
		System.out.println("ArrayList 사용한 결과");

		for(i=0;i<lists.size();i++) { //
			Student_ywl s = lists.get(i);
			System.out.println(s.toString());
		}
		System.out.println();
		do {boolean flag = false; //
			System.out.println("찾는 이름:");
			name = sc.next();
			for(i=0;i<lists.size();i++) { //
				if(lists.get(i).getName().equals(name)) { //
					System.out.println(lists.get(i).getAge()+","+lists.get(i).getJava()+","+lists.get(i).getJsp());
					flag = true; //
				}
			} if(flag==false) {
				System.out.println("찾는 이름 없음");
			}
			System.out.println("계속?");
			retry = sc.next(); 
			if(retry.equals("n")) {
				break;
			}
		}while(true);
		System.out.println("프로그램을 종료합니다.");
		

	}

}

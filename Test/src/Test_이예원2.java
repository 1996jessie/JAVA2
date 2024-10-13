import java.util.ArrayList;
import java.util.Scanner;

class Product_ywl {
	private String code;
	private int price;

	public Product_ywl(String code, int price) {
		super();
		this.code = code;
		this.price = price;
	}

	public Product_ywl() {
		super();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
class Book_ywl extends Product_ywl{
	private String title;
	private String author;

	public Book_ywl(String code, int price, String title, String author) {
		super(code, price);
		this.title = title;
		this.author = author;
	}

	public Book_ywl(String code, int price) {
		super(code, price);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return getCode()+","+getPrice()+","+title+","+author;
	}
}

public class Test_이예원2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Book_ywl> lists = new ArrayList<Book_ywl>();	
		int i;
		boolean flag = false;
		do {
			System.out.print("코드:");
			String inputCode = sc.next();
			System.out.print("가격:");
			int inputPrice = sc.nextInt();
			System.out.print("제목:");
			String inputTitle = sc.next();
			System.out.print("저자:");
			String inputAuthor = sc.next();
			Book_ywl b = new Book_ywl(inputCode, inputPrice, inputTitle, inputAuthor);
			lists.add(b);
			System.out.print("계속?");
			String retry = sc.next();
			if(retry.equals("n")){
				break;
			}

		}while(true);
		System.out.println("ArrayList 사용한 결과");
		for(i=0;i<lists.size();i++) {
			System.out.println(lists.get(i).toString());
		}

		do {
			flag = false;
			System.out.print("찾는 제목:");
			String findTitle = sc.next();
			for(i=0;i<lists.size();i++) {
				if(lists.get(i).getTitle().equals(findTitle)) {
					System.out.println(lists.get(i).getCode()+","+lists.get(i).getPrice()+","+lists.get(i).getAuthor());
					flag = true;
				}
			}if(flag==false) {
				System.out.println("찾는 이름 없음");
			}
			System.out.print("계속?");
			String retry = sc.next();
			if(retry.equals("n")) {
				break;
			}

		}while(true);
		System.out.println("프로그램을 종료합니다.");
	}
}

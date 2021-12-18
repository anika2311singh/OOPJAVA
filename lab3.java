package oopslab;
import java.util.Scanner;
 class book{
	String name,author;
	int page,price;
	book(String name,String author,int page, int price){
		this.name=name;
		this.author=author;
		this.page=page;
		this.price=price;
	}
	public String toString() {
		return "name:"+ name+" author:"+author+" page: "+page+" price:"+price;
	}
	String getname() {
		return name;
	}
	void setname(String name) {
		this.name=name;
	}
}

public class lab3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		book b1=new book("Arshi","Anika",100,199);
		book b2=new book("Pikachu","R3",200,99);
		System.out.println(b1);
		System.out.println(b2);
		b2.setname("Aatreyee");
		
		System.out.println(b2.getname());
		System.out.println(b2);
		
		// TODO Auto-generated method stub

	}

}

package oopslab;
import java.util.Scanner;

class student{
	String usn,name;
	int credits[] = new int[100];
	int marks[]= new int[100];
	double n,sum=0,d=0;
	double sgpa;
	public void acceptcredits() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter credits of each subject");
		for( int j=0;j<n; j++) {
			credits[j]=sc.nextInt();
			
		}
		
		
	}
	public void acceptmarks(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of each subject");
		for( int i=0; i<n; i++) {
			marks[i]=sc.nextInt();
			
		}
			
		
	}
	public double calsgpa() {
		for(int i=0;i<n;i++) {
			sum=sum +credits[i]*marks[i];
			d=d+credits[i];
		}
		sgpa=(double)(sum/d);
		System.out.println("sgpa is");
		return sgpa;
	}
}

public class lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		student a=new student();
		a.name="Anika";
		a.usn="1bm20cs014";
		a.n=5;
		a.acceptcredits();
		a.acceptmarks();
		System.out.println(a.calsgpa());
	}

}

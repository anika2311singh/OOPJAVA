package oopslab;
import java.util.Scanner;
import java.math.*;

public class lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("Enter value of a,b and c");
int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
int d=b*b-4*a*c;
if(d==0)
System.out.println("roots are equal and equal to "+(-b/2*a));
else if(d>0)
	System.out.println("roots are "+((-b+Math.sqrt(d))/(2*a))+" and "+((-b-Math.sqrt(d))/(2*a)));
else System.out.println("there are no real solutions");
	}

}

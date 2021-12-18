package oopslab;
abstract class Shape{
	int a,b;
	public void printArea() {
		
	}
	
}
class Rectangle extends Shape{
	public void printArea(int l,int b) {
		System.out.println("Area of rectangle is "+l*b); 
		
	}
}
class Triangle extends Shape{
	public void printArea(int h,int b) {
		System.out.println("Area of triangle is "+h*b*0.5);
	}
}
class Circle extends Shape{
	public void printArea(int r) {
		System.out.println("Area of circle is "+3.14*r*r);
	}
}
public class lab4 {

	public static void main(String[] args) {
		Circle c=new Circle();
		Triangle t=new Triangle();
		Rectangle r=new Rectangle();
		c.printArea(5);
		t.printArea(10,5);
		r.printArea(12,24);

	}

}

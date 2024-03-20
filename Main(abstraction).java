abstract class Shape{
	
	public abstract double calculateArea();
	
	public void displayInfo(){
	System.out.println("This is a shape");
	}
}
class Rectangle extends Shape{
	int length;
	int width;
	
	Rectangle(int length,int width){
	this.length=length;
	this.width=width;
	}
	
	public double calculateArea(){
		return length*width;
	}
}
class Circle extends Shape{
	int radius;
	
	Circle(int radius){
	this.radius=radius;
	}
	
	public double calculateArea(){
	return Math.PI*radius*radius;
	}
}
class Main{
	public static void main(String args[]){
	Shape rectangle=new Rectangle(5,3);
	Shape circle=new Circle(4);
	
	System.out.println("Area of rectangle:"+rectangle.calculateArea());
	rectangle.displayInfo();
	
	System.out.println("Area of circle:"+circle.calculateArea());
	circle.displayInfo();
}
}
	

	

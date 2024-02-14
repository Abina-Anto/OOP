class Rectangle{
	int length;
	int breadth;
	void area()
	{
		int a;
		a=length*breadth;
		System.out.print("Area="+a);
	}
}
class Rect{
	public static void main(String args[]){
	Rectangle R1=new Rectangle();
	R1.length=5;
	R1.breadth=10;
	R1.area();
	}
}
	

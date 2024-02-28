class myclass{
	int a;
	double b;
	void display(int a){
		System.out.println("value of a:"+a);
	}
	void display(int a,double b){
	System.out.println("value of a and b "+a +" and "+b);
	}
}
public class mainclass{
	public static void main(String args[]){
	myclass obj=new myclass();
	obj.display(100);
	obj.display(100,108.4);
	}
	}
	

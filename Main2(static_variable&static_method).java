class Myclass{
	static int count=0;
	static void incrementCount(){
	count++;
	}
}
public class Main2{
	public static void main(String args[]){
	System.out.println("Initial count:"+Myclass.count);
	Myclass.incrementCount();
	System.out.println("Updated count:"+Myclass.count);
	}
}

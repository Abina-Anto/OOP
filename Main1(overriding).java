class Parent{
	void show()
	{
		System.out.println("parents show");
	}
}
class Child extends Parent{
	void show()
	{
		System.out.println("child's show");
	}
}
class Main1{
	public static void main(String args[]){
	Parent obj1=new Parent();
	obj1.show();
	Parent obj2=new Child();
	obj2.show();
	}
}

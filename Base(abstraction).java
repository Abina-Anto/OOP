abstract class emp{
	abstract void printinfo();
}
class Employee extends emp{
	void printinfo()
	{
		String name="avinash";
		int age=23;
		float salary=333.3F;
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	}
}
class Base{
	public static void main(String args[]){
	emp s=new Employee();
	s.printinfo();
	}
}

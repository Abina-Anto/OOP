interface Animal{
	void makeSound();
	String species="Mammals";
}
class Dog implements Animal{
	public void makeSound(){
	System.out.println("Bark");
	}
}
class Cat implements Animal{
	public void makeSound(){
	System.out.println("Meow!");
	}
}
public class AnimalDemo{
	public static void main(String args[]){
	Dog dog=new Dog();
	Cat cat=new Cat();
	dog.makeSound();
	cat.makeSound();
	System.out.println("Dog species:"+Animal.species);
	System.out.println("Cat species:"+Animal.species);
	}
}

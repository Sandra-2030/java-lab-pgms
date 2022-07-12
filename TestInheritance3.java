class Animal{
	void eat(){
		System.out.println("eating");
	}
}
class Dog extends Animal{
 void bark(){
	System.out.println("barking");
}
}
class Cat extends Animal{
	 void memow(){
		System.out.println("meowing");
}
}
class TestInheritance3{
	public static void main(String args[]){
Cat c=new Cat();
c.memow();
c.eat();
	}
}

package Question1;
//Program to demonstrate the working of method overriding
//Parent class
public class MethodOverriding {
	
	void display() {
		System.out.println("This is Parent class");
	}
}
//Child class or Inherited class.
class Child extends MethodOverriding{
	//This method overrides display() of MethodOveriding class
	@Override
	void display() {
		System.out.println("This is Child class");
	}
	
}
//Main method
class main{
	public static void main(String args[]) {
		
		MethodOverriding ob = new Child();
		//display() method of MethodOverriding class is overridden by Child class display()
		ob.display();
		
	}

}
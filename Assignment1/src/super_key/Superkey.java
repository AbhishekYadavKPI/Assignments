package super_key;
// Parent class
public class Superkey {
	void status() {
		System.out.println("Parent class");
	}

}
//Child class
class Child extends Superkey{
	void status() {
		System.out.println("Child class");
	}
	void display() {
		status();// will call child class method
		
		super.status();// will call parent class method
	}
}

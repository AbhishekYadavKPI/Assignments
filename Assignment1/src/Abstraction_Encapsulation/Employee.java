package Abstraction_Encapsulation;

public class Employee extends Employer {

	@Override
	void ID() {
		// TODO Auto-generated method stub
		System.out.println("7654");
	}

	@Override
	void Batch() {
		// TODO Auto-generated method stub
		System.out.println("Batch 5");
	}

	public static void main(String args[]) {
		//Employer a = new Employer();// Object of Abstract class cannot be instantiated
		Employee ob = new Employee();
		ob.setName("Abhishek Yadav");
		System.out.println(ob.getName());
		ob.ID();
		ob.Batch();
		
	}
}

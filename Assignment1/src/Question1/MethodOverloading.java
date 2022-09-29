package Question1;
//Program to demonstrate the working of method overloading
public class MethodOverloading {
	//Overloaded Multiply().It takes two int parameters
    int Multiply(int a, int b) {

		return a * b;

	}
    
    //Overloaded Multiply().It takes three int parameters
	int Multiply(int a, int b, int c) {

		return a * b * c;

	}
	//Overloaded Multiply().It takes two double parameters
	double Multiply(double a, double b) {

		return a * b;

	}
    //Main method
	public static void main(String args[]) {

		MethodOverloading ob = new MethodOverloading();
		ob.Multiply(2, 4);
		ob.Multiply(5, 7, 9);
		ob.Multiply(5.7, 9.8); 
	}

}

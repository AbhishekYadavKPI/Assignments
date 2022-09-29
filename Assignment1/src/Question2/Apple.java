package Question2;
//Inherited class from Phone class
public class Apple extends Phone{
	
    //Base class method
	@Override
	void Processor() {
		// TODO Auto-generated method stub
		System.out.println("A15 Bionic");
	}
	
	@Override
	int Storage(int a) {
		// TODO Auto-generated method stub
		System.out.println(a+"GB");
		return a;
	}


}

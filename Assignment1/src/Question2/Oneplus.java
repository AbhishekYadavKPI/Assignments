package Question2;
//Inherited class from Phone class
public class Oneplus extends Phone{
	//Base class method
	@Override
	void Processor() {
		// TODO Auto-generated method stub
		System.out.println("Snapdragon 835");
	}
	@Override
	int Storage(int a) {
		// TODO Auto-generated method stub
		System.out.println(a+"GB");
		return 64;
	}

}
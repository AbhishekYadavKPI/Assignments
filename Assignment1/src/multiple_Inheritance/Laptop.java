package multiple_Inheritance;
// Class implementing Interfaces 1 and 2
public class Laptop implements Hardware, Software{
	
	void Brand_Name() {
		System.out.println("Lenovo");
	}

	@Override
	public void OS() {
		// TODO Auto-generated method stub
		System.out.println("Windows 11");
	}

	@Override
	public void processor() {
		// TODO Auto-generated method stub
		System.out.println("Intel i5 11th Gen");
	}

	@Override
	public void ram() {
		// TODO Auto-generated method stub
		System.out.println("8 GB");
	}

	@Override
	public void hdd_type() {
		// TODO Auto-generated method stub
		System.out.println("SSD 512 GB");
	}

	@Override
	public void screen_size() {
		// TODO Auto-generated method stub
		System.out.println("14 inch");
	}
	

}

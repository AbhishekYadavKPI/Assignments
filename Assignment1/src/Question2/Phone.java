package Question2;
//Parent abstract class
abstract class Phone {
	private String name;
	
	abstract void Processor();//Abstract method.It does not have abody
	abstract int Storage(int a);
	//Concrete method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}


package Abstraction_Encapsulation;

abstract class Employer {
	
	private String name;
	abstract void ID ();
	abstract void Batch ();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

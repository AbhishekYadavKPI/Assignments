package question1_2_3_4;

public class Employee2 extends EmployeeAbstract implements Runnable{
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running");
	}
	@Override
	int EmpID() {
		// TODO Auto-generated method stub
		return 9182;
	}

	@Override
	void Name() {
		// TODO Auto-generated method stub
		System.out.println("Rishi");
	}

	@Override
	void Acc_No() {
		// TODO Auto-generated method stub
		System.out.println("93290380");
	}

	@Override
	int Salary() {
		// TODO Auto-generated method stub
		return 23350;
	}

	@Override
	int YOE() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	void Project_Status() {
		// TODO Auto-generated method stub
		System.out.println("Training");
	}

	@Override
	void Designation() {
		// TODO Auto-generated method stub
		System.out.println("project trainee");
	}

	@Override
	int UAN_no() {
		// TODO Auto-generated method stub
		return 13243;
	}
public static void main(String[] args) {
	Employee2 e1 = new Employee2();
	Thread t1 = new Thread(e1);
	t1.start();
}

}

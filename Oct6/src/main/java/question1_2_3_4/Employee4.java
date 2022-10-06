package question1_2_3_4;

public class Employee4 extends EmployeeAbstract implements Runnable{
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running");
	}
	@Override
	int EmpID() {
		// TODO Auto-generated method stub
		return 9184;
	}

	@Override
	void Name() {
		// TODO Auto-generated method stub
		System.out.println("Manjeet");
	}

	@Override
	void Acc_No() {
		// TODO Auto-generated method stub
		System.out.println("232302930");
	}

	@Override
	int Salary() {
		// TODO Auto-generated method stub
		return 28000;
	}

	@Override
	int YOE() {
		// TODO Auto-generated method stub
		return 0;
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
		return 238989;
	}
public static void main(String[] args) {
	Employee4 e1 = new Employee4();
	Thread t1 = new Thread(e1);
	t1.start();
}

}

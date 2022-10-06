package question1_2_3_4;

public class Employee10 extends EmployeeAbstract implements Runnable{

	@Override
	int EmpID() {
		// TODO Auto-generated method stub
		return 9190;
	}

	@Override
	void Name() {
		// TODO Auto-generated method stub
		System.out.println("Ansh");
	}

	@Override
	void Acc_No() {
		// TODO Auto-generated method stub
		System.out.println("Ubin9832983");
	}

	@Override
	int Salary() {
		// TODO Auto-generated method stub
		return 23230;
	}

	@Override
	int YOE() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	void Project_Status() {
		// TODO Auto-generated method stub
		System.out.println("Trainee");
	}

	@Override
	void Designation() {
		// TODO Auto-generated method stub
		System.out.println("Project Trainee");
	}

	@Override
	int UAN_no() {
		// TODO Auto-generated method stub
		return 827389;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		Employee10 e1 = new Employee10();
		Thread t1 = new Thread(e1);
		t1.start();
	}

	
}

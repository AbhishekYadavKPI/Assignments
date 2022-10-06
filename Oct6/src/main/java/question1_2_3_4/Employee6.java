package question1_2_3_4;

public class Employee6 extends EmployeeAbstract implements Runnable{
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running");
	}
	@Override
	int EmpID() {
		// TODO Auto-generated method stub
		return 9186;
	}

	@Override
	void Name() {
		// TODO Auto-generated method stub
		System.out.println("Salman");
	}

	@Override
	void Acc_No() {
		// TODO Auto-generated method stub
		System.out.println("23230293290380");
	}

	@Override
	int Salary() {
		// TODO Auto-generated method stub
		return 19000;
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
		return 3243;
	}
public static void main(String[] args) {
	Employee6 e1 = new Employee6();
	Thread t1 = new Thread(e1);
	t1.start();
}

}

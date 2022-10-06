package question1_2_3_4;

public class Employee8 extends EmployeeAbstract implements Runnable{
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running");
	}
	@Override
	int EmpID() {
		// TODO Auto-generated method stub
		return 9188;
	}

	@Override
	void Name() {
		// TODO Auto-generated method stub
		System.out.println("Abhinav");
	}

	@Override
	void Acc_No() {
		// TODO Auto-generated method stub
		System.out.println("2323029330380");
	}

	@Override
	int Salary() {
		// TODO Auto-generated method stub
		return 25000;
	}

	@Override
	int YOE() {
		// TODO Auto-generated method stub
		return 3;
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
		return 13233433;
	}
public static void main(String[] args) {
	Employee8 e1 = new Employee8();
	Thread t1 = new Thread(e1);
	t1.start();
}

}

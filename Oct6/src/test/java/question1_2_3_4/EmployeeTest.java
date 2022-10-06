package question1_2_3_4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeTest {
	@Test
	public void checkEmployee1() {
		Employee1 ob1 = new Employee1();
		int ID = ob1.EmpID();
		int uan = ob1.UAN_no();
		int salary = ob1.Salary();
		int Yoe = ob1.YOE();
		assertEquals(9180,ID);
		assertEquals(1323243,uan);
		assertEquals(20000,salary);
		assertEquals(0,Yoe);
		
	}
	@Test
	public void checkEmployee2() {
		Employee2 ob1 = new Employee2();
		int ID = ob1.EmpID();
		int uan = ob1.UAN_no();
		int salary = ob1.Salary();
		int Yoe = ob1.YOE();
		assertEquals(9182,ID);
		assertEquals(13243,uan);
		assertEquals(23350,salary);
		assertEquals(1,Yoe);
		
	}
	@Test
	public void checkEmployee3() {
		Employee3 ob1 = new Employee3();
		int ID = ob1.EmpID();
		int uan = ob1.UAN_no();
		int salary = ob1.Salary();
		int Yoe = ob1.YOE();
		assertEquals(9183,ID);
		assertEquals(455599,uan);
		assertEquals(22000,salary);
		assertEquals(0,Yoe);
		
	}
	@Test
	public void checkEmployee4() {
		Employee4 ob1 = new Employee4();
		int ID = ob1.EmpID();
		int uan = ob1.UAN_no();
		int salary = ob1.Salary();
		int Yoe = ob1.YOE();
		assertEquals(9184,ID);
		assertEquals(238989,uan);
		assertEquals(28000,salary);
		assertEquals(0,Yoe);
		
	}
	@Test
	public void checkEmployee5() {
		Employee5 ob1 = new Employee5();
		int ID = ob1.EmpID();
		int uan = ob1.UAN_no();
		int salary = ob1.Salary();
		int Yoe = ob1.YOE();
		assertEquals(9185,ID);
		assertEquals(0,uan);
		assertEquals(15000,salary);
		assertEquals(0,Yoe);
		
	}
	@Test
	public void checkEmployee6() {
		Employee6 ob1 = new Employee6();
		int ID = ob1.EmpID();
		int uan = ob1.UAN_no();
		int salary = ob1.Salary();
		int Yoe = ob1.YOE();
		assertEquals(9186,ID);
		assertEquals(3243,uan);
		assertEquals(19000,salary);
		assertEquals(0,Yoe);
		
	}
	@Test
	public void checkEmployee7() {
		Employee7 ob1 = new Employee7();
		int ID = ob1.EmpID();
		int uan = ob1.UAN_no();
		int salary = ob1.Salary();
		int Yoe = ob1.YOE();
		assertEquals(9187,ID);
		assertEquals(367243,uan);
		assertEquals(27000,salary);
		assertEquals(0,Yoe);
		
	}
	@Test
	public void checkEmployee8() {
		Employee8 ob1 = new Employee8();
		int ID = ob1.EmpID();
		int uan = ob1.UAN_no();
		int salary = ob1.Salary();
		int Yoe = ob1.YOE();
		assertEquals(9188,ID);
		assertEquals(13233433,uan);
		assertEquals(25000,salary);
		assertEquals(3,Yoe);
		
	}
	@Test
	public void checkEmployee9() {
		Employee9 ob1 = new Employee9();
		int ID = ob1.EmpID();
		int uan = ob1.UAN_no();
		int salary = ob1.Salary();
		int Yoe = ob1.YOE();
		assertEquals(9189,ID);
		assertEquals(30003,uan);
		assertEquals(30000,salary);
		assertEquals(0,Yoe);
		
	}
	@Test
	public void checkEmployee10() {
		Employee10 ob1 = new Employee10();
		int ID = ob1.EmpID();
		int uan = ob1.UAN_no();
		int salary = ob1.Salary();
		int Yoe = ob1.YOE();
		assertEquals(9190,ID);
		assertEquals(827389,uan);
		assertEquals(23230,salary);
		assertEquals(1,Yoe);
		
	}
	
}

package exceptionHandling;

public class ExceptionHand {
	public static void main(String args[]) {
		int a=1;
		int b=0;
		 try {
			 System.out.println(a/b);
		 }
		 catch(Exception e) {
			 e.printStackTrace();// prints the error
		 }
		 //finally block gets always executed
		 finally {
			 System.out.println("final statement");
		 }
	}
		
	}



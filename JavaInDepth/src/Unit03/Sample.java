package Unit03;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		try {
			int a=10, b=0;
			int c=a/b;
			System.out.println("After the exception" +c);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Exception handled");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		//if there is no exception finally will always run
		//finally always run irrespective of whether exception handled or not
		//
		finally{ 
		System.out.println("Done");
	}*/
		//Runtime: If an exception bypasses the compiler process and break at run time then it is called runtime exception.
		//
	void checkedAndUncheckedException() {
		int a=0;
		int b=5;
		if(x<2) {
			throw new IndexOutOfBoundException();
		}
		int c=b/a;
		
		System.out.println(c);
		
	}
	void manualExceptionThrow() {

		try {

			// Have to use try and Catch here!
			calculateArea(-1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	void calculateArea(int r) throws ManualException {

		if (r < 0) {
			throw new ManualException();
		}

		int area = r * r;
		System.out.println(area);

	}

}

@SuppressWarnings("serial")
class ManualException extends Exception {

	@Override
	public String getMessage() {
		String detailMessage = "Exception Occured!";
		return detailMessage;
	}


		
	}
}

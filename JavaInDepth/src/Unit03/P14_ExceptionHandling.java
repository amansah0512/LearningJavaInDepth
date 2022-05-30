package Unit03;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Exception & Error! -> 
 * 
 * Exception means in case of any failure our program can recover from the failure there is an exception handling is there in 
 * our program.
 * **If a program can handle the situation by itself.
 * 
 * Unchecked Exception -> When our compiler compiles the code without giving the exception.
 * Checked Exception -> When our compiler stops the compilation with giving an exception.
 * 
 * Error! means in case of any failure our program can'not recover from the error.
 * 
 * Super class comes after child class in Exception handling
 * 
 */

public class P14_ExceptionHandling {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);

		ABC5 obj = new ABC5();
		
		obj.basicException();
		obj.handleException();
		obj.multipleCatch();
		obj.inputMismatchException();
		//obj.stackOverFlowError(6);
		obj.indexOutOfBoundException();
		obj.nullPointerException();
		// obj.useofThrow(18);
		obj.useOfThrows_And_Finally();
		obj.checkedAndUncheckedException();
		
		}
	}

class ABC5{
	
	void basicException() {
		try {
			int b=0;
			int a=100/b;
		}catch (ArithmeticException e) {
				System.out.println(e.getMessage());
		}
		System.out.println("Done");
		
	}
	
	void handleException() {
		
		try {
			// sensitive code
			int b = 0;
			int a = 100 / b;
			System.out.println(a);
		}

		// child catch block]
		catch (ArithmeticException e) {

			System.out.println("kahddeuggdcbjguyxgxqui");
			System.out.println(e.getMessage());
		}
		
	}
	
	void multipleCatch() {
		
		
		// in the case of multiple exception our child class will 
		//be placed first then our parent class will be placed
		try {
			// sensitive code
			int b = 0;
			int a = 100 / b;
			System.out.println(a);
		}

		// child catch block]
		catch (ArithmeticException e) {

			System.out.println("kahddeuggdcbjguyxgxqui");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("kahddeuggdcbjguyxgxqui");
			System.out.println(e.getMessage());
		}
		
	}
	
	void inputMismatchException() {
		try {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number ->");
		int number=scan.nextInt();
		System.out.println("You have entered -> "+number);
		scan.close();
		}catch(InputMismatchException e) {
			System.out.println("Input Mismatch Issue");
		}
		System.out.println("Done");
		
	}
	//Error not an exception
	//i=10
	void stackOverFlowError(int i){
		try {
			while(i>0) {
				i++;
				stackOverFlowError(i);
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Reset of the code
		System.out.println("Done!");
	}
	
	void indexOutOfBoundException() {
		
	try {
		int[] myNumbers= {1,2,3};
		System.out.println(myNumbers[10]);
		
	}catch (Exception e) {
		System.out.println("Something went wrong.");
	}
	
	//The finally statement lets you execute code,after try...catch
	//regardless of the results
	finally {
		System.out.println("The 'try catch' is finished.");
	}
	}
	
	
	void nullPointerException() {
		
		try {
			String s=null;
			System.out.println(s.length());
		}catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	void useOfThrow(int age) throws Exception {
	
		if(age>18) {
			throw new Exception();
			
		}
		else {
			System.out.println("You are allowed to enter");
		}
		
	}
	void useOfThrows_And_Finally() {
	try {
		useOfThrow(18);
	}catch (Exception e) {
		e.printStackTrace();
	}
		
	}
	
	void checkedAndUncheckedException() {
		
	}
	
	
	
}
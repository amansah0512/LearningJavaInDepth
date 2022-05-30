/*pre recuisit multi threading concept
 * -> multi processing:
 * 1. Sequential multi processing
 * 2. Parallel multi processing
 * 3. Concurrent multi processing
 * 
 * -> multi tasking:
 *  1. Sequential multi tasking
 *  2. Parallel multi tasking
 *  3. Concurrent multi tasking
 * 
 * 
 */
package Unit03;

import java.util.Scanner;

public class P16_MultiThreading {

	public static void main(String[] args) {
		
		/*
		 * Main thread will execute C1.show method and the C2.show method
		 */
		
		C1 obj1 = new C1();
		obj1.show1();
		
		System.out.println("\n");
		C2 obj2=new C2();
		obj2.show2();
		
//		Thread t1 = new Thread(new T1(), "T1");
//		Thread t2 = new Thread(new T2(), "T2");
//		Thread t3 = new Thread(new T3(), "T3");
//		t1.start();
//		t2.start();
//		t3.start();
		
		
		MultiThreading obj=new MultiThreading();
		obj.threadConcept();
		obj.threadSynchronization();
		obj.interThreadCommunication();
		obj.ProducerConsumerProblems();
		obj.Wait_And_Notify();

	}

}

class C1 {
	void show1() {
		
		Scanner obj=new Scanner(System.in);
		int a = obj.nextInt();
		System.out.println(a);
		System.out.println("Done with show1()!");
		obj.close();
		
	}
}

class C2 {
	void show2() {
		for (int i=0;i<10;i++) {
			System.out.println(i + "-Hey_2!");
		}
	} 
}

class T1 extends Thread {
	
	
	public void run() {
		 
		Scanner obj = new Scanner(System.in);
		int a=obj.nextInt();
		System.out.println(a);
		System.out.println("Done with T1!");
		obj.close();
		
		
	}
}

class T2 implements Runnable {
	

	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i + "- Hey_2!");
		}
	}
}

class T3 implements Runnable {
	

	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i + "- Hey_3!");
		}
	}
}
class MultiThreading{
	void threadConcept() {
		
	}
	void threadSynchronization() {
		
	}
	void interThreadCommunication() {
		
	}
	void ProducerConsumerProblems() {
		
	}
	void Wait_And_Notify() {
		
	}
}

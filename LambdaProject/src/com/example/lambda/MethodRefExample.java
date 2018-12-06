package com.example.lambda;

public class MethodRefExample {
	public void doProcess(int i,Process p) {
		p.process(i);
		
	}

	public static void main(String[] args) {
		Thread t=new Thread(MethodRefExample::printMsg);
	

	}
	public  static void doProcess(int j) {
		MethodRefExample ref=new MethodRefExample();
		System.out.println(j);
	   ref.doProcess(4, i->{System.out.println(j);
	
		});
		
		
	}
	public static void printMsg() {
		System.out.println("hi");
	}
	@FunctionalInterface
	public interface Process{
		public  void process(int i);
	}

	
}

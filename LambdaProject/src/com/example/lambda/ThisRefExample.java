package com.example.lambda;

public class ThisRefExample {
	public void doProcess(int i,Process p) {
		p.process(i);
		System.out.println(this);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}
	public void doProcess(int j) {
		ThisRefExample ref=new ThisRefExample();
		ref.doProcess(4, i->{System.out.println(j);
		System.out.println(this);
		});
		
	}
	interface Process{
		public  void process(int i);
	}

}

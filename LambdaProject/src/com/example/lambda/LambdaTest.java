package com.example.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class LambdaTest {
	public static void main(String[] args) {
		MyLambda lambda=()->System.out.println("hi");
		AddLambda addLambda=(int a,int b)->a+b;
		DivideLambda div=(int a,int b)->{
			if (b==0)return 0;
			else return a/b;
		};
		lambda.foo();
		List<Person> personList = Arrays.asList(new Person(1, "Payal", "kop"), new Person(2, "Ajay", "Pune"),
				new Person(3, "Vivan", "kop"));
		Collections.sort(personList,new Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}		});
		printPersons(personList);
		printAddr(personList,new Condition() {

			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getAddress().startsWith("k");
			}
			
		});
	}
	
	


private static void printAddr(List<Person> personList,Condition c) {
	for(Person p:personList) {
		if(c.test(p)){
			System.out.println("ID : "+p.getId()+" Name is : "+p.getName()+ " Address is "+ p.getAddress());

		}
	}
}



public static void printPersons(List<Person> pl) {
	for(Person p:pl) {
		System.out.println("ID : "+p.getId()+" Name is : "+p.getName()+ " Address is "+ p.getAddress());
	}
}
interface Condition{
	boolean test(Person p);
}
interface MyLambda{
	void foo();
	
}
interface AddLambda{
	 int add(int a,int b);
	
}
interface DivideLambda{
	 int div(int a,int b);
	
}
}
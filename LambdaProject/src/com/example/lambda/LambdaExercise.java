package com.example.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExercise {
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
		Collections.sort(personList,(o1,o2)->o1.getName().compareTo(o2.getName()));
		printPersons(personList);
		printAddr(personList,(Person p)->p.getAddress().startsWith("k"),(p)->System.out.println(p));
	}
	
	


private static void printAddr(List<Person> personList,Predicate<Person> c,Consumer<Person> s) {
	for(Person p:personList) {
		if(c.test(p)){
			s.accept(p);

		}
	}
}



public static void printPersons(List<Person> pl) {
	for(Person p:pl) {
		System.out.println("ID : "+p.getId()+" Name is : "+p.getName()+ " Address is "+ p.getAddress());
	}
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

package com.example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaCollections {
	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person(1, "Payal", "kop"), new Person(2, "Ajay", "Pune"),
				new Person(3, "Vivan", "kop"));

		personList.forEach(System.out::println);
		Stream<Person> ps = personList.stream();
		ps.filter((p) -> p.getName().startsWith("P")).forEach((p1) -> System.out.println(p1.getName()));
		personList.stream().sorted((Person p, Person p1) -> p.getName().compareTo(p1.getName()))
				.filter((Person p) -> p.getAddress().startsWith("A")).findFirst();

		// boolean b=ps1.allMatch(p->p.getName().startsWith("P"));

	}
}

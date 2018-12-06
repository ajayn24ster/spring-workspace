package com.example.lambda;

public interface TestDefaultMethod {
	default void testDefault() {
		System.out.println("Helllo");
	}

}

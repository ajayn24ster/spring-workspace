package com.example.lambda;

import java.util.Optional;

public class TestInterface implements TestDefaultMethod {
public static void main(String[] args) {
	new TestInterface().testDefault();
	Optional<String> s = null;
	boolean b=s.isPresent();
	String s1=s.get();
}
}

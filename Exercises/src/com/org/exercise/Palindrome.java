package com.org.exercise;

public class Palindrome {
	public static void main(String[] args) {
		String str="tattarrattat";
		int maxLength=0;
		String pal="";
		char[] chrArray=str.toCharArray();
		for (int i=0;i<str.length();i++) {
			for (int j=i+2;j<=str.length();j++) {
			String subStr=str.substring(i,j);
			String rev=reverseString(subStr);
			if(subStr.equals(rev)) {
		     if(maxLength<subStr.length()) {
					pal=subStr;
					maxLength=subStr.length();
				}
				System.out.println("Palindrome is "+subStr + " Length is "+subStr.length());
			}
			}
			
		}
		
		System.out.println("####### Final Palindrome is "+pal + " Length is "+maxLength);
		
	}
static String reverseString (String str) {
	String revString="";
	for(int i=str.length()-1;i>=0;i--) {
		revString=revString+str.charAt(i);
	}
	return revString;
}
}


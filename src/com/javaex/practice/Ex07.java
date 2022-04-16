package com.javaex.practice;

public class Ex07 {

	public static void main(String[] args) {
		
		int i = 10; //10
		int n = ++i%2; //(11/2=5 나머지 1) n=1
		
		System.out.println(i); //++i 영향으로 i=11
		System.out.println(n); //n=1

	}
}

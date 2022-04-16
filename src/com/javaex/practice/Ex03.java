package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		
		int a = ++x *2;
		//(++) 앞에 오면 x 값을 먼저 올리고 다음 행동을 취하라는 의미 / 따라서 2*2 = 4
		int b = y++ *2;
		//(++) 뒤에 오면 모든 행동을 취한 후 y 값을 올리라는 의미 / 따라서 1*2 = 2
		
		System.out.println("a="+a); //4
		System.out.println("b="+b); //2
		System.out.println("x="+x); //2
		System.out.println("y="+y); //2

	}
}

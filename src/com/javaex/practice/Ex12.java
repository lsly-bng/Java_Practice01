package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요: ");
		final double PI=3.14; //상수로 사용할때는 대문자로 표기
		double r=sc.nextDouble();
		System.out.println("원의 넓이는 "+PI*r*r);
		
		sc.close();
		
	}

}

package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.print("가로를 입력하세요: ");
		double l = sc.nextDouble();
		System.out.print("세로를 입력하세요: ");
		double w = sc.nextDouble();
		System.out.println("사각형의 넓이는 "+l*w+" 입니다.");
		System.out.println("사각형의 둘레는 "+(l+w)*2+" 입니다.");
		
		sc.close();
		
	}

}

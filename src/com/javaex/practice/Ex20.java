package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		int coin01 = sc.nextInt()*500;
		System.out.print("100원 개수: ");
		int coin02 = sc.nextInt()*100;
		System.out.print("50원 개수: ");
		int coin03 = sc.nextInt()*50;
		System.out.print("10원 개수: ");
		int coin04 = sc.nextInt()*10;
		
		int total = coin01+coin02+coin03+coin04;
		
		System.out.println("동전의 총합은 "+total+" 원 입니다.");
		
		sc.close();
		
	}

}

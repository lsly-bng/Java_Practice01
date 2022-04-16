package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		
		double f=80.0;
		System.out.println((double)5/9*(f-32.0)); 
		//기존 (5/9*(f-32.0)) --> ((double)5/9*(f-32.0))으로 수정
		//(double)을 추가하여, 실수형으로 5/9를 변경해야만, 계산이 정확히 진행된다.
		//(double) 추가 없이는 5/9가 정수로 계산되어 결과 값이 0으로 계산된다.
		//(double) 없이 --> 0*(80.0-32.0)=0
		
	}
}

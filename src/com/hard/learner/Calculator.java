package com.hard.learner;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int first = 0;
		int second = 0;
		
		System.out.println("연산에 필요한 첫 번째 숫자를 입력해주세요.");
		first = scanner.nextInt();
		System.out.println("연산에 필요한 두 번째 숫자를 입력해주세요.");
		second = scanner.nextInt();
		
		System.out.println("덧셈 : " + (first + second));
		System.out.println("뺄셈 : " + (first - second));
		System.out.println("곱셈 : " + (first * second));
		System.out.println("나눗셈 : " + (first / second));
	}
}

package com.hard.learner;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int first = 0;
		int second = 0;
		
		System.out.println("���꿡 �ʿ��� ù ��° ���ڸ� �Է����ּ���.");
		first = scanner.nextInt();
		System.out.println("���꿡 �ʿ��� �� ��° ���ڸ� �Է����ּ���.");
		second = scanner.nextInt();
		
		System.out.println("���� : " + (first + second));
		System.out.println("���� : " + (first - second));
		System.out.println("���� : " + (first * second));
		System.out.println("������ : " + (first / second));
	}
}

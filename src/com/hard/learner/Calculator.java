package com.hard.learner;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int first = 0;
		int second = 0;
		String operator = null;
		int result = 0;

		System.out.println("���꿡 �ʿ��� ù ��° ���ڸ� �Է����ּ���.");
		first = scanner.nextInt();

		while (true) {
			System.out.println("���ϴ� ���� ��ȣ�� �Է��� �ּ���.");
			operator = scanner.next();

			if ("quit".equals(operator)) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}

			System.out.println("���꿡 �ʿ��� �� ��° ���ڸ� �Է����ּ���.");
			second = scanner.nextInt();

			result = calculate(first, second, operator);
			first = result;
			
			System.out.println("�հ� : " + result);
		}

		scanner.close();
	}

	// default �����ڴ� �������̴�.
	public static int calculate(int first, int second, String operator) {
		if (operator.equals("+")) {
			return first + second;
		} else if (operator.equals("-")) {
			return first - second;
		} else if (operator.equals("*")) {
			return first * second;
		} else {
			return first / second;
		}
	}
}

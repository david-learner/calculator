package com.hard.learner;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int first = 0;
		int second = 0;
		String operator = null;
		int result = 0;

		System.out.println("연산에 필요한 첫 번째 숫자를 입력해주세요.");
		first = scanner.nextInt();

		while (true) {
			System.out.println("원하는 연산 기호를 입력해 주세요.");
			operator = scanner.next();

			if ("quit".equals(operator)) {
				System.out.println("종료되었습니다.");
				break;
			}

			System.out.println("연산에 필요한 두 번째 숫자를 입력해주세요.");
			second = scanner.nextInt();

			result = calculate(first, second, operator);
			first = result;
			
			System.out.println("합계 : " + result);
		}

		scanner.close();
	}

	// default 연산자는 나누기이다.
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

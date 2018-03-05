package com.hard.learner;

import java.util.Scanner;

public class Calculator {
	static int getFirstValue(Scanner scanner) {
		// TODO 첫 번째 값을 입력 받아 반환
		System.out.println("첫 번째 값을 입력하세요.");
		int firstValue = scanner.nextInt();
		System.out.println(firstValue);
		return firstValue;
	}

	static int getSecondValue(Scanner scanner) {
		// TODO 두 번째 값을 입력 받아 반환
		System.out.println("두 번째 값을 입력하세요.");
		int secondValue = scanner.nextInt();
		System.out.println(secondValue);
		return secondValue;
	}

	static String getSymbol(Scanner scanner) {
		// TODO 첫 번째 값을 입력 받아 반환
		System.out.println("연산자를 입력하세요.");
		String symbol = scanner.next();
		System.out.println(symbol);
		return symbol;
	}

	static int calculate(String symbol, int first, int second) {
		// TODO 사칙 연산을 계산해 결과 값을 반환
		// 마지막에 else만 써서 처리한 게 별로인 것 같다.
		if (("+").equals(symbol)) {
			return first + second;
		} else if (("-").equals(symbol)) {
			return first - second;
		} else if (("*").equals(symbol)) {
			return first * second;
		} else if(("/").equals(symbol)){
			return first / second;
		} else {
			return 0;
		}
	}

	static void print(int result) {
		// TODO 실행 결과를 출력
		System.out.println("합계 : " + result);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int result = getFirstValue(scanner);

		while (true) {
			String symbol = getSymbol(scanner);

			if ("quit".equals(symbol)) {
				print(result);
				break;
			}

			int second = getSecondValue(scanner);

			result = calculate(symbol, result, second);
			
			print(result);
		}

		scanner.close();
	}
}

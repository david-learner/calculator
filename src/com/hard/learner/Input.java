package com.hard.learner;

import java.util.Scanner;

public class Input {
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
}

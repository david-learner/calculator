package com.hard.learner;

import java.util.Scanner;

public class Calculator {
	static String[] getValues(Scanner scanner) {
		String value = scanner.nextLine();
		String[] splitedValues = value.split(" ");
		return splitedValues;
	}

	static int convert(String string) {
		return Integer.parseInt(string);
	}

	static void print(int result) {
		// TODO 실행 결과를 출력
		System.out.println("합계 : " + result);
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
		} else if (("/").equals(symbol)) {
			return first / second;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int result = 0;
		String symbol = null;
		
		System.out.println("수식을 입력해 주세요.");
		String[] splitedValues = getValues(scanner);
		
		int firstValue = convert(splitedValues[0]);
		System.out.println("first : " + firstValue);
		
		for (int i = 1; i < splitedValues.length; i++) {
			if (i % 2 == 1) {
				symbol = splitedValues[i];
				System.out.println("symbol : " + symbol);
			} else {
				int secondValue = convert(splitedValues[i]);
				System.out.println("second : " + secondValue);
				result = calculate(symbol, firstValue, secondValue);
				firstValue = result;
			}
		}

		print(result);

		scanner.close();
	}
}

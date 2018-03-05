package com.hard.learner;

import java.util.Scanner;

public class Calculator {

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

		int result = Input.getFirstValue(scanner);

		while (true) {
			String symbol = Input.getSymbol(scanner);

			if ("quit".equals(symbol)) {
				Output.print(result);
				break;
			}

			int second = Input.getSecondValue(scanner);

			result = calculate(symbol, result, second);

			Output.print(result);
		}

		scanner.close();
	}
}

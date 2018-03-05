package com.hard.learner;

import java.util.Scanner;

public class Calculator {

	static int calculate(String symbol, int first, int second) {
		// TODO ��Ģ ������ ����� ��� ���� ��ȯ
		// �������� else�� �Ἥ ó���� �� ������ �� ����.
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

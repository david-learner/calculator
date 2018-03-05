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
		// TODO ���� ����� ���
		System.out.println("�հ� : " + result);
	}

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

		int result = 0;
		String symbol = null;
		
		System.out.println("������ �Է��� �ּ���.");
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

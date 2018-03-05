package com.hard.learner;

import java.util.Scanner;

public class Calculator {
	static int getFirstValue(Scanner scanner) {
		// TODO ù ��° ���� �Է� �޾� ��ȯ
		System.out.println("ù ��° ���� �Է��ϼ���.");
		int firstValue = scanner.nextInt();
		System.out.println(firstValue);
		return firstValue;
	}

	static int getSecondValue(Scanner scanner) {
		// TODO �� ��° ���� �Է� �޾� ��ȯ
		System.out.println("�� ��° ���� �Է��ϼ���.");
		int secondValue = scanner.nextInt();
		System.out.println(secondValue);
		return secondValue;
	}

	static String getSymbol(Scanner scanner) {
		// TODO ù ��° ���� �Է� �޾� ��ȯ
		System.out.println("�����ڸ� �Է��ϼ���.");
		String symbol = scanner.next();
		System.out.println(symbol);
		return symbol;
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
		} else if(("/").equals(symbol)){
			return first / second;
		} else {
			return 0;
		}
	}

	static void print(int result) {
		// TODO ���� ����� ���
		System.out.println("�հ� : " + result);
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

package com.hard.learner;

import java.util.Scanner;

public class Input {
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
}

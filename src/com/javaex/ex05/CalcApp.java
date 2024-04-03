package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		int num;
		int num1;

		System.out.println("값을 입력 하세요:");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		num1 = scanner.nextInt();

		Add add = new Add();
		add.setValue(num, num1);
		System.out.println(add.calculate());

	}
}

package calculator_01;

import java.util.Scanner;

public class readFromConsole {

	public static double firstD(String[] args) {

		Scanner sc = new Scanner(System.in);
		double i;

		System.out.print("������� ������ �����: ");
		while (sc.hasNextDouble() == false) {
			String str;
			str = sc.next();
			System.out.println("�� ����� '" + str + "', � ����� ������ �����");
			System.out.print("������� ������ �����: ");
		}
		i = sc.nextDouble();
		return i;
	}

	public static double secondD(String[] args) {

		Scanner sc = new Scanner(System.in);
		double t;

		System.out.print("������� ������ �����: ");
		while (sc.hasNextDouble() == false) {
			String str;
			str = sc.next();
			System.out.println("�� ����� '" + str + "', � ����� ������ �����");
			System.out.print("������� ������ �����: ");
		}
		t = sc.nextDouble();
		return t;
	}
}

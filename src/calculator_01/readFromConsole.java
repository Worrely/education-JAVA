package calculator_01;

import java.util.Scanner;

public class readFromConsole {

	public static double firstD(String[] args) {

		Scanner sc = new Scanner(System.in);
		double i;

		System.out.print("Введите первое число: ");
		while (sc.hasNextDouble() == false) {
			String str;
			str = sc.next();
			System.out.println("Вы Ввели '" + str + "', а нужно ввести число");
			System.out.print("Введите первое число: ");
		}
		i = sc.nextDouble();
		return i;
	}

	public static double secondD(String[] args) {

		Scanner sc = new Scanner(System.in);
		double t;

		System.out.print("Введите второе число: ");
		while (sc.hasNextDouble() == false) {
			String str;
			str = sc.next();
			System.out.println("Вы Ввели '" + str + "', а нужно ввести число");
			System.out.print("Введите второе число: ");
		}
		t = sc.nextDouble();
		return t;
	}
}

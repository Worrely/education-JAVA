package calculator_00;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double x, y, sum;
		System.out.println("Калькулятор");
		x = readFromConsoleFirst();
		y = readFromConsoleSecond();
		sum = calcSum(x, y);
		System.out.println("Результат:");
		printResultSum(x, y, sum);
	}
		
	public static double readFromConsoleFirst() {
		Scanner sc = new Scanner(System.in);
		double i;
		System.out.print("Введите первое число: ");
		while(sc.hasNextDouble() == false) {
			String str;
			str = sc.next();
			System.out.println("Вы Ввели '" + str + "', а нужно ввести число");
			System.out.print("Введите первое число: ");		
		}
		i = sc.nextDouble();
		return i;
	}
	
	public static double readFromConsoleSecond() {
		Scanner sc = new Scanner(System.in);
		double t;		
		System.out.print("Введите второе число: ");
			while(sc.hasNextDouble() == false) {
			String str;
			str = sc.next();
			System.out.println("Вы Ввели '" + str + "', а нужно ввести число");
			System.out.print("Введите второе число: ");
		}
		t = sc.nextDouble();
		return t;
	}
	
	public static double calcSum (double x, double y) {
		double sum;
		sum = x + y;
		return sum;
	}
		
	public static void printResultSum (double x, double y, double sum) {	
		System.out.println(x + " + " + y + " = " + sum);
	}	
	
	
}

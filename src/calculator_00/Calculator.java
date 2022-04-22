package calculator_00;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double x, y, sum;
		System.out.println("�����������");
		x = readFromConsoleFirst();
		y = readFromConsoleSecond();
		sum = calcSum(x, y);
		System.out.println("���������:");
		printResultSum(x, y, sum);
	}
		
	public static double readFromConsoleFirst() {
		Scanner sc = new Scanner(System.in);
		double i;
		System.out.print("������� ������ �����: ");
		while(sc.hasNextDouble() == false) {
			String str;
			str = sc.next();
			System.out.println("�� ����� '" + str + "', � ����� ������ �����");
			System.out.print("������� ������ �����: ");		
		}
		i = sc.nextDouble();
		return i;
	}
	
	public static double readFromConsoleSecond() {
		Scanner sc = new Scanner(System.in);
		double t;		
		System.out.print("������� ������ �����: ");
			while(sc.hasNextDouble() == false) {
			String str;
			str = sc.next();
			System.out.println("�� ����� '" + str + "', � ����� ������ �����");
			System.out.print("������� ������ �����: ");
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

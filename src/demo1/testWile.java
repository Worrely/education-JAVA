package demo1;

import java.util.Scanner;

public class testWile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.print("Введите код валюты в которую нужно посчитать, 1 для USD или 2 для EUR : ");
		while(sc.hasNextInt() == false) {
			String str;
			str = sc.next();
			System.out.println("Вы Ввели '" + str + "', а нужно ввести число");
			System.out.print("Введите первое число: ");		
		}
		i = sc.nextInt();
		
		while(i != 1 & i !=2) {
			String str;
			str = sc.next();
			System.out.println("Вы Ввели '" + str + "', а нужно ввести число 1 или 2");
			System.out.print("Введите код валюты в которую нужно посчитать, 1 для USD или 2 для EUR : ");		
		}
				
		
		switch(i) {
		case 1: i = 1;
			System.out.println("ваше значение 1 = " + i );
			break;
			
		case 2: i = 2;
			System.out.println("ваше значение 2 = " + i );
			break;
		}
	}
		
}

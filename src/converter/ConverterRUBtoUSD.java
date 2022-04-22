package converter;

import java.util.Scanner;

public class ConverterRUBtoUSD {

	public static void main(String[] args) {
		
		System.out.println("RUB to USD conversion");
		Scanner sc = new Scanner(System.in);
		double usd = 75.13 ;  //цена доллара
		double eur = 86.72 ;
		int rub;
		double i, res;
		int v ;
				
		System.out.print("Введите код валюты в которую нужно посчитать, 1 для USD или 2 для EUR : ");
		v = sc.nextInt();
		
		switch(v) {
		case 1: v = 1;
			System.out.print("Введите количество рублей. RUB = ");
			while(sc.hasNextInt() == false) {
				String str;
				str = sc.next();
				System.out.println("Вы Ввели '" + str + "', а нужно ввести целое число рублей");
				System.out.print("Введите количество рублей. RUB = ");		
			}
			rub = sc.nextInt();
			
			i = 1 / usd;
			res = rub * i;
			System.out.println(rub + " RUB = " + res + " USD");
			break;
			
		case 2: v = 2;
			System.out.print("Введите количество рублей. RUB = ");
			while(sc.hasNextInt() == false) {
				String str;
				str = sc.next();
				System.out.println("Вы Ввели '" + str + "', а нужно ввести целое число рублей");
				System.out.print("Введите количество рублей. RUB = ");		
			}
			rub = sc.nextInt();
			
			i = 1 / eur;
			res = rub * i;
			System.out.println(rub + " RUB = " + res + " EUR");
			break;
			
		default:
			v = 3;
			System.out.println("Неправильный код валюты, введите 1 или 2");
		}
		
	}

}

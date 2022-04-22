package converter;

import java.util.Scanner;

public class ConverterRUBtoUSD {

	public static void main(String[] args) {
		
		System.out.println("RUB to USD conversion");
		Scanner sc = new Scanner(System.in);
		double usd = 75.13 ;  //���� �������
		double eur = 86.72 ;
		int rub;
		double i, res;
		int v ;
				
		System.out.print("������� ��� ������ � ������� ����� ���������, 1 ��� USD ��� 2 ��� EUR : ");
		v = sc.nextInt();
		
		switch(v) {
		case 1: v = 1;
			System.out.print("������� ���������� ������. RUB = ");
			while(sc.hasNextInt() == false) {
				String str;
				str = sc.next();
				System.out.println("�� ����� '" + str + "', � ����� ������ ����� ����� ������");
				System.out.print("������� ���������� ������. RUB = ");		
			}
			rub = sc.nextInt();
			
			i = 1 / usd;
			res = rub * i;
			System.out.println(rub + " RUB = " + res + " USD");
			break;
			
		case 2: v = 2;
			System.out.print("������� ���������� ������. RUB = ");
			while(sc.hasNextInt() == false) {
				String str;
				str = sc.next();
				System.out.println("�� ����� '" + str + "', � ����� ������ ����� ����� ������");
				System.out.print("������� ���������� ������. RUB = ");		
			}
			rub = sc.nextInt();
			
			i = 1 / eur;
			res = rub * i;
			System.out.println(rub + " RUB = " + res + " EUR");
			break;
			
		default:
			v = 3;
			System.out.println("������������ ��� ������, ������� 1 ��� 2");
		}
		
	}

}

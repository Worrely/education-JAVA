package demo1;

import java.util.Scanner;

public class testWile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.print("������� ��� ������ � ������� ����� ���������, 1 ��� USD ��� 2 ��� EUR : ");
		while(sc.hasNextInt() == false) {
			String str;
			str = sc.next();
			System.out.println("�� ����� '" + str + "', � ����� ������ �����");
			System.out.print("������� ������ �����: ");		
		}
		i = sc.nextInt();
		
		while(i != 1 & i !=2) {
			String str;
			str = sc.next();
			System.out.println("�� ����� '" + str + "', � ����� ������ ����� 1 ��� 2");
			System.out.print("������� ��� ������ � ������� ����� ���������, 1 ��� USD ��� 2 ��� EUR : ");		
		}
				
		
		switch(i) {
		case 1: i = 1;
			System.out.println("���� �������� 1 = " + i );
			break;
			
		case 2: i = 2;
			System.out.println("���� �������� 2 = " + i );
			break;
		}
	}
		
}

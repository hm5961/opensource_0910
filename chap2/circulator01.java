package test2;

import java.util.Scanner;

public class circulator01 {
	
	public static void main(String num[])
	{
		System.out.print("num1 op num2>>");
		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt(); // �������� �Ǽ��� ǥ���� �϶� ������ ��Ŭ�������� �Ǽ��� ���� �Ұ�
		String op = scanner.next();
		int num2 = scanner.nextInt();
		int res = 0;
		
		if(op.equals("+"))
			res = num1 + num2;
		else if(op.equals("-"))
			res = num1 - num2;
		else if(op.equals("*"))
			res = num1 * num2;
		else if(op.equals("/")) {
			if(num2 == 0)
				System.out.print("/ 0 �Ұ�");
			else 
				res = num1 / num2;
		}
		else
			System.out.print("�Է¿���");
			scanner.close();
		System.out.println(num1 + op + num2 +"�� ������� "+ res);

		scanner.close();
	}
}
package project1;

import java.util.Scanner;

public class TestIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int member = 7;
		//if������ member�� 5�̸�, itzy ���
		//member�� 7�̸�, BTS ���
		//member�� 9�̸�, EXO ���
		//member�� 1�̸�, IU ���
		//member�� 13�̸�, Seventeen ���
		
//		if(member==5)
//			System.out.println("itzy");
//		else if(member==7)
//			System.out.println("BTS");
//		else if(member==9)
//			System.out.println("EXO");
//		else if(member==1)
//			System.out.println("IU");
//		else if(member==13)
//			System.out.println("Seventeen");
//		
//		System.out.println("---------------------------");
//		
		//switch�� �ٲ���
		
//		switch (member) {
//		case 5:
//			System.out.println("itzy");
//		case 7:
//			System.out.println("BTS");
//		case 9:
//			System.out.println("EXO");
//		case 1:
//			System.out.println("IU");
//		case 13:
//			System.out.println("Seventeen");
//		}
//
//		System.out.println("---------------------------");
//		
		//������ 2���� ���
//		for(int i=2; i<=2; i++) { 
//			for(int j=1; j<=9; j++) {
//			System.out.println(i+ "x" + j + "=" + i*j);
//			}
//		}
//		
//		int i = 2;
//		int j = 1;
//		while(j<=9) {
//			System.out.println(i+ "x" + j + "=" + i*j);
//			j++;
//		}
//		
//		System.out.println("---------------------------");
//		
//		System.out.println("������� �Է��ϼ���");
//		Scanner sc = new Scanner(System.in);
//	
//		member = sc.nextInt(); 
		
//		if(member==5)
//			System.out.println("itzy");
//		else if(member==7)
//			System.out.println("BTS");
//		else if(member==9)
//			System.out.println("EXO");
//		else if(member==1)
//			System.out.println("IU");
//		else if(member==13)
//			System.out.println("Seventeen");
		
//		System.out.println("---------------------------");
		
//		System.out.println("������� �Է��ϼ���");
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			member = sc.nextInt();
//		
//		if(member==5)
//			System.out.println("itzy");
//		else if(member==7)
//			System.out.println("BTS");
//		else if(member==9)
//			System.out.println("EXO");
//		else if(member==1)
//			System.out.println("IU");
//		else if(member==13)			
//			System.out.println("Seventeen");
//		 else 
//			System.out.println("Ż��");
//			break;
//			
//		}
		
//		System.out.println("---------------------------");
//		
//		for(int i=0; ; i++) {
//			
//			System.out.println("������� �Է��ϼ���");
		
//			Scanner sc = new Scanner(System.in);
//			member = sc.nextInt();
//			
//			if(member==5)
//				System.out.println("itzy");
//			else if(member==7)
//				System.out.println("BTS");
//			else if(member==9)
//				System.out.println("EXO");
//			else if(member==1)
//				System.out.println("IU");
//			else if(member==13)			
//				System.out.println("Seventeen");
//			 else 
//				System.out.println("Ż��");
//				break;
//		}
		
//		System.out.println("�˰���� ����� ��ȣ�� �Է��ϼ���");
		
		Scanner sc = new Scanner(System.in);
	    member = sc.nextInt();
	    
//	   switch(member) {
//	   
//	   case 1 : System.out.println("������");
//	   break;
//	   case 2 : System.out.println("������");
//	   break;
//	   case 3 : System.out.println("�谡��");
//	   break;
//	   case 4 : System.out.println("�質��");
//	   break;
//	   case 5 : System.out.println("�輱��");
//	   break;
//	   case 6 : System.out.println("�����");
//	   break;
//	   case 7 : System.out.println("������");
//	   break;
//	   case 8 : System.out.println("�ڱ���");
//	   break;
//	   case 9 : System.out.println("������");
//	   break;
//	   case 10 : System.out.println("���¿�");
//	   break;
//	   case 11 : System.out.println("������");
//	   break;
//	   case 12 : System.out.println("��ä��");
//	   break;
//	   case 13 : System.out.println("�̼���");
//	   break;
//	   case 14 : System.out.println("��ä��");
//	   break;
//	   case 15 : System.out.println("������");
//	   break;
//	   case 16 : System.out.println("������");
//	   break;
//	   case 17 : System.out.println("������");
//	   break;
//	   case 18 : System.out.println("�����");
//	   break;
//	   case 19 : System.out.println("�Ѵٿ�");
//	   break;
//	   }
	    
	   System.out.println("�˰���� ����� ��ȣ�� �Է��ϼ���");
	   String[] ��4 = {"������", "������", "�����", "�躽��", "�����", " ��ä��", "������", "�ڼ���", "������", " ��ä��", 
			   "�����", "���ϴ�", "��ä��", "������", "������", "������", "������", "������"};
		
	   while(true) {
		   
		   int number = sc.nextInt();
		   
		   if(1<=number&&number<=18)
		   System.out.println(��4[number - 1]);
		   else
			   break;
	   }
			
		
		
		
	}
	
	

}

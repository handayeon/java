package project1;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 ="mirim";
		String str2 ="mirim";
		String str3 =new String("mirim");
		String str4 =new String("mirim");
		
		if(str1 == str2) System.out.println("�ּ� ����");
		else System.out.println("�ּ� �ٸ���");
		if(str3 == str4) System.out.println("�ּ� ����");
		else System.out.println("�ּ� �ٸ���");
		if(str1.contentEquals(str2)) System.out.println("���� ����");
		else System.out.println("���� �ٸ���");
		if(str3.contentEquals(str4)) System.out.println("���� ����");
		else System.out.println("���� �ٸ���");
		
		System.out.println("--------------------");
		System.out.println(str1.length());
		System.out.println(str1.charAt(2));
	}

}

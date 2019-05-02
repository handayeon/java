package project1;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 ="mirim";
		String str2 ="mirim";
		String str3 =new String("mirim");
		String str4 =new String("mirim");
		
		if(str1 == str2) System.out.println("주소 같다");
		else System.out.println("주소 다르다");
		if(str3 == str4) System.out.println("주소 같다");
		else System.out.println("주소 다르다");
		if(str1.contentEquals(str2)) System.out.println("내용 같다");
		else System.out.println("내용 다르다");
		if(str3.contentEquals(str4)) System.out.println("내용 같다");
		else System.out.println("내용 다르다");
		
		System.out.println("--------------------");
		System.out.println(str1.length());
		System.out.println(str1.charAt(2));
	}

}

package kr.hs.emirim.program;

public class Program {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer(" Java Programing");
		StringBuffer sb2 = new StringBuffer(" Project");
		StringBuffer str1 = null;
		StringBuffer str2 = null;
		str1 = sb1.append(" Project");
		str2 = sb1.append(sb2);
		System.out.println("sb1 = " + sb1);
		System.out.println("sb2 = " + sb2);
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println();
	}
	StringBuffer sb3 = new StringBuffer(" Funy Java");
	StringBuffer str4 = null;
	sb4 = sb3.replace(0, 5, "good");
	
}

package project1;

import java.util.Scanner;

public class TestIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int member = 7;
		//if문으로 member가 5이면, itzy 출력
		//member가 7이면, BTS 출력
		//member가 9이면, EXO 출력
		//member가 1이면, IU 출력
		//member가 13이면, Seventeen 출력
		
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
		//switch로 바꾸자
		
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
		//구구단 2단을 출력
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
//		System.out.println("멤버수를 입력하세요");
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
		
//		System.out.println("멤버수를 입력하세요");
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
//			System.out.println("탈출");
//			break;
//			
//		}
		
//		System.out.println("---------------------------");
//		
//		for(int i=0; ; i++) {
//			
//			System.out.println("멤버수를 입력하세요");
		
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
//				System.out.println("탈출");
//				break;
//		}
		
//		System.out.println("알고싶은 사람의 번호를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
	    member = sc.nextInt();
	    
//	   switch(member) {
//	   
//	   case 1 : System.out.println("강지민");
//	   break;
//	   case 2 : System.out.println("강혜정");
//	   break;
//	   case 3 : System.out.println("김가영");
//	   break;
//	   case 4 : System.out.println("김나영");
//	   break;
//	   case 5 : System.out.println("김선옥");
//	   break;
//	   case 6 : System.out.println("김수진");
//	   break;
//	   case 7 : System.out.println("류정민");
//	   break;
//	   case 8 : System.out.println("박교령");
//	   break;
//	   case 9 : System.out.println("서남경");
//	   break;
//	   case 10 : System.out.println("오승연");
//	   break;
//	   case 11 : System.out.println("원예린");
//	   break;
//	   case 12 : System.out.println("원채린");
//	   break;
//	   case 13 : System.out.println("이서현");
//	   break;
//	   case 14 : System.out.println("이채린");
//	   break;
//	   case 15 : System.out.println("이현수");
//	   break;
//	   case 16 : System.out.println("임현진");
//	   break;
//	   case 17 : System.out.println("장유경");
//	   break;
//	   case 18 : System.out.println("장원이");
//	   break;
//	   case 19 : System.out.println("한다연");
//	   break;
//	   }
	    
	   System.out.println("알고싶은 사람의 번호를 입력하세요");
	   String[] 반4 = {"강은서", "곽가연", "김민지", "김봄이", "김소현", " 김채민", "남정윤", "박서연", "서혜림", " 신채린", 
			   "양수빈", "엄하늘", "원채연", "윤수빈", "임태희", "전은정", "정유경", "함지현"};
		
	   while(true) {
		   
		   int number = sc.nextInt();
		   
		   if(1<=number&&number<=18)
		   System.out.println(반4[number - 1]);
		   else
			   break;
	   }
			
		
		
		
	}
	
	

}

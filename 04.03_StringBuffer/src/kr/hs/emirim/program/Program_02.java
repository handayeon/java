package kr.hs.emirim.program;

public class Program_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer in1 = new Integer(100);
		Integer in2 = new Integer(100);
		Integer in3 = new Integer(100);
		System.out.println("in.equals(in2) --> " + in1.equals(in2));
		System.out.println("in.equals(in3) --> " + in1.equals(in3));
		System.out.println("-------------------");
		
		System.out.println(new Integer(100).toString());
		System.out.println(new Double(55.7).toString());
		System.out.println("-------------------");
		
		System.out.println(Integer.valueOf("123"));
		System.out.println(Double.valueOf("123.456"));
		
		System.out.println(Integer.parseInt("456"));
		
		System.out.println(Double.parseDouble("789.123"));
		
		System.out.println(new Integer(100).intValue());
		System.out.println(new Double(3.31).doubleValue())
		;
	}

}

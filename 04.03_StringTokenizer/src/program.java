import java.util.StringTokenizer;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line;
		String tmpStr = "hong ¿ë»ê±¸ 10.5 20.5";
		StringTokenizer parse =new StringTokenizer(tmpStr);
		String name, address;
		double math, english, total, avg;
		name = parse.nextToken();
		address = parse.nextToken();
		math = Double.parseDouble(parse.nextToken());
		english = Double.parseDouble(parse.nextToken());
		total = math + english;
		avg = total / 2.0;
		System.out.println(name+"\t"+address+"\t"+math+"\t"+english+"\t"+total+"\t"+avg);
		String[] arrStr = tmpStr.split(" ");
		for(String str : arrStr) {
			System.out.println(str +"\t");
		}
	}

}

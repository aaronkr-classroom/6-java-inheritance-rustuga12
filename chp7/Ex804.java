
public class Ex804 extends Math {

	public static void main(String[] args) {
		int a = 10, b = 5;
		double c =2.5, d=4.5;
		
		Ex804 calc = new Ex804();
		
		//Add 더하기
		 System.out.println(a+ "+" +b + "=" + calc.add(a, b)); // (int, int)
		 System.out.println(a+ "+" +c + "=" + calc.add(a, c)); // (int, double)
		 System.out.println(c+ "+" +d + "=" + calc.add(c, d)); // (double, double)
		 
		 System.out.println(a+ "/" +b + "=" + calc.add(a, b)); // (int, int)
		 System.out.println(a+ "/" +c + "=" + calc.add(a, c)); // (int, double)
		 System.out.println(c+ "/" +d + "=" + calc.add(c, d)); // (double, double)
		 
		 System.out.println(a+ "^" +b + "=" + calc.add(a, b)); // (int, int)
		 System.out.println(a+ "^" +c + "=" + calc.add(a, c)); // (int, double)
		 System.out.println(c+ "^" +d + "=" + calc.add(c, d)); // (double, double)
		 
		
	}

}

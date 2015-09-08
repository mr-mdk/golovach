

public class NumbersTest {

	public static void main(String[] args) {
		String str = "-0";
		double d = 18.0 / Double.valueOf(str);
		System.out.println(d);
		System.out.println(d > 0);
		System.out.println(Math.PI / Double.valueOf("NaN"));
		
	}

}

public class nestedLoops {

	public static void main(String[] args) {
		for (int a = 0; a < 5; a++) {
			for (int b = 0; b < 5; b++) {
				System.out.print((a + b >= 4) ? "*" : "-");
			}
			System.out.print("|");
			for (int b = 0; b < 5; b++) {
				System.out.print(b <= a ? "*" : "-");
			}
			System.out.println();
		}
	}

}

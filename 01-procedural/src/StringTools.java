public class StringTools {

	public static String invertString(String str) {
		char[] data = str.toCharArray();
		for (int k = 0; k < data.length / 2; k++) {
			char temp = data[k];
			data[k] = data[data.length - 1 - k];
			data[data.length - 1 - k] = temp;
		}
		return new String(data);
	}

	public static void main(String[] args) {
		String str = "123ab456789";
		char[] ch = str.toCharArray();
		System.out.println(ch);
		String newStr = invertString(str);
	}

}

import java.util.Arrays;

import javax.management.openmbean.ArrayType;

public class ArraysTest2 {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ar2 = { 1, 2, 3, 9 };
		int[] ar3 = { 5, 6, 7, 8, 9, 0 };
		// System.out.println("ar[] before: " + Arrays.toString(ar));
		// // int[] new_ar = ArraysTools.invertInt(ar);
		// System.out.println("ar[] sorted: "
		// + Arrays.toString(ArraysTools.invertIntArray(ar)));
		// System.out.println("ar2[] sorted: "
		// + Arrays.toString(ArraysTools.invertIntArray(ar2)));
//		System.out.println("ar[] sorted: "
//				+ Arrays.toString(ArraysTools.invertMiddleStart(ar)));
//		StringTools st = new StringTools();
//		String ss = st.invertString("123");
//		System.out.println(StringTools.invertString("56789"));
		int[] toSort = new int[] {9,4,2,8,7,5};
		ArraysTools.bubbleSort(toSort);
		System.out.println(Arrays.toString(toSort));
	}
}

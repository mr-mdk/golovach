import java.util.Arrays;

public class ArraysTools {

	/**
	 * @deprecated Use {@link #invertIntArray(int[])} instead
	 */
	public static int[] invertInt(int[] ar) {
		return invertIntArray(ar);
	}

	public static int[] invertIntArray(int[] ar) {
		int[] tmp_ar = ar.clone();
		int len = tmp_ar.length;
		for (int k = 0; k < len/2; k++) {
			int tmp = tmp_ar[k];
			tmp_ar[k] = tmp_ar[len-1 - k];
			tmp_ar[len-1 - k] = tmp;
		}
		return tmp_ar;
	}

	public static int[] invertMiddleStart(int[] arr) {
		int[] tmp_arr = arr.clone();
		int middle = tmp_arr.length / 2;
		int prev = middle;
		int next = middle;
		for (; prev >= 0; prev--, next++) {
			int tmp = tmp_arr[prev];
			tmp_arr[prev] = tmp_arr[next];
			tmp_arr[next] = tmp;
		}
		return tmp_arr;
	}

	public static void bubbleReverseSort(int[] array) {
		int len = array.length;
		System.out.println(Arrays.toString(array));
		for (int k = 1; k < len - 1; ++k) {
			for (int j = len - 1; j >= k; --j) {
				if (array[j] > array[j - 1]) {
					int tmp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = tmp;
				}
			}
		}
	}

	public static void bubbleSort(int[] array) {
		int len = array.length;
		for (int barrier = len - 1; barrier >= 0; barrier--) {
			for (int index = 0; index < barrier; index++) {
				if (array[index] > array[index + 1]) {
					int tmp = array[index];
					array[index] = array[index + 1];
					array[index + 1] = tmp;
				}
			}
		}
	}

	public static void bubbleSortFromEndToStart(int[] array) {
		int len = array.length;
		for (int barrier = 0; barrier <= len-1; barrier++) {
			for (int index = len-1; index > barrier; index--) {
				if (array[index] < array[index-1]) {
					int tmp = array[index];
					array[index] = array[index-1];
					array[index-1] = tmp;
				}
			}
		}
	}
}

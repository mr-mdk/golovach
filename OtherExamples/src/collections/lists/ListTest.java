package collections.lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListTest {
	static List<Integer> al = new ArrayList<>();

	public static void main(String[] args) {
		// long start = System.currentTimeMillis();
		for (int k = 1; k <= 1_000_000; k++) {
			al.add(k);
		}
		// System.out.println((System.currentTimeMillis()-start)/1000.0 +
		// " sec");
		// for (int i = 0; i <al.size(); i++) {
		// if (i % 20 == 0)
		// System.out.println();
		// System.out.print(al.get(i) + " ");
		// }
		// System.out.println(al);
		Comparator<Integer> cmp = Collections.reverseOrder();
		Collections.sort(al, cmp);
		System.out.println(al);
	}

}

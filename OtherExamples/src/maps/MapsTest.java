package maps;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsTest {
	static Map<Integer, String> tm = new TreeMap<>();
	static Map<Integer, String> hm1 = new HashMap<>();
	static Map<Integer, String> hm2 = new HashMap<>();
	public static void main(String[] args) {
		for(char k = 'h'; k>='a'; k--)
			tm.put((int)k, String.valueOf(k));
		tm.put(40, "a");
		System.out.println("Three Map tm: "+ tm);
		for(char k = 'b'; k<='h'; k++)
			hm1.put((int)k, String.valueOf(k));
		hm1.put(199, "a");
		System.out.println("HashMap hm1:  "+ hm1);
		System.out.println(hm1.values());
		System.out.println(hm1.get(98));

	}

}

package lect1;

import java.lang.reflect.*;
import java.util.*;

public class ArraysTest {
	static int[] arr1 = {1,2,3,4,5};
	static Integer a = new Integer(50);
	public ArraysTest() {
		System.out.println("ArraysTest");
	}
	public ArraysTest(String s) {
		System.out.println(s);
	}
	@SuppressWarnings({ "resource", "rawtypes" })
	public static void main(String[] args) throws ClassNotFoundException {
		ArraysTest at = new ArraysTest("");
		int[] arr2;
		Class cl = Class.forName("lect1.ReflectionTest");
	
		Constructor[] cons = cl.getDeclaredConstructors();
//		for(Constructor co : cons) {
//			Class[] paramTypes = co.getParameterTypes()
//		}
		for (Constructor c : cons) {
			String name = c.getName();
			System.out.print("   ");
			String modifiers = Modifier.toString(c.getModifiers());
			if (modifiers.length() > 0)
				System.out.print(modifiers + " ");
			System.out.print(name + "(");

			// print parameter types
			Class[] paramTypes = c.getParameterTypes();
			System.out.println(paramTypes.length);
			for (int j = 0; j < paramTypes.length; j++) {
				if (j > 0)
					System.out.print(", ");
				System.out.print(paramTypes[j].getName());
			}
			System.out.println(");");
		}

		
//		System.out.println(param[1].getName());
//		System.out.println(at.getClass().getSimpleName());
//		System.out.println(arr1);
//		System.out.println(toString(arr1)+'\n');
//		System.out.println(toString(a)+'\n');
//		System.out.println(Arrays.deepToString(arr1));

	}
	public static String toString(int[] ar) {
		System.out.print("Your array is: ");
		for(int a : ar)
			System.out.printf("%d ", a);
		ar[2] = 56;
		System.out.println("\n" + ar[2]);
		return "";
	}
//	public static String toString(int var) {
//		System.out.print("Your variable is: " + var + '\n');
//		var = 4;
//		System.out.println(a);
//		return "";
//	}
	public static String toString(int var) {
		System.out.print("Your variable is: " + var + '\n');
		var = 4;
		System.out.println(a);
		return "";
	}
}

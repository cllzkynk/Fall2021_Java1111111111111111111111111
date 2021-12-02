/**
 * 
 */
package day25_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author CEL�L
 */
public class Q09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 9) isEmpty() methodu kullanarak, list�deki tum elemanlarin silindigini dogrulayiniz
		 */
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("E");
		list.add("F");

		list.add("B");

		list.add(1, "L");

		
		list.set(3,"D");
		list.remove(4);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.contains("L"));
		System.out.println(list.size());
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());

	}

}

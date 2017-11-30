package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Jihezuowu {
public static void main(String[] args) {
//	Map<String,String> nishi=new HashMap<String,String>();
//	nishi.put("—ß∫≈", "ƒÍ¡‰");
//	nishi.put("1", "18");
//	nishi.put("2", "19");
//	nishi.put("3", "20");
//	nishi.put("4", "21");
//	nishi.put("5", "22");
//	nishi.put("6", "23");
//	nishi.put("7", "24");
//	 System.out.println(nishi);
//     Object value = nishi.get(1);
//	System.out.println(value);
		List<String> a=new ArrayList<String>();
		a.add("ddd");
		a.add("ddds");
		a.add("ddd");
		a.add("ddds");
		a.add("ddds");
		a.add("ddd");
		Iterator<String>b=a.iterator();
		while(b.hasNext()){
			String c=b.next();
			if("ddd".equals(c)){
				b.remove();
			}
			System.out.print(b+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(a);
		
//		a.add(2, "23");
//		a.add(3, "23");
//		a.add(1, "23");
//		a.add(1, "23");
//		a.add(1, "23");
//		a.add(1, "23");
//		a.add(1, "23");

}
}

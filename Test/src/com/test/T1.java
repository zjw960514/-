package com.test;

import java.util.ArrayList;
import java.util.List;

public class T1 {

	public static void main(String[] args) {

		List<String> a = new ArrayList<String>();
		a.add("d");
		a.add("ds");
		a.add("dss");
		a.add("daa");
		a.add("dww");
		a.add("ds");
		List<String> l = new ArrayList<String>();
		for (int n = 0; n < a.size(); n++) {
			for (int i = n + 1; i < a.size(); i++) {
				if (a.get(n).equals(a.get(i))) {
					if (!l.contains(a.get(n))) {
						System.out.println(a.get(n));
						l.add(a.get(n));
					}
					if (!l.contains(a.get(i))) {
						System.out.println(a.get(i));
						l.add(a.get(i));
					}
				}
			}
		}
		for (String asd : l) {
			System.out.print(" " + asd);
		}
	}
}

// int s = -1;
// int c = -1;
// for(int asd:l){
// if(asd == n){
// s =1;
// }
// if(asd == i){
// c = 1;
// }
// }
// if(s == -1){
// l.add(n);
// }
// if(c == -1){
// l.add(i);
// }
// }


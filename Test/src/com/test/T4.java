package com.test;

import java.util.ArrayList;
import java.util.List;

public class T4 {
public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	list.add("刘毅");
	list.add("李四");
	list.add("刘导弹");
	list.add("啊啊啊");
	list.add("张三");
	list.add("士大夫");
	list.add("山水");
	list.add("古古怪");
	list.add("刘毅");
	List<Integer> lis=new ArrayList<Integer>();
	for(int a=0;a<list.size();a++){
		for(int b=a+1;b<list.size();b++){
			if(list.get(a).equals(list.get(b))){
				if(!lis.contains(a)){
					lis.add(a);
			}
				if(!lis.contains(b)){
					lis.add(b);
				}
			}
		}
	}
}
}

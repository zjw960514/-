package com.test;

import java.util.ArrayList;
import java.util.List;

public class T4 {
public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	list.add("����");
	list.add("����");
	list.add("������");
	list.add("������");
	list.add("����");
	list.add("ʿ���");
	list.add("ɽˮ");
	list.add("�ŹŹ�");
	list.add("����");
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

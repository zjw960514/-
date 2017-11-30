package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Jihe {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		
		
	
		list.add("C");
		list.set(0, "D"); // �޸ĵ�һ�����Ϊ��D
		// list.set(1,"dssdsd");���Ǵ�ģ�����ֳ������鳤�ȵ��쳣��
		// ��Ϊlistֻ��һ��dddd��ֵ��������û���޸ľͻ�����ӵ�������޸ľ����޸�
		int v = list.size(); // ��ȡlist�ĳ��Ȳ���ֵ��v
		System.out.println(v);// ��ӡv
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			if ("D".equals(s)) {
				itr.remove();
			}
		}

		for (String ss : list) {
			System.out.println(ss);

		}
	}
}

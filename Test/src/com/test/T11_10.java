package com.test;

import java.util.*;
import java.util.Map.Entry;

public class T11_10 {

	public static void main(String[] args) {
		// ��һ��
		List<String> a = new ArrayList<String>();
		a.add("1");//0
		a.add("2");//1
		a.add("3");//
		a.add("4");//2
		a.add("4");//3
		a.add("3");//
		a.add("4");//4
		a.add("2");//5
		// ������ɾ�����еĽ�3��ͬѧ
		Iterator<String> b = a.iterator();
		while (b.hasNext()) {
			String c = b.next();
			if ("3".equals(c)) {
				b.remove();
			}
		}
		for (String d : a) {
			System.out.print(d);
		}
		// ��ȡ������ͬѧ������
		a.get(2);
		System.out.println();
		// ������ͬѧ��ӵ�������
		a.add("����");
		for (String f : a) {
			System.out.print(f);
		}
		System.out.println();
		//5.ʹ��equals�����ҳ�������ͬͬѧ��λ��
		List<Integer> i=new ArrayList<Integer>();
		for(int g=0;g<a.size();g++){
			for(int h=g+1;h<a.size();h++){
				if(a.get(g).equals(a.get(h))){
					if(!i.contains(g)){
						i.add(g);
					}
					if(!i.contains(h)){
						i.add(h);
					}
				}
			}
		}
		for(int j:i){
			System.out.print(j);
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		//���һ��map���������ѧ�ź�����
		Map<String,String> k=new HashMap<String,String>();
		k.put("1", "18");
		k.put("3", "16");
		k.put("7", "28");
		k.put("5", "18");
		k.put("2", "68");
		k.put("0", "18");
		k.put("16", "18");
		//����������е�ѧ��
		for(Entry<String, String> tn:k.entrySet()){
//			System.out.print("ѧ��"+tn.getKey()+" ");
//			System.out.print("����"+tn.getValue()+" ");
//			System.out.println();
			//���������18��ѧ����ѧ��
			if(tn.getValue().equals("18")){
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println(tn.getKey());
			}
		}
		// �ġ�����һ��arraylist����
				List<String> m =new ArrayList<String>();
				m.add("nihao");
				m.add("wohao");
				m.add("dajiahao");
				m.add("nihao");
	   //��list�ĵڶ���λ�����Ԫ�أ�tahao
				m.add(1,"tahao");
	   //��Iterator��������ӡlist��Ԫ��
				Iterator<String> n=m.iterator();
				while(n.hasNext()){
					String o=n.next(); 
					if("nihao".equals(o)){
						o="nibuhao";
					}
				}
				
	}
}
package com.test;

public class T_11_09 {
	public static void main(String[] args) {
		// String [] b={"d","e","j","hh","jjssssssss","kk","hh","ff","ddd21"};
		// String [] a=new String[b.length];
		// for(int i=0;i<b.length;i++)
		// a[i]=b[i];
		// // for (String s:a){
		// // System.out.print(" "+s);
		// // }
		// for(int s=0;s<a.length;s++){
		// String po=a[s];
		// System.out.println(po);
		// }
		// ��A�����е�ǰ���Ԫ�ظ��Ƶ�B������
		// String []a={"k","hh","gg","ddd","dddssss","oooooooooo"};
		// String []b=new String[a.length];
		// for(int d=0;d<=4;d++){
		// b[d]=a[d];
		// }
		// for(String df:b){
		// System.out.println(df);
		// }
		// .�ж�һ�������Ƿ�Գơ�
		// int []b=new int[10];
		// int []a=new int[8];

		// int []b={9,3,2,3,23,26,644,64,6};
		// int [] a={1,1,1,1,1,1,11,1,1,1};
		// for(int i=0;i<b.length;i++){
		// int n=b[i];
		//
		// }

		int score[] = { 667, 69,95, 88, 89, 90, 199, 100 };
		for (int i = 0; i < score.length - 1; i++) { // �����n-1������
			for (int j = 0; j < score.length - i - 1; j++) { // �Ե�ǰ��������score[0......length-i-1]��������(j�ķ�Χ�ܹؼ��������Χ��������С��)
				if (score[j] < score[j + 1]) { // ��С��ֵ����������
					int temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
				}
			}
			System.out.print("��" + (i + 1) + "����������");
			for (int a = 0; a < score.length; a++) {
				System.out.print(score[a] + "\t");
			}
			System.out.println("");
		}
		System.out.print("������������");
		for (int a = 0; a < score.length; a++) {
			System.out.print(score[a] + "\t");
		}

		// if(b.length==a.length){
		// for(int i=0;i<a.length;i++){
		// if(a[i] != b[a.length-1-i]){
		// System.out.println("������");
		// break;
		// }
		// }
		// System.out.println("�Գ�");
		// }else
		// {System.out.println("���Գ�");}
	}
}

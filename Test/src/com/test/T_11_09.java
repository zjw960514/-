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
		// 把A数组中的前五个元素复制到B数组中
		// String []a={"k","hh","gg","ddd","dddssss","oooooooooo"};
		// String []b=new String[a.length];
		// for(int d=0;d<=4;d++){
		// b[d]=a[d];
		// }
		// for(String df:b){
		// System.out.println(df);
		// }
		// .判断一个数组是否对称。
		// int []b=new int[10];
		// int []a=new int[8];

		// int []b={9,3,2,3,23,26,644,64,6};
		// int [] a={1,1,1,1,1,1,11,1,1,1};
		// for(int i=0;i<b.length;i++){
		// int n=b[i];
		//
		// }

		int score[] = { 667, 69,95, 88, 89, 90, 199, 100 };
		for (int i = 0; i < score.length - 1; i++) { // 最多做n-1趟排序
			for (int j = 0; j < score.length - i - 1; j++) { // 对当前无序区间score[0......length-i-1]进行排序(j的范围很关键，这个范围是在逐步缩小的)
				if (score[j] < score[j + 1]) { // 把小的值交换到后面
					int temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
				}
			}
			System.out.print("第" + (i + 1) + "次排序结果：");
			for (int a = 0; a < score.length; a++) {
				System.out.print(score[a] + "\t");
			}
			System.out.println("");
		}
		System.out.print("最终排序结果：");
		for (int a = 0; a < score.length; a++) {
			System.out.print(score[a] + "\t");
		}

		// if(b.length==a.length){
		// for(int i=0;i<a.length;i++){
		// if(a[i] != b[a.length-1-i]){
		// System.out.println("不可以");
		// break;
		// }
		// }
		// System.out.println("对称");
		// }else
		// {System.out.println("不对称");}
	}
}

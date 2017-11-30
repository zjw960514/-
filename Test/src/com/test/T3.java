package com.test;

public class T3 {
	public static void main(String[] args) {
//		for (int i=1;i<=9;i++){
//			for(int n=1;n<=i;n++){
//				System.out.print(i+"*"+n+"="+i*n+" ");
//			}
//			System.out.println();
//		}
//		int b=0;
//		int a =0;
//		for(int i=0;i<=100;i++){
//			if(i%10==3){
//				continue;
//			}
//			a=a+i;
//		}
//		System.out.println(a);
//		for(int i=1;i<=5;i++){
//			for(int n=1;n<=2*i-1;n++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=10;i++){
//			for(int c=9;c>=i;c--)
//			System.out.print(" ");
//			for(int n=1;n<=2*i-1;n++)
//			System.out.print("*");
//			System.out.println();
//		}
		for(int i=-100;i<=100;i++){
			if(i==0){
				System.out.println(i+"既不是偶数也不是奇数");
			}else
				if(i%2==0){
					System.out.println(i+" 是偶数");
				}else{
					System.out.println(i+" 是奇数");
				}
			}
	}
}

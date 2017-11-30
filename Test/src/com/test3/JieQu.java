package com.test3;

import java.util.Scanner;

import org.junit.Test;

import sun.nio.cs.ext.DoubleByte.Decoder_EBCDIC_DBCSONLY;
import sun.text.normalizer.VersionInfo;

public class JieQu {

	public static void main(String[] args) {
		System.out.println("请输入：你是谁，并加上：你是zz，比如：我是xxx我是zz");
		Scanner scanner = new Scanner(System.in);
		String aString = scanner.next();
		String ss = "[a-zA-Z]+我是zz";

		if (aString.matches(ss)) {
			System.out.println("pppp");

		} else {
			System.out.println("NoNoNo,重新输");
		}
	}

	@Test
	public void testReplace() {
	      //public String replaceAll(String regex, String replacement)
	      //使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串
	      String str = "dhfiher7823hdf23iahAHD3433dfhidh123dhf";
	      String result = str.replaceAll("\\d+", "#NUMBER#");
	      System.out.println(result);
	}
	
	@Test
	public  void Testerr(){
		// TODO Auto-generated method stub
		int a = 2;
		int b = 2; 
		Testerr(23,1);
	}
	
	@Test
	public void  Testerr(int a , int b ){
	 
	 	try {
			int n = a / b;
			System.out.println(n);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("程序有错误");
		}finally {
			System.out.println(525555555);
		}
	}


}

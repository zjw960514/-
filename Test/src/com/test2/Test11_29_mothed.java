package com.test2;

import org.junit.Test;

public class Test11_29_mothed {
	@Test
	public  void get(){
		String string = "TestC# .net";
		System.out.println(string.length());/*打印结果为11*///打印变量的长度。
		System.out.println(string.charAt(0));/*打印结果为T*///打印第几个字符，下标跟数组一样是从0开始的
		System.out.println(string.indexOf('e'));/*打印结果为1*///打印需要查找的字符，输出的时候，java会根据所查到的第一个
		//字符的位置输出,另外：indexOf后面带的参数可以是字符的原因是：char类型的所表达的变量的长度小于int，所以此时char类型会有一个自动类型转换成int
		System.out.println(string.indexOf('n', 8 ));/*打印结果为8*///从字符出现的第一个位置开始查找，同样的，char自动转换为int
		System.out.println(string.indexOf("n", 8 ));/*打印结果为8*///从指定的字符出现的位置开始查找，String比int所表示的东西多，所以不会自动转换为int，
		//因此，java就根据字符串来进行查找
		System.out.println(string.lastIndexOf('e'));/*打印结果为9*/ //查询最后一个被查找的字符出现在哪个位置。下标依然像数组一样是从0开始
		System.out.println(string.lastIndexOf("s"));/*打印结果是2*/ //last是从字符串的最后面开始查找，然后找出最靠右的那个被查找的内容，打印出的结果，实际是字符串里的第三个数字
		System.out.println(string.lastIndexOf('e',9));/*打印结果 是1*/ //从第12个位置开始查找，找到符合前面字符条件的最后一个
		System.out.println(string.lastIndexOf("t",9));
		System.out.println(string.contains("est"));//查看是否包含这个字符串，返回值是一个Boolean类型的数值
		System.out.println(string.startsWith("Test"));//是从第一个数来查找字符串。可以理解成是否还有这个字符串
		System.out.println(string.startsWith("est" , 1 ));//是从第一个数来查找字符串。可以理解成去查找是否还有这样字符串
		System.out.println(string.endsWith("net"));//从最后一个字符来判断是否含有需要判断的字符。通常用来判断字符串是否以制定的后缀来结束
		char[] array = {'g','h','j','k','l'};
		String charArray1= new String(array);
		System.out.println(array);
		char[] charArray = charArray1.toCharArray();
		for (char c : charArray) {
			System.out.println(c);
		}//数组和字符串的相互转化。一个字符串可以转化为一个char类型的数组
		System.out.println(string.replace("est", "eee"));//替换掉字符
		System.out.println(string.substring(2, 5));//从第几个到第几个街区出来，得到的是一个返回值
		String ZiFuChuan = "  java is good ";
		System.out.println(ZiFuChuan.trim());//去除前后的空格，只是去除前后的字符串，中间的不管
	}
}

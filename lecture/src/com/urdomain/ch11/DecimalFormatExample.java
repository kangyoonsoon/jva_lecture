package com.urdomain.ch11;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0000000000.00000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));

		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("##########.#####");
		System.out.println(df.format(num));
	
		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));

		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
	
		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num));
		
		// 양수 혹은 음수
		df = new DecimalFormat("+#,### ; -#,###");
		System.out.println(df.format(num));

		df = new DecimalFormat("#.# %");
		System.out.println(df.format(num));
		
		// 통화기호
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num));
		}

}
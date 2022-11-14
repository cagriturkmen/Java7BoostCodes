package com.bilgeadam.week01.lesson005;

public class ArithmeticOperators {

	public static void main(String[] args) {

//		int x = 2;
//		float y = 1.51f;
//		double z = 1.50;
		
		//toplama çıkarma bölme çarpma modssdf
		double x = 2;
		double y = 7;
		
		double sum;
		double div;
		double sub;
		double mod;
		double multi;
		
		
		sum = x+y;
		div = y/x;
		sub = y-x;
		multi = x*y;
		mod = y%x;
//		System.out.println("Sum : "+ sum);
//		System.out.println("Div : "+  div);
//		System.out.println("Sub : "+ sub);
//		System.out.println("Multi : "+ multi);
//		System.out.println("Mod : "+ mod);
		
		x++;
		System.out.println(x);
		x= x+1;
		System.out.println(x);
		x+=1;
		System.out.println(x);
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x);
		
		x-=5;
		x*=5;
		x/=5;
		x%=5;
		
	}

}

package com.bilgeadam.week01.lesson005;

import java.util.Scanner;

public class ArithmeticExamples {

	public static void main(String[] args) {
		
		//number adında bir değişken tanımladım. Bu değişkenin veri tipinin integer olduğunu söyledim.
		int number;	
		System.out.println("Please enter a number: ");
		//Scanner sınıfını kullanarak bir tarayıcı nesne oluşturdum(scan). scan ile kullanıcının yaptığı girişi okuyacağım
		Scanner scan = new Scanner(System.in);
		//Kullanıcının yaptığı girişi okuyup number değişkenine atadım.
		number = scan.nextInt();
		//number değişkeni içerisinde artık kullanıcının girdiği sayı var
		//number'ı yazdırdım.
		System.out.println("Number you choose : " + number);
		scan.close();
	}

}

package com.bilgeadam.week03.lesson003.atm;

import java.util.Scanner;

public class Atm {
	
	static Scanner scanner = new Scanner(System.in);
	static int balance = 1500;
	static int count = 3;
	static String userName = "user";
	static String password = "123";
	static int selection;
	static int amount;
	static boolean condition=true;
	public static void main(String[] args) {
		while(condition) {
		System.out.println("Lutfen kullanici adinizi giriniz: ");
		String userNameInput = scanner.nextLine();
		System.out.println("Lutfen sifrenizi giriniz: ");
		String passwordInput = scanner.nextLine();
		count--;
		if(userName.equals(userNameInput)&&password.equals(passwordInput)) {
			System.out.println("Bankamiza hosgeldiniz.");								
		while(true) {
		System.out.println("1-)Para Yatirma\n2-)Para Cekme\n3-)Bakiye sorgulama\n4-)Cikis Yap");
		selection = scanner.nextInt();
		switch (selection) {
		case 1:
			depositMoney();
			break;
		case 2:
			withdrawMoney();
			break;
		case 3:
			showBalance();
			break;
		case 4:
			systemExit();
			break;	
		default:
			System.out.println("Gecersiz bir giris yaptiniz.");
			break;
		}
		}
		}else {
			System.out.println("Kullanici adi veya sifresi yanlis");
			if(count==0) {
				System.out.println("Kartiniz bloke olmustur. Lutfen banka ile iletisime gecin.");
				break;
			}else {
				System.out.println("Kalan hakkiniz: "+ count);
			}
		}
		}
	System.out.println("En ustteki while'ı kırdım kaldıgımm yerden devam ediyorum.");
		
	}
	
	
	//------------Methodları tanımladık aşağıda-----------------//
	public static void depositMoney() {
		System.out.println("Lutfen yatirmak istediginiz miktari giriniz: ");
		amount = scanner.nextInt();
		balance += amount;
		System.out.println("Hesabiniza " + amount+ " TL para yatirilmistir");
	}
	
	public static void withdrawMoney() {
		System.out.println("Lutfen cekmek istediginiz miktari giriniz: ");
		amount = scanner.nextInt();
		if(amount>balance) {
			System.out.println("Hesabinizda yeterli bakiye bulunmamaktadir.");
		}else {
		balance -= amount;
		System.out.println("Hesabinizdan " + amount+ " TL para cekilmistir");
		}
	}
	
	public static void showBalance() {
		System.out.println("Hesabinizda toplam: "+ balance+ " TL bakiye bulunamktadir.");
	}
	
	public static void systemExit() {
		System.out.println("Sistemden cikiliyor...");
		System.exit(0);
	}

}

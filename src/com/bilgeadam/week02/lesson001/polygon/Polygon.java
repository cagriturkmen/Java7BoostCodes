package com.bilgeadam.week02.lesson001.polygon;

//Bir interface'imiz olucak.
//Eşkenar Çokgenlerle alakalı metodların tümünü barındıracak.
/*Metodlar: 1- Alan hesabı yapacak
			2- Kenar sayısını söyleyecek
			
Üçgen ve Dörtgen sınıfları yaratılıp, interfaceteki metodları implement edilecek.
Bir test sınıfı yaratıp oluşturduğunuz sınıflardan nesneler yaratıp metodlarını deneyin.			
*/
public interface Polygon {
	
	void getArea(double length);
	
	
}

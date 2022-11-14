package com.bilgeadam.week01.lesson005;

import javax.swing.JOptionPane;

public class PrintFunction {

	public static void main(String[] args) {
		
		String hello = "Hello";
		String world = "World";
		
//		System.out.print(hello);
//		System.out.println(world);
		
		JOptionPane.showMessageDialog(null, hello, "First JoptionPane", JOptionPane.CANCEL_OPTION);
//		JOptionPane.showMessageDialog(null, "Are you sure");
	}

}

package com.bilgeadam.week03.lesson005.hw;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
 Single Responsibility
 -- Open/Close Principle
 Liskov's Substition Principle
 Interface Segregation
 Dependency Inversion 
 * */

public class Test {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		
		Doctor doc1 = new Doctor("Doc1Name","Doc2LastName",20000);
        Doctor doc2 = new Doctor("Doc2Name","Doc2LastName",18000);
        
        Janitor jan1 = new Janitor("Janitor1Name","Janitor1LastName",5500);
        Janitor jan2 = new Janitor("Janitor2Name","Janitor2LastName",6000);

        Nurse nurse1 = new Nurse("Nurse1Name","Nurse1LastName",12000);
        Nurse nurse2 = new Nurse("Nurse2Name","Nurse2LastName",11000);
        
        Manager manager1 = new Manager("Manager1Name","Manager1LastName",25000);
        Manager manager2 = new Manager("Manager2Name","Manager2LastName",30000);
        
        employees.add(doc1);
        employees.add(doc2);
        
        employees.add(jan1);
        employees.add(jan2);
        
        employees.add(nurse1);
        employees.add(nurse2);
        
        employees.add(manager1);
        employees.add(manager2);
        
        manager1.increaseSalary();
        
        List<Employee> managerList = new ArrayList<>();
        for (Employee employee : employees) {

        	if(employee instanceof Nurse) {
        		managerList.add(employee);
        	}        	
        }
        for (Employee manager : managerList) {
			System.out.println(manager);
		}
        
		
	}

}

package com.bilgeadam.week03.lesson005.hw;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		
		Doctor doc1 = new Doctor("Doc1Name","Doc2LastName",Jobs.Doctor,20000);
        Doctor doc2 = new Doctor("Doc2Name","Doc2LastName",Jobs.Doctor,18000);
        
        Janitor jan1 = new Janitor("Janitor1Name","Janitor1LastName",Jobs.Janitor,5500);
        Janitor jan2 = new Janitor("Janitor2Name","Janitor2LastName",Jobs.Janitor,6000);

        Nurse nurse1 = new Nurse("Nurse1Name","Nurse1LastName",Jobs.Nurse,12000);
        Nurse nurse2 = new Nurse("Nurse2Name","Nurse2LastName",Jobs.Nurse,11000);
        
        Manager manager1 = new Manager("Manager1Name","Manager1LastName",Jobs.Manager,25000);
        Manager manager2 = new Manager("Manager2Name","Manager2LastName",Jobs.Manager,30000);
        
        employees.add(doc1);
        employees.add(doc2);
        
        employees.add(jan1);
        employees.add(jan2);
        
        employees.add(nurse1);
        employees.add(nurse2);
        
        employees.add(manager1);
        employees.add(manager2);
        
        List<Employee> managerList = new ArrayList<>();
        for (Employee employee : employees) {

        	if(employee.job==Jobs.Manager) {
        		managerList.add(employee);
        	}        	
        }
        for (Employee manager : managerList) {
			System.out.println(manager);
		}
        
		
	}

}

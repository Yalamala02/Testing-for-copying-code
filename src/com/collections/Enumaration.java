package com.collections;

import java.util.Enumeration;
import java.util.Vector;

public class Enumaration {

	public static void main(String[] args) {
	
		Vector<String> v = new Vector<String>();
		v.add("JAVA");
		v.add("Java Script");
		v.add("hibernate");
		v.add("Spring");
		v.add("Spring Boot");
		v.add("Oracle");
		Enumeration<String> en = v.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}

	}

}

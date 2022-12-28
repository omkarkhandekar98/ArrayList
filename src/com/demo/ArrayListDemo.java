package com.demo;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	
	ArrayList<String> list=new ArrayList<String>();
	list.add("Omkar");
	list.add("Avaneesh");

	list.stream().forEach(x->System.out.println(x));
	
}
}

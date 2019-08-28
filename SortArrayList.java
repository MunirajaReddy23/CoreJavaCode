package com.muniraja.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al=new ArrayList<String>();
		al.add("reddy");
		al.add("muni");
		al.add("raja");
		al.add("30");
		al.add("abhay");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		ArrayList<Student> all=new ArrayList<Student>();
		
		all.add(new Student("muni",582));
		all.add(new Student("raja",546));
		all.add(new Student("reddy",569));
		all.add(new Student("hari",592));
		Collections.sort(all);
		System.out.println("sorted list:"+all);
		
		ArrayList<Student> al1=new ArrayList<Student>();
		
		al1.add(new Student("muni",582));
		al1.add(new Student("raja",546));
		Collections.sort(al1);
		System.out.println("sorted list:"+al1);
	}

}

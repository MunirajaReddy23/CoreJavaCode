package com.muniraja.ArrayList;

import java.util.Comparator;

public class SortByComparator implements Comparator<Student> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.getId().compareTo(s2.getId());
			}

}

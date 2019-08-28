package com.muniraja.ArrayList;

public class Student implements Comparable<Student>{

	String name;
	int id;
	Student(String name, int id){
		this.name=name;
		this.id=id;
	}
	public String toString() {
		return name+" "+id;
		//return name.compareTo(s.getName());
	}
	
	
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return name.compareTo(s.getName());
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}

}

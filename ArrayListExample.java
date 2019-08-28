package com.muniraja.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {
	
	public static void main(String args[]) 
	{
	//creating an arraylist with initial size 10 
	
		List<String> al=new ArrayList<String>();
	
	//adding elements to the AL by using add() method
		al.add("muni");
		al.add("raja");
		al.add("null");
		al.add("krish");
		al.add("10");
		al.add("null");
		al.add("muni");
		al.add("reddy");
		al.add("20");
		
	//1.printing arraylist elements
		System.out.println("ArrayList size:"+al.size());
		System.out.println(al);
		Collections.sort(al);
	//Checking is array list is empty or not	
		
		System.out.println(al.isEmpty());
	//getting an element from the random index from an array list	
		System.out.println("Getting a ramdom object from arraylist:"+al.get(4));
	//Contains method returns boolean value	
		System.out.println(al.contains("muni"));
		System.out.println(al.contains("Hari"));
	//Remove() method if u pass argument then it will remove an object from that particular index otherwise it will remove last element from the list	
		al.remove(6);
		System.out.println(al);
	//2.retrieving all the objects from arraylist
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			Object o=(Object)itr.next();
			System.out.println("list objects in sequence : "+o);
		}
	//Passing collection to an arraylist
		
		ArrayList<Object> newal=new ArrayList<Object>(al);
		newal.add("hari");
		newal.add("30");
		newal.remove(5);
		System.out.println(newal);
	//Traversing elements from an arraylist using listiterator 
		ListIterator<Object> itr1=newal.listIterator();
		while(itr1.hasNext()) 
		{
			Object obj=(Object)itr1.next();	
			System.out.println("list objects in sequence : "+obj);
		}
		//Second program
		ArrayList<Integer> li=new ArrayList<Integer>();
		for(int i=1;i<=15;i++) {
			li.add(i);
		}
		ListIterator<Integer> litr=li.listIterator();
		while(litr.hasNext()) {
			Integer i=(Integer)litr.next();
			if(i%2==0) {
				System.out.println(i);
			}
			else {
				litr.remove();
			}
			//System.out.println(li);
		}
		System.out.println(li);
	}
}

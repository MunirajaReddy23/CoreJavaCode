package com.muniraja.ArrayList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Object> li=new LinkedList<Object>();
		li.add("linked");
		li.add("list");
		li.add("null");
		li.add("list");
		li.add("20");
		li.add("10");
		li.add("20");
		li.add("null");
		System.out.println(li);
		li.remove(7);
		System.out.println(li);
		
		System.out.println(li.contains("list"));
		System.out.println(li.size());
		System.out.println(li.isEmpty());
		ListIterator<Object> itr=li.listIterator();
		while(itr.hasNext())
		{
			String obj=(String)itr.next();
			if(obj.equals("10")) {
				itr.add(40);
				//System.out.println("List Objects are:"+obj);
			}
			System.out.println("List Objects are:"+obj);
			
		}
		System.out.println(li);
	}

}

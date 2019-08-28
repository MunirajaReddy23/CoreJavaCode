package com.muniraja.ArrayList;

import java.util.ListIterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Object> s=new Stack<Object>();
		for(int i=1;i<10;i++) {
			s.push(i);
		}
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search(7));
		System.out.println(s.search(52));
		System.out.println(s.pop());
		ListIterator<Object> itr=s.listIterator();
		while(itr.hasNext()) {
			Integer i=(Integer)itr.next();
			System.out.println(i);
		}
		
		
	}

}

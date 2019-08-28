package com.muniraja.set;

import java.util.Objects;

public class Book {
	private int id;
	private String title;
	
	Book(int id,String title){
		this.id=id;
		this.title=title;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	//if two books are equal if they have the same id
	/*public boolean equals(Object o) {
		if(!(o instanceof Book)) {
			return false;
		}
		else
		{	
			Book book=(Book)o;
		return id= book.id;
		}
		//return false;
	}*/
	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Book book = (Book) o;
	        return id == book.id;
	    }
	 public int hashcode() {
		return Objects.hash(id);
	}
	public String toString() {
		return id+" "+title;
	}
}

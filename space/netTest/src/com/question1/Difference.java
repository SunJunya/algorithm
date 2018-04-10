package com.question1;

import java.util.ArrayList;
import java.util.List;

/**
	@author:sunjunya
*/

class Person{
	private String color;
	private String country;
	private String drink;
	private String sigurate;
	private String pet;
	private String count;
	public Person(String color, String country, String drink, String sigurate, String pet, String count) {
		super();
		this.color = color;
		this.country = country;
		this.drink = drink;
		this.sigurate = sigurate;
		this.pet = pet;
		this.count = count;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDrink() {
		return drink;
	}
	public void setDrink(String drink) {
		this.drink = drink;
	}
	public String getSigurate() {
		return sigurate;
	}
	public void setSigurate(String sigurate) {
		this.sigurate = sigurate;
	}
	public String getPet() {
		return pet;
	}
	public void setPet(String pet) {
		this.pet = pet;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Person [color=" + color + ", country=" + country + ", drink=" + drink + ", sigurate=" + sigurate
				+ ", pet=" + pet + ", count=" + count + "]";
	}
	
	
}

public class Difference {

	
	public static void main(String[] args) {
		Person person1=new Person();
		person1.setColor("red");
		person1.setCountry("Ó¢¹ú");
		
		Person person2=new Person();
		person2.setCountry("Èðµä");
		person2.setPet("dog");
		
		Person person3=new Person();
		person3.setCountry("µ¤Âó");
		person3.setDrink("tea");
		
		Person person4=new Person();
		person4.setCount("1");
		person4.setCountry("Å²Íþ");
		
		Person person5=new Person();
		person5.setCountry("µÂ¹ú");
		person5.setSigurate("prince");
		
		List<Person> list=new ArrayList<Person>();
		list.add(person1);
		list.add(person2);
		list.add(person3);
		list.add(person4);
		list.add(person5);
		
		for(int i=0;i<3;i++){
			
		}
	}

}

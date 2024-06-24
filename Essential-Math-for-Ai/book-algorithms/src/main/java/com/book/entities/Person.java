package com.book.entities;

public class Person {
	String gender;
	int height;
	int weight;
	int index;

	public Person(String gender, int height, int weight, int index) {
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.index = index;
	}

	@Override
	public String toString(){
		return "Gender: " + this.gender + "| Height: " + this.height + "| Weight: " + this.weight + "| Index: " + this.index;
	}
}
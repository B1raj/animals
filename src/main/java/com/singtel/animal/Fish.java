package com.singtel.animal;

import com.singtel.animal.feature.Swimmable;

import lombok.Data;

@Data
public class Fish extends Animal implements Swimmable {

	String size;
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	String color;
	
	@Override
	public  void walk() {
		System.out.println("Fish don't walk");
	}
	
	

}

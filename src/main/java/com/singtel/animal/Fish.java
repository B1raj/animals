package com.singtel.animal;

import com.singtel.animal.feature.Swimmable;

import lombok.Data;

@Data
public class Fish extends Animal implements Swimmable {

	String size;
	String color;

}

package com.singtel.animal;

import com.singtel.animal.feature.Swimmable;

import lombok.Data;

@Data
public abstract class Fish implements Swimmable {

	String size;
	String color;

}

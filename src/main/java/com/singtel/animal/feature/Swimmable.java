package com.singtel.animal.feature;

import org.springframework.stereotype.Component;

@Component
public interface Swimmable {

	public default void swim() {
		System.out.println("I am swimming");
	}

}

package com.singtel.animal.feature;

import org.springframework.stereotype.Component;

@Component
public interface Walkable {
	
	public default void walk() {
		System.out.println("I am walking");
	}

}

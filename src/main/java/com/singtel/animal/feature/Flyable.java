package com.singtel.animal.feature;

import org.springframework.stereotype.Component;

@Component
public interface Flyable {

	public default void fly() {
		System.out.println("I am flying");
	}
}

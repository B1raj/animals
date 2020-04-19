package com.singtel.animal.feature;

import org.springframework.stereotype.Component;

@Component
public interface Singable {
	
	public default void sing() {
		System.out.println("I am singing");
	}

}

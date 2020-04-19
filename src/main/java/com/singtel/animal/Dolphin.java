package com.singtel.animal;

import com.singtel.animal.feature.Swimmable;

public class Dolphin extends Animal implements Swimmable {
	
	@Override
	public  void walk() {
		System.out.println("Dolphin don't walk");
	}

}

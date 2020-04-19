package com.singtel.animal;

import java.util.Locale;

import com.singtel.animal.feature.Flyable;

public class Butterfly extends Animal implements Flyable {

	public Butterfly(Caterpillar cattarpillar) {

	}

	public void makeSound(Locale locale) {

		System.out.println("cannot make a sound");
	}

}
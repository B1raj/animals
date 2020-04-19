package com.singtel.animal;

import org.springframework.stereotype.Component;

import com.singtel.animal.feature.Flyable;
import com.singtel.animal.feature.Singable;

/**
 * 
 * @author birajmishra@hotmail.com
 *
 */
@Component
public class Bird extends Animal implements Flyable, Singable{

	public void makeSound(String sound) {
		System.out.println(sound);
		
	}

}

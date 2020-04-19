package com.singtel.animal;

import java.util.Locale;
import java.util.ResourceBundle;

import org.springframework.stereotype.Component;

import com.singtel.animal.constant.Constants;

@Component
public class Dog extends Animal{
	
	public void makeSound(Locale locale) {
		ResourceBundle bundleMessage = ResourceBundle.getBundle("messages", locale);
		String sound = bundleMessage.getString("DOG").toString();
		System.out.println(sound);
		
	}

}

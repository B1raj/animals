package com.singtel.animal;

import java.util.Locale;
import java.util.ResourceBundle;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * 
 * @author birajmishra@hotmail.com
 *
 */
@Component
@Data
public class Chicken extends Bird {

	private boolean isMale;
	
	public Chicken(){ 
		isMale = false;
	}
	
	public void makeSound(Locale locale) { 
		ResourceBundle bundleMessage = ResourceBundle.getBundle("messages", locale);
		String sound = bundleMessage.getString("CHICKEN").toString();
		System.out.println(sound);
	}
	
	
	@Override
	public  void fly() {
		System.out.println("I cannot fly, my wings are clipped");
	}
}
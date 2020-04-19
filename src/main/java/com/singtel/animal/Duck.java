package com.singtel.animal;

import java.util.Locale;
import java.util.ResourceBundle;

import org.springframework.stereotype.Component;

import com.singtel.animal.feature.Swimmable;

/**
 * 
 * @author birajmishra@hotmail.com
 *
 */
@Component
public class Duck extends Bird implements Swimmable{

	public void makeSound(Locale locale) {
		ResourceBundle bundleMessage = ResourceBundle.getBundle("messages", locale);
		String sound = bundleMessage.getString("DUCK").toString();
		System.out.println(sound);
	}

}

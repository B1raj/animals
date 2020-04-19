package com.singtel.animal;

import java.util.Locale;
import java.util.ResourceBundle;

import org.springframework.stereotype.Component;

import com.singtel.animal.constant.Constants;

import lombok.Data;

/**
 * 
 * @author birajmishra@hotmail.com
 *
 */
@Component
@Data
public class Rooster extends Bird {

	private boolean isMale ;
	
	public Rooster(){
		isMale = true;
	}
	
	public void makeSound(Locale locale) {
		ResourceBundle bundleMessage = ResourceBundle.getBundle("messages", locale);
		String sound = bundleMessage.getString("ROOSTER").toString();
		this.makeSound(sound);
	}
	
}
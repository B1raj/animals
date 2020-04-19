package com.singtel.animal;

import java.util.Locale;

import org.springframework.stereotype.Component;

/**
 * 
 * @author birajmishra@hotmail.com
 *
 */
@Component
public class Parrot extends Bird {

	public void makeSound(Animal staysWithAnimal, Locale locale) {
		if (null != staysWithAnimal) {
			if (staysWithAnimal instanceof Dog) {
				((Dog) staysWithAnimal).makeSound(locale);
			} else if (staysWithAnimal instanceof Rooster) {
				((Rooster) staysWithAnimal).makeSound(locale);
			} else if (staysWithAnimal instanceof Cat) {
				((Cat) staysWithAnimal).makeSound(locale);
			}
		}
	}
}

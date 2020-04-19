package com.singtel.animal.factory;

import org.springframework.stereotype.Component;

import com.singtel.animal.Animal;
import com.singtel.animal.Butterfly;
import com.singtel.animal.Cat;
import com.singtel.animal.Caterpillar;
import com.singtel.animal.Chicken;
import com.singtel.animal.ClownFish;
import com.singtel.animal.Dog;
import com.singtel.animal.Dolphin;
import com.singtel.animal.Duck;
import com.singtel.animal.Fish;
import com.singtel.animal.Parrot;
import com.singtel.animal.Rooster;
import com.singtel.animal.Shark;
import com.singtel.animal.constant.Constants;

/**
 * 
 * @author birajmishra@hotmail.com
 *
 */

@Component
public class AnimalFactory {

	public Animal getAnimal(String animalType, String animal, Object influencedBy, boolean isMetamorphed) {
		if (animal != null && animalType != null) {

			if (animalType.equalsIgnoreCase(Constants.BIRD)) {
				if (animal.equalsIgnoreCase(Constants.Bird.DUCK.value())) {
					return new Duck();
				} else if (animal.equalsIgnoreCase(Constants.Bird.PARROT.value())) {
					if (!isMetamorphed)
						return new Parrot();
				} else if (animal.equalsIgnoreCase(Constants.Bird.CHICKEN.value())) {
					return new Chicken();
				} else if (animal.equalsIgnoreCase(Constants.Bird.ROOSTER.value())) {
					return new Rooster();
				}

			} else if (animalType.equalsIgnoreCase(Constants.ANIMAL)) {
				if (animal.equalsIgnoreCase(Constants.Animal.CAT.value())) {
					return new Cat();
				} else if (animal.equalsIgnoreCase(Constants.Animal.DOG.value())) {
					return new Dog();
				} else if (animal.equalsIgnoreCase(Constants.Animal.FISH.value())) {
					return new Fish();
				} else if (animal.equalsIgnoreCase(Constants.Animal.Fish.SHARK.value())) {
					return new Shark();
				} else if (animal.equalsIgnoreCase(Constants.Animal.Fish.CLOWNFISH.value())) {
					return new ClownFish();
				} else if (animal.equalsIgnoreCase(Constants.Animal.Fish.DOLPHIN.value())) {
					return new Dolphin();
				} else if (animal.equalsIgnoreCase(Constants.Animal.Insect.CATTERPILLAR.value())) {
					return new Caterpillar();
				} else if (animal.equalsIgnoreCase(Constants.Animal.Insect.BUTTERFLY.value())) {
					if (isMetamorphed) {
						return new Butterfly((Caterpillar) influencedBy);
					}

				}
			}

		}
		return null;
	}

}
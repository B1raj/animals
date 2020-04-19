package com.singtel.animal.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.singtel.animal.Animal;
import com.singtel.animal.Bird;
import com.singtel.animal.Butterfly;
import com.singtel.animal.Cat;
import com.singtel.animal.Caterpillar;
import com.singtel.animal.Chicken;
import com.singtel.animal.Dog;
import com.singtel.animal.Dolphin;
import com.singtel.animal.Fish;
import com.singtel.animal.Parrot;
import com.singtel.animal.Rooster;
import com.singtel.animal.bean.Response;
import com.singtel.animal.constant.Constants;
import com.singtel.animal.factory.AnimalFactory;
import com.singtel.animal.feature.Flyable;
import com.singtel.animal.feature.Singable;
import com.singtel.animal.feature.Swimmable;
import com.singtel.animal.feature.Walkable;

@Component
public class AnimalService {

	@Autowired
	AnimalFactory animalFactory;

	public Response countAnimals(Response response) {

		return count(createAnimalsAndView(), response);

	}

	private Response count(List<Animal> animals, Response response) {

		int sing = 0, walk = 0, swim = 0, fly = 0;

		for (Animal i : animals) {
			if (i instanceof Singable) {
				sing++;
			}
			if (i instanceof Walkable && !(i instanceof Fish || i instanceof Dolphin)) {
				walk++;
			}
			if (i instanceof Bird) {
				Bird b = (Bird) i;
				if (!(b instanceof Chicken) && b instanceof Flyable) {
					fly++;
				}

			}
			if (i instanceof Butterfly && i instanceof Flyable) {
				fly++;
			}
			if (i instanceof Swimmable) {
				swim++;
			}

		}

		return printResult(sing, swim, walk, fly, response);

	}

	private Response printResult(int sing, int swim, int walk, int fly, Response response) {
		System.out.println("Can Swim : " + swim);
		System.out.println("Can Sing : " + sing);
		System.out.println("Can fly : " + fly);
		System.out.println("Can walk : " + walk);

		response.setFlyingAnimal(fly);
		response.setWalkingAnimal(walk);
		response.setSingingAnimal(sing);
		response.setSwimingAnimal(swim);
		return response;

	}

	public List<Animal> createAnimalsAndView() {
		ArrayList<Animal> animals = new ArrayList<>();
		Bird duck = (Bird) animalFactory.getAnimal(Constants.BIRD, Constants.Bird.DUCK.value(), null, false);
		System.out.println("Duck::------------------>>>");
		duck.fly();
		duck.sing();
		duck.walk();
		animals.add(duck);

		Bird chicken = (Bird) animalFactory.getAnimal(Constants.BIRD, Constants.Bird.CHICKEN.value(), null, false);
		System.out.println("Chicken::------------------>>>");
		chicken.fly();
		chicken.walk();
		chicken.sing();
		animals.add(chicken);

		Bird rooster = (Bird) animalFactory.getAnimal(Constants.BIRD, Constants.Bird.ROOSTER.value(), null, false);
		System.out.println("Rooster::------------------>>>");
		rooster.fly();
		rooster.walk();
		rooster.sing();
		animals.add(rooster);

		System.out.println("Parrot: With Cat::------------------>>>");
		Parrot parrotWithCat = (Parrot) animalFactory.getAnimal(Constants.BIRD, Constants.Bird.PARROT.value(),
				Constants.Animal.CAT.value(), false);
		parrotWithCat.walk();
		parrotWithCat.fly();
		parrotWithCat.sing();
		parrotWithCat.makeSound(new Cat(), Locale.getDefault());
		animals.add(parrotWithCat);

		System.out.println("Parrot: With Dog::------------------>>>");
		Parrot parrotWithDog = (Parrot) animalFactory.getAnimal(Constants.BIRD, Constants.Bird.PARROT.value(),
				Constants.Animal.DOG.value(), false);
		parrotWithDog.walk();
		parrotWithDog.fly();
		parrotWithDog.sing();
		parrotWithDog.makeSound(new Dog(), Locale.getDefault());
		animals.add(parrotWithDog);

		System.out.println("Parrot: With Rooster::------------------>>>");
		Parrot parrotWithRooster = (Parrot) animalFactory.getAnimal(Constants.BIRD, Constants.Bird.PARROT.value(),
				Constants.Bird.ROOSTER.value(), false);
		parrotWithRooster.walk();
		parrotWithRooster.fly();
		parrotWithRooster.sing();
		parrotWithRooster.makeSound(new Rooster(), Locale.getDefault());

		animals.add(parrotWithRooster);

		Animal cat = animalFactory.getAnimal(Constants.ANIMAL, Constants.Animal.CAT.value(), null, false);
		System.out.println("cat::------------------>>>");
		cat.walk();
		animals.add(cat);

		Animal dog = animalFactory.getAnimal(Constants.ANIMAL, Constants.Animal.DOG.value(), null, false);
		System.out.println("dog::------------------>>>");
		dog.walk();
		animals.add(dog);

		Fish fish = (Fish) animalFactory.getAnimal(Constants.ANIMAL, Constants.Animal.FISH.value(), null, false);
		System.out.println("fish::------------------>>>");
		fish.swim();
		fish.walk();
		animals.add(fish);

		Fish shark = (Fish) animalFactory.getAnimal(Constants.ANIMAL, Constants.Animal.Fish.SHARK.value(), null, false);
		System.out.println("shark::------------------>>>");
		shark.swim();
		shark.getColor();
		shark.getSize();
		shark.walk();
		animals.add(shark);

		Fish clownFish = (Fish) animalFactory.getAnimal(Constants.ANIMAL, Constants.Animal.Fish.CLOWNFISH.value(), null,
				false);
		System.out.println("clownFish::------------------>>>");
		clownFish.swim();
		clownFish.walk();
		clownFish.getColor();
		clownFish.getSize();
		animals.add(clownFish);

		Dolphin dolphin = (Dolphin) animalFactory.getAnimal(Constants.ANIMAL, Constants.Animal.Fish.DOLPHIN.value(),
				null, false);
		System.out.println("dolphin::------------------>>>");
		dolphin.walk();
		dolphin.swim();
		animals.add(dolphin);

		Caterpillar catterpillar = (Caterpillar) animalFactory.getAnimal(Constants.ANIMAL,
				Constants.Animal.Insect.CATTERPILLAR.value(), null, false);
		System.out.println("catterpillar::------------------>>>");
		catterpillar.walk();
		animals.add(catterpillar);

		Butterfly butterfly = (Butterfly) animalFactory.getAnimal(Constants.ANIMAL,
				Constants.Animal.Insect.BUTTERFLY.value(), catterpillar, true);
		System.out.println("butterfly::------------------>>>");
		butterfly.fly();
		animals.add(butterfly);
		return animals;

	}

}

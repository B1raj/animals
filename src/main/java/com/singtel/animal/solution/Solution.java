package com.singtel.animal.solution;

import java.util.Locale;

import org.springframework.stereotype.Component;

import com.singtel.animal.Animal;
import com.singtel.animal.Bird;
import com.singtel.animal.Cat;
import com.singtel.animal.Chicken;
import com.singtel.animal.Dog;
import com.singtel.animal.Duck;
import com.singtel.animal.Parrot;
import com.singtel.animal.Rooster;

@Component
public class Solution {

	public static void main(String[] args) {
		new Solution().printAnimals();
	}

	public void printAnimals() {
		Animal animal = new Animal();
		System.out.println("\n---Animal---");
		animal.walk();

		System.out.println("\n---Bird---");
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();

		System.out.println("\n---Chicken---");
		Chicken chicken = new Chicken();
		chicken.fly();
		chicken.walk();
		chicken.sing();
		chicken.walk();
		chicken.makeSound(Locale.getDefault());

		System.out.println("\n---Duck---");
		Duck duck = new Duck();
		duck.fly();
		duck.walk();
		duck.sing();
		duck.walk();
		duck.makeSound(Locale.getDefault());

		System.out.println("\n---Rooster---");
		Rooster rooster = new Rooster();
		rooster.fly();
		rooster.walk();
		rooster.sing();
		rooster.walk();
		rooster.makeSound(Locale.getDefault());

		System.out.println("\n---Parrot---");
		Parrot parrot = new Parrot();
		parrot.fly();
		parrot.walk();
		parrot.sing();
		parrot.walk();
		parrot.makeSound(new Dog(), Locale.getDefault());
		parrot.makeSound(new Rooster(), Locale.FRANCE);
		parrot.makeSound(new Cat(), Locale.getDefault());

	}
}
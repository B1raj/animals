package com.singtel.animal.constant;

/**
 * 
 * @author birajmishra@hotmail.com
 *
 */
public class Constants {

	public static final String BIRD = "bird";
	public static final String ANIMAL = "animal";
	public static final String FISH = "fish";
	public static final String INSECT = "insect";

	public enum Bird {
		PARROT("parrot"), ROOSTER("rooster"), DUCK("duck"), CHICKEN("chicken"), UNKNOWN("");

		private String value;

		Bird(String bird) {
			this.value = bird;
		}

		public String value() {
			return value;
		}

	}

	public enum Animal {
		CAT("cat"), DOG("dog"), FROG("frog"), FISH("fish"), UNKNOWN("");

		private String value;

		Animal(String animal) {
			this.value = animal;
		}

		public String value() {
			return value;
		}

		public enum Fish {
			SHARK("shark"), CLOWNFISH("clownfish"), DOLPHIN("dolphin"), UNKNOWN("");
			private String value;

			Fish(String fish) {
				this.value = fish;
			}

			public String value() {
				return value;
			}
		}

		public enum Insect {
			BUTTERFLY("butterfly"), CATTERPILLAR("catterpillar"), UNKNOWN("");
			private String value;

			Insect(String insect) {
				this.value = insect;
			}

			public String value() {
				return value;
			}
		}

	}

	public enum Color {
		GREY("grey"), ORANGE("orange"), UNKNOWN("");

		private String value;

		Color(String color) {
			this.value = color;
		}

		public String value() {
			return value;
		}

	}
}
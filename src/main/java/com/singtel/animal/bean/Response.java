package com.singtel.animal.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

	@JsonProperty("# Singing animals")
	private int singingAnimal;
	@JsonProperty("# Walking animals")
	private int walkingAnimal;
	@JsonProperty("# Flying animals")
	private int flyingAnimal;
	@JsonProperty("# Swimming animals")
	private int swimingAnimal;

	public int getSingingAnimal() {
		return singingAnimal;
	}

	public void setSingingAnimal(int singingAnimal) {
		this.singingAnimal = singingAnimal;
	}

	public int getWalkingAnimal() {
		return walkingAnimal;
	}

	public void setWalkingAnimal(int walkingAnimal) {
		this.walkingAnimal = walkingAnimal;
	}

	public int getFlyingAnimal() {
		return flyingAnimal;
	}

	public void setFlyingAnimal(int flyingAnimal) {
		this.flyingAnimal = flyingAnimal;
	}

	public int getSwimingAnimal() {
		return swimingAnimal;
	}

	public void setSwimingAnimal(int swimingAnimal) {
		this.swimingAnimal = swimingAnimal;
	}

	@Override
	public String toString() {
		return "Response [singingAnimal=" + singingAnimal + ", walkingAnimal=" + walkingAnimal + ", flyingAnimal="
				+ flyingAnimal + ", swimingAnimal=" + swimingAnimal + "]";
	}

}
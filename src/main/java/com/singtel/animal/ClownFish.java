package com.singtel.animal;

import com.singtel.animal.constant.Constants;

import lombok.Data;

@Data
public class ClownFish extends Fish {
	
	Boolean makesJokes;
	public Boolean getMakesJokes() {
		return makesJokes;
	}
	public void setMakesJokes(Boolean makesJokes) {
		this.makesJokes = makesJokes;
	}
	public ClownFish() {
		size = "Small";
		color = Constants.Color.ORANGE.value();
		makesJokes = true;
	}

}

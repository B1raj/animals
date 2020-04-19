package com.singtel.animal;

import com.singtel.animal.constant.Constants;

public class ClownFish extends Fish {
	
	Boolean makesJokes;
	ClownFish() {
		size = "Small";
		color = Constants.Color.ORANGE.value();
		makesJokes = true;
	}

}

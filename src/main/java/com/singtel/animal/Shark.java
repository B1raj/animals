package com.singtel.animal;

import com.singtel.animal.constant.Constants;

public class Shark extends Fish {

	Boolean eatsOtherFish;

	public void setEatsOtherFish(Boolean eatsOtherFish) {
		this.eatsOtherFish = eatsOtherFish;
	}

	public Shark() {
		size = "Large";
		color = Constants.Color.GREY.value();
		eatsOtherFish = true;
	}
	
	

}

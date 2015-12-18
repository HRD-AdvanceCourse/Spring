package com.FirstSpringProject;

public class Restaurant {
	IHotDrink hotDrink;

	public void setHotDrink(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}

	public void prepareHotDrink() {
		hotDrink.prepareHotDrink();
	}
}

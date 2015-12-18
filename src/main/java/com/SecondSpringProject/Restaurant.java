package com.SecondSpringProject;

import java.util.List;

public class Restaurant {
	private List restaurantWaitersListList;

	public void setRestaurantWaitersList(List restaurantWaitersListList) {
		this.restaurantWaitersListList = restaurantWaitersListList;
	}

	public void displayWaiterNames() {
		System.out.println("all waiters working in Restaurant : " + restaurantWaitersListList);
	}
}

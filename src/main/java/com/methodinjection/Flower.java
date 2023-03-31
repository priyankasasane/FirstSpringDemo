package com.methodinjection;

import org.springframework.beans.factory.annotation.Lookup;

public abstract class Flower {// method injection

	Petal petal;
	String colour;

//	@Lookup
	protected abstract Petal getNewPetal();// step 1: create abstract method with return type we want(petal..which is
											// prototype)
											//spring automatically creates the petal bean by this mtd

	public Petal getPetal() {
		System.out.println("getting petal");
		return getNewPetal();// step 2: call that abstract method in getter step 3: add lookup method(abstract) in xml file
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		System.out.println("setting clr");
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Flower [petal=" + petal + ", colour=" + colour + "]";
	}

}

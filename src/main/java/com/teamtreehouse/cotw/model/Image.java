package com.teamtreehouse.cotw.model;

/*
This class holds the model for the flag objects.
I purposefully made the name generic in case I ever wanted to do something like this again.
*/
public class Image {

	private String imageName;
	private int id;
	private String countryName;	
	
	public Image(String imageName, int id, String countryName) {
		this.imageName = imageName;
		this.id = id;
		this.setCountryName(countryName);
	}

	// Getters and setters follow
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {

	    this.countryName = countryName;
	}
	
	public String getImageName() {

	    return imageName;
	}

	public void setImageName(String imageName) {

	    this.imageName = imageName;
	}

	public int getId() {

	    return id;
	}

	public void setId(int id) {

	    this.id = id;
	}

}

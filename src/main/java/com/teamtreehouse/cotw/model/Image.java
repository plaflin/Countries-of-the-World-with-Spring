package com.teamtreehouse.cotw.model;

public class Image {
	private String imageName;
	private int id;
	private String countryName;	
	
	public Image(String imageName, int id, String countryName) {
		this.imageName = imageName;
		this.id = id;
		this.setCountryName(countryName);
	}

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

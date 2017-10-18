package com.teamtreehouse.cotw.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// This class holds the model for the country objects
public class Country implements Comparable<Country>, Serializable{
	
	private static final long serialVersionUID = 1L;
	private String countryName;
	private Integer population;
	private String capitalCity;
	private ArrayList<String> officialLanguages;
	
	public Country(String countryName, int population, String capitalCity, ArrayList<String> officalLanguages) {
		super();
		this.countryName = countryName;
		this.population = population;
		this.capitalCity = capitalCity;
		this.officialLanguages = officalLanguages;
	}	

	// Getters and Setters follow
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public String getCapitalCity() {
		return capitalCity;
	}

	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}

	public List<String> getOfficialLanguages() {
		return officialLanguages;
	}

	public void setOfficialLanguages(ArrayList<String> officialLanguages) {
		this.officialLanguages = officialLanguages;
	}

	// Compare method to be able to alphabetize the countries
	@Override
	public int compareTo(Country other) {
		return countryName.compareTo(other.getCountryName());
	}	

}

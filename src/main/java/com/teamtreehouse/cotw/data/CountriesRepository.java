package com.teamtreehouse.cotw.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.teamtreehouse.cotw.model.Country;

@Component
// This class builds and initializes a list of country objects
public class CountriesRepository {
	private final static List<Country> COUNTRIES = Arrays.asList(
			new Country ("Belize", 360346, "Belmopan", new ArrayList<String>(Arrays.asList("English"))),
			new Country ("Djibouti", 865267, "Djibouti", new ArrayList<String>(Arrays.asList("French", "Arabic"))),
			new Country ("Liechtenstein", 38244, "Vaduz", new ArrayList<String>(Arrays.asList("German"))),
			new Country ("San Marino", 33537, "San Marino", new ArrayList<String>(Arrays.asList("Italian"))),
			new Country ("Vanuatu", 282814, "Port-Vila", new ArrayList<String>(Arrays.asList("Bislama", "English", "French"))));

	// This method returns a country by name
	public Country findByName(String name) {
        return COUNTRIES.stream()
                .filter(country -> country.getCountryName().equals(name))
                .findFirst()
                .orElse(null);
    }

    // This method returns the list of countries in alphabetical order
	public List<Country> countriesByAlpha() {
		ArrayList<Country> countriesByAlpha = new ArrayList<>(COUNTRIES);
		countriesByAlpha.sort((country1, country2) -> country1.getCountryName().compareTo(country2.getCountryName()));
		return countriesByAlpha;
	}

	// This method returns the list of countries in population order
	public List<Country> countriesByPop() {
		ArrayList<Country> countriesByPop = new ArrayList<>(COUNTRIES);
		countriesByPop.sort((country1, country2) -> country1.getPopulation().compareTo(country2.getPopulation()));
		return countriesByPop;		
	}

	// This list returns the list of official languages for the chosen country
	public List<String> countryLanguages(String name){
		ArrayList<Country> temp = new ArrayList<>(COUNTRIES);
		for(Country t  : temp){
			if(t.getCountryName().equals(name)){
				return new ArrayList<>(t.getOfficialLanguages());
			}
		}
		return null;
	}
}
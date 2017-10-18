package com.teamtreehouse.cotw.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import com.teamtreehouse.cotw.data.CountriesRepository;
import com.teamtreehouse.cotw.data.ImageRepository;
import com.teamtreehouse.cotw.model.Country;
import com.teamtreehouse.cotw.model.Image;


@Controller
public class CountriesController {
	
	@Autowired
	CountriesRepository countriesRepository;
	
	@Autowired
	ImageRepository imageRepository;
	
	@RequestMapping("/")
	public String home(ModelMap modelMap) {
		List<Country> countries = countriesRepository.countriesByAlpha();
		modelMap.put("countries", countries);
		List<Image> flags = imageRepository.imageByAlpha();
		modelMap.put("flags", flags);
		return "home";
	}
	
	@RequestMapping("/country/{countryName}")
	public String gifDetails(@PathVariable String countryName, ModelMap modelMap) {
		Country country = countriesRepository.findByName(countryName);
		modelMap.put("country", country);
		Image flags = imageRepository.findByName(countryName);
		modelMap.put("flags", flags);
		List<String> languages = countriesRepository.countryLanguages(countryName);
		modelMap.put("languages", languages);
		return "country-details";
	}
	
	@RequestMapping("/byPopulation")
	public String byPopulation(ModelMap modelMap){
		List<Country> byPopulation = countriesRepository.countriesByPop();
		modelMap.put("countries", byPopulation);
		List<Image> flags = imageRepository.imageByAlpha();
		List<Image> popFlags = new ArrayList<>();
		for(Country c : byPopulation){
			for(Image i : flags){
				if(c.getCountryName().equals(i.getCountryName())){
					popFlags.add(i);
				}
			}
		}
		modelMap.put("flags", popFlags);
		return "byPopulation";
	}
}

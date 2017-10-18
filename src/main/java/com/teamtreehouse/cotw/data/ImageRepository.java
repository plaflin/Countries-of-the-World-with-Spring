package com.teamtreehouse.cotw.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.teamtreehouse.cotw.model.Image;

@Component
public class ImageRepository {
	public final static List<Image> IMAGES = Arrays.asList(
			new Image ("belize_flag", 1, "Belize"),
			new Image ("djibouti_flag", 2, "Djibouti"),
			new Image ("liechtenstein_flag", 3, "Liechtenstein"),
			new Image ("san_marino_flag", 4, "San Marino"),
			new Image ("vanuatu_flag", 5, "Vanuatu"));
	
	public List<Image> imageByAlpha() {
		ArrayList<Image> imageByAlpha = new ArrayList<>(IMAGES);
		imageByAlpha.sort((flag1, flag2) -> flag1.getImageName().compareTo(flag2.getImageName()));
		return imageByAlpha;
	}
	
	public Image findByName(String name) {
        return IMAGES.stream()
                .filter(flag -> flag.getCountryName().equals(name))
                .findFirst()
                .orElse(null);
    }

}

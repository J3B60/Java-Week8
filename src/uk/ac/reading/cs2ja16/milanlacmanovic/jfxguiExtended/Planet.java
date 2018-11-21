package uk.ac.reading.cs2ja16.milanlacmanovic.jfxguiExtended;

import java.util.ArrayList;

import javafx.scene.image.Image;

public class Planet {
	private double orbitSize; //Mean Million-km
	private double planetSize;//Mean km
	private double revolution;
	private double planetx;
	private double planety;
	private String name;
	private Image planetImage;
	ArrayList<Satellite> satelliteList = new ArrayList();
	
	Planet(){//NULL
		orbitSize = 0;
		planetSize = 0;
		revolution = 0;
		name = "";
		planetImage = null;
	}
	
	Planet (String nameArg, double orbitSizeArg, double revolutionArg, double planetSizeArg, Image planetImageArg, ArrayList<Satellite> satelliteListArg){
		name = nameArg;
		orbitSize = orbitSizeArg;
		planetSize = planetSizeArg;
		revolution = revolutionArg;
		planetImage = planetImageArg;
		satelliteList = satelliteListArg;
	}
}

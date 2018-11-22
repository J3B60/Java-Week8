package uk.ac.reading.cs2ja16.milanlacmanovic.jfxguiExtended;

import javafx.scene.image.Image;

public class Satellite extends Planet {
	
	Satellite(){
		super.orbitSize = 0;
		super.planetSize = 0;
		super.revolution = 0;
		super.name = "";
		super.planetImage = null;
	}
	
	Satellite(String nameArg, double orbitSizeArg, double revolutionArg, double satelliteSizeArg, Image satelliteImageArg){
		name = nameArg;
		orbitSize = orbitSizeArg;
		planetSize = satelliteSizeArg;
		revolution = revolutionArg;
		planetImage = satelliteImageArg;
	}
	
	public String toString(){
		return "Name: " + name + "\n Orbit Size: " + String.valueOf(orbitSize) + "\n Satellite Size: " + String.valueOf(planetSize) + "\n";
	}
	
	public String toStringStatus(){
		return name + " at: " + String.format("%.1f", posx) + ", " + String.format("%.1f", posy) + "\n";
	}
	
}

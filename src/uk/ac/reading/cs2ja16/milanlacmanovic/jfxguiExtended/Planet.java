package uk.ac.reading.cs2ja16.milanlacmanovic.jfxguiExtended;

import java.util.ArrayList;

import javafx.scene.image.Image;

public class Planet {
	protected double orbitSize; //Mean Million-km
	protected double planetSize;//Mean km
	protected double revolution;
	protected double posx;
	protected double posy;
	protected String name;
	protected Image planetImage;
	protected double planetSpeed;
	private ArrayList<Satellite> satelliteList = new ArrayList();
	
	Planet(){//NULL
		orbitSize = 0;
		planetSize = 0;
		revolution = 0;
		name = "";
		planetImage = null;
		satelliteList = null;
	}
	
	Planet (String nameArg, double orbitSizeArg, double revolutionArg, double planetSizeArg, Image planetImageArg/*, ArrayList<Satellite> satelliteListArg*/){
		name = nameArg;
		orbitSize = orbitSizeArg;
		planetSize = planetSizeArg;
		revolution = revolutionArg;
		planetImage = planetImageArg;
		//satelliteList = satelliteListArg;
	}
	
	public String toString(){
		String temp = "";
		for (int i = 0; i<satelliteList.size(); i++){
			temp += "  " + String.valueOf(i) + ". " + satelliteList.get(i).toString();
		}
		return "Name: " + name + "\n Orbit Size: " + String.valueOf(orbitSize) + "\n Planet Size: " + String.valueOf(planetSize) + "\n Satellites: " + temp + "\n";
	}
	
	public String toStringStatus(){
		String temp = name + " at: " + String.format("%.1f", posx) + ", " + String.format("%.1f", posy) + "\n";
		for (int i = 0; i<satelliteList.size(); i++){
			temp += satelliteList.get(i).toStringStatus();
		}
		return temp;
	}
	
	public void drawIt(){
		
	}
}

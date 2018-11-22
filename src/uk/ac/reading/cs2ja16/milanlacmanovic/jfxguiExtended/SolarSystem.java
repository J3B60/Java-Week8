package uk.ac.reading.cs2ja16.milanlacmanovic.jfxguiExtended;

import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class SolarSystem {
	int canvasSize = 512;//Default set, but gets from GUI actual value using getter,setter
	double sunSize = 30;
    double sunPosx = canvasSize/2;
    double sunPosy = canvasSize/2;
	double earthSize = 20;
	double marsSize = 10;//ADDED
	double earthx = 0;
	double earthy = 0;
	double marsx = 0;
	double marsy = 0;
	double earthOrbitSize = canvasSize /6;
	double marsOrbitSize = canvasSize/3;//ADDED
    Image sun = new Image(getClass().getResourceAsStream("sun.png"));
    Image earth = new Image(getClass().getResourceAsStream("earth.png"));
    Image mars = new Image(getClass().getResourceAsStream("mars.png"));
    ArrayList<Planet> planetList = new ArrayList();
    int numPlanets = 0;
    Planet pNULL = new Planet();
	
    SolarSystem(){
    	planetList.clear();
    	for (int i = 0; i<numPlanets; i++) {
    		planetList.add(pNULL);
    	}
    	//Satellite moon = new Satellite();
    	planetList.set(0, new Planet("Earth", 149.6, 365.2, 6371, new Image(getClass().getResourceAsStream("earth.png"))));
    	Planet mars = new Planet("Mars", 227.9, 687, 3390, new Image(getClass().getResourceAsStream("mars.png")));
    	numPlanets = planetList.size();
    	 
    }
    
    public void SunPosSet(double x, double y) {
		// now clear canvas and draw sun and moon
		sunPosx = x;
		sunPosy = y;	// draw Sun									// give its position 
	}
	
	public void SystemLayout (double t, SolarSystemGUI ssGUI) {
		earthx = sunPosx + earthOrbitSize * Math.cos(t);	// calculate coordinates of earth
		earthy = sunPosy + earthOrbitSize * Math.sin(t);
		marsx= sunPosx + marsOrbitSize * Math.cos(t*0.5);
		marsy= sunPosy + marsOrbitSize * Math.sin(t*0.5);
			
			// now clear canvas and draw earth and sun
		
		ssGUI.drawIt( earth, earthx, earthy, earthSize );
		ssGUI.drawIt( mars, marsx, marsy, marsSize );//Test
		ssGUI.drawIt( sun, sunPosx, sunPosy, sunSize );
		ssGUI.drawStatus(sunPosx, sunPosy, earthx, earthy, marsx, marsy);

	}
	
	public String toString(){
		String temp = "";
		for (int i = 0; i < planetList.size(); i++){
			temp += String.valueOf(i) + ". " + planetList.get(i).toString();
		}
		return "Number of Planets: " + String.valueOf(numPlanets) +"Planets: " + temp + "\n";
	}
	public void setCanvasSize(int cs){
		canvasSize = cs;
	}
	
	public String toStringStatus(){
		String temp = "Sun at: " + String.format("%.1f", sunPosx) + ", " + String.format("%.1f", sunPosy) + "\n";
		for(int i = 0; i<planetList.size(); i++){
			temp += planetList.get(i).toStringStatus();
		}
		return temp;
	}
}

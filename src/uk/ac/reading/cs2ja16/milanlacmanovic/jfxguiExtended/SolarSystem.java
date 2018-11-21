package uk.ac.reading.cs2ja16.milanlacmanovic.jfxguiExtended;

import java.util.ArrayList;

import javafx.scene.image.Image;

public class SolarSystem {
	double sunSize = 30;
    double sunPosx = canvasSize/2;
    double sunPosy = canvasSize/2;
    Image sun = new Image(getClass().getResourceAsStream("sun.png"));
    ArrayList<Planet> planetList = new ArrayList();
    int numPlanets = 4;
    Planet pNULL = new Planet();
	
    SolarSystem(){
    	planetList.clear();
    	for (int i = 0; i<numPlanets; i++) {
    		planetList.add(pNULL);
    	}
    	Satellite moon = new Satellite();
    	planetList.set(0, new Planet("Earth", 149.6, 365.2, 6371, new Image(getClass().getResourceAsStream("earth.png")), ));
    	 Planet mars = new Planet("Mars", 227.9, 687, 3390, new Image(getClass().getResourceAsStream("mars.png")));
    	 
    }
    
    private void SystemPosSet(double x, double y) {
		// now clear canvas and draw sun and moon
		gc.clearRect(0,  0,  canvasSize,  canvasSize);		// clear canvas
		sunPosx = x;
		sunPosy = y;	// draw Sun									// give its position 
	}
	
	public void SystemLayout (double t) {
		earthx = sunPosx + earthOrbitSize * Math.cos(t);	// calculate coordinates of earth
		earthy = sunPosy + earthOrbitSize * Math.sin(t);
		marsx= sunPosx + marsOrbitSize * Math.cos(t*0.5);
		marsy= sunPosy + marsOrbitSize * Math.sin(t*0.5);
			
			// now clear canvas and draw earth and sun
		gc.clearRect(0,  0,  canvasSize,  canvasSize);
		drawIt( earth, earthx, earthy, earthSize );
		drawIt( mars, marsx, marsy, marsSize );//Test
		drawIt( sun, sunPosx, sunPosy, sunSize );
		drawStatus(sunPosx, sunPosy, earthx, earthy, marsx, marsy);

	}
	
}

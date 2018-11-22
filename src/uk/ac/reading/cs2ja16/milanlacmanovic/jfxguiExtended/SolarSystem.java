package uk.ac.reading.cs2ja16.milanlacmanovic.jfxguiExtended;

import java.util.ArrayList;

import javafx.scene.image.Image;

public class SolarSystem {
	int canvasSize = 512;//////////////////////////TO BE GET FROM GUI
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
    ArrayList<Planet> planetList = new ArrayList();
    int numPlanets = 4;
    Planet pNULL = new Planet();
	
    SolarSystem(){
//    	planetList.clear();
//    	for (int i = 0; i<numPlanets; i++) {
//    		planetList.add(pNULL);
//    	}
//    	Satellite moon = new Satellite();
//    	planetList.set(0, new Planet("Earth", 149.6, 365.2, 6371, new Image(getClass().getResourceAsStream("earth.png")), ));
//    	 Planet mars = new Planet("Mars", 227.9, 687, 3390, new Image(getClass().getResourceAsStream("mars.png")));
//    	 
    }
    
    private void SunPosSet(double x, double y) {
		// now clear canvas and draw sun and moon
		sunPosx = x;
		sunPosy = y;	// draw Sun									// give its position 
	}
	
	public void SystemLayout (double t) {
		earthx = sunPosx + earthOrbitSize * Math.cos(t);	// calculate coordinates of earth
		earthy = sunPosy + earthOrbitSize * Math.sin(t);
		marsx= sunPosx + marsOrbitSize * Math.cos(t*0.5);
		marsy= sunPosy + marsOrbitSize * Math.sin(t*0.5);
			
			// now clear canvas and draw earth and sun
		
		drawSolarSystem( earth, earthx, earthy, earthSize );
		drawItSolarSystem( mars, marsx, marsy, marsSize );//Test
		drawItSolarSystem( sun, sunPosx, sunPosy, sunSize );
		drawStatus(sunPosx, sunPosy, earthx, earthy, marsx, marsy);

	}
	public void drawSolarSystem(GraphicsContext gc) {
		gc.drawImage(i, x - sz/2, y - sz/2, sz, sz );
	}
	
}

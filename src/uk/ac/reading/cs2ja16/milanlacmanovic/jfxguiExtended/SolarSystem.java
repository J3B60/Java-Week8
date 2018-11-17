package uk.ac.reading.cs2ja16.milanlacmanovic.jfxguiExtended;

import javafx.scene.image.Image;

public class SolarSystem {
	double earthOrbitSize = canvasSize /6;
	double marsOrbitSize = canvasSize/3;//ADDED
	double sunSize = 30;
	double earthSize = 20;
	double marsSize = 10;//ADDED
	double earthx = 0;
	double earthy = 0;
	double marsx = 0;
	double marsy = 0;
    double sunPosx = canvasSize/2;
    double sunPosy = canvasSize/2;
    Image earth = new Image(getClass().getResourceAsStream("earth.png"));
    Image sun = new Image(getClass().getResourceAsStream("sun.png"));
    Image mars = new Image(getClass().getResourceAsStream("mars.png"));
	private void SystemPosSet(double x, double y) {
		// now clear canvas and draw sun and moon
		gc.clearRect(0,  0,  canvasSize,  canvasSize);		// clear canvas
		sunPosx = x;
		sunPosy = y;	// draw Sun									// give its position 
	}
	
}

package test;

import figures.Cercle;
import figures.Point;

public class Application {

	public static void main(String[] args) {
		
		Point point = new Point(100, 100);
		
		// cercle 1
		Cercle cercle1 = new Cercle(point, 50);
		
		// centre du cercle 2
		Point centre =  new Point(150, 150);
		
		// cercle 2
		Cercle cercle2 = new Cercle(centre, new Point(200, 200));
		
	
		
		System.out.println("Périmétre du "+cercle1.toString()+" est: "+
				cercle1.getPerimetre());
		
		System.out.println("Surface du "+cercle2.toString()+" est: "+
				cercle2.getSurface());
		
	
	}

}

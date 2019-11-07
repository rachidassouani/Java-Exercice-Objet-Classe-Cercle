package figures;

public class Cercle {
	private Point centre;
	private double rayon;
	
	public Cercle(Point centre, double rayon) {
		this.centre = centre;
		this.rayon = rayon;
	}
	
	public Cercle(Point c, Point p) {
		this.centre = c;
		this.rayon = centre.calculeDistance(p);
	}

	public double getSurface() {
		return Math.PI * rayon * rayon;
	}
	
	public double getPerimetre() {
		return 2 * Math.PI * rayon;
	}
	
	public boolean appartient(Point p) {
		return centre.calculeDistance(p)<=rayon;
	}
	
	@Override
	public String toString() {
		return "Cercle X="+centre.x+ " Y= "+centre.y+" Rayon= "+this.rayon;
	}
}

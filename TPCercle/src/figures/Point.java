package figures;

public class Point {
	
	protected int x;
	protected int y;
	
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double calculeDistance(Point p) {
		//this.centre = c;

		// la distance entre deux points
		int x = this.x - p.x;
		int y = this.y - p.y;
		
		return Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2));
	}
	
	
	@Override
	public String toString() {
		return "Point: "+this.x +", "+this.y;
	}
	

}

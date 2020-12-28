package TravisCI;

public class Point {
	private double x, y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int x, int y) {
		this.x = Double.valueOf(x);
		this.y = Double.valueOf(y);
	}
	
	public Point(int x, double y) {
		this.x = Double.valueOf(x);
		this.y = (y);
	}
	
	public Point(double x, int y) {
		this.x = (x);
		this.y = Double.valueOf(y);
	}
	
	public Point(String src) {
		
	}
	
	public double distance(Point B) {
		double distance = Math.sqrt(Math.pow(this.getX() - B.getX(), 2) + Math.pow(this.getY() - B.getY(), 2));
		return distance;
	}
}

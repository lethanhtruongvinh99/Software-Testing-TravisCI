package TravisCI;

public class Triangle {
	private Point[] data;
	private String type;
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Point[] getData() {
		return data;
	}

	public void setData(Point[] data) {
		this.data = data;
		this.type = "";
	}

	public Triangle(Point[] data) {
		this.data = data;
	}
	//a = data[0] <--> data[1], b = data[0] <--> data[2], c = data[1] <--> data[2];
	
	//phan loai tam giac
	public String isTriangle() {
		double a, b, c;
		a = data[0].distance(data[1]);
		b = data[0].distance(data[2]);
		c = data[1].distance(data[2]);
		if (a + b <= c || a + c <= b || b + c <= a) {
//			System.out.println("This is not Triangle");
			this.type = "Is not Triangle";
			return this.type;
		} else {
			if (a == b && b == c) {
//				System.out.println("Equilateral Triangle");
				this.type = "Equilateral";
			} else {
				if (a == b || a == c || b == c) {
//					System.out.println("Isosceles Triangle");
					this.type = "Isosceles";
				} else {
//					System.out.println("Scalene Triangle");
					this.type = "Scalene";
				}
			}
		}
		return this.type;
	}
	
	//tinh chu vi
	public double TriangleCircumference() {
		if (this.isTriangle() != "Is not Triangle") {
			return (data[0].distance(data[1]) + data[0].distance(data[2]) + data[1].distance(data[2]));
		} else {
			return 0.0;
		}
	}
	
	
}

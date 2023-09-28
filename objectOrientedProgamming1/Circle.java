package objectOrientedProgamming1;

public class Circle {
	
	double radius = 1.0;
	private String color;
	
	Circle() {
	}
		Circle(double newradius) {
			radius = newradius;
		}
		
		double getCircleArea() {
			return radius * radius * 3.14159;
		}
		
		Circle(double radius, String color){
			this.radius = radius;
			this.color = color;
		}
		
		public double getradius(double radius) {
			return radius;
		}
		public void setRadius(double radius) {
			this.radius = radius;
		}
		
		public String getColor() {
			return color;
		}
		
		public void setColor(String color) {
			this.color = color;
		}
		
	}

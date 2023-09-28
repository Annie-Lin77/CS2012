package objectOrientedProgamming1;

public class Rectangle {
	
	private String color;
	private double width;
	private double height;
	
	public Rectangle (double width, double height, String color ) {
		this.color = color;
		this.height = height;
		this.width = width;
	}

	public void setcolor(String color) {
		this.color = color;
	}
	
	public void setheight(double height) {
		this.height = height;
	}
	
	
	public void setwidth(double width) {
		this.width = width;
	}
	
	public double getheight() {
		return this.height;
	}
	
	
	public double getwidth() {
		return this.width;
	}
	
	public String getcolor() {
		return this.color;
	}
	
	public double area() {
		return this.height * this.width;
	} 
}

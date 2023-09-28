package objectOrientedProgamming1;

public class Square {
	
	private double side;
	private String color;
	
	public Square (double square, String color) {
		this.side = square;
		this.color = color;
	}
	
	public void setcolor(String color) {
		this.color = color;
	}
	
	public void setside(double side) {
		this.side = side;
	}
	
	public double getside() {
		return this.side;
	}
	
	public String getcolor() {
		return this.color;
	}
	
	public double squarearea() {
		return this.side*this.side;
	}
}


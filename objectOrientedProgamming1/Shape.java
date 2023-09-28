package objectOrientedProgamming1;

public class Shape {
	
	public static void main(String[] args) {
		Circle a = new Circle( 2, "blue");
		System.out.println("Circle a: radius: " + 2 + " area: " + a.getCircleArea() + " " + a.getColor());
		
		Circle b = new Circle( 5, "yellow");
		System.out.println("Circle b: radius: " + 5 + " area: " + b.getCircleArea() + " " + b.getColor());
		
		Square c = new Square(6, "red");
		System.out.println("Square c: sides: " + 6 + " area: " + c.squarearea() + " " + c.getcolor());
		
		Square d = new Square(4, "orange");
		System.out.println("Square d: sides: " + 4 + " area: " + d.squarearea() + " " + d.getcolor());
		
		Rectangle e = new Rectangle (5, 9, "purple");
		System.out.println("Rectangle e: dimentions: " + 5 + ", " + 9+ ", area: " + e.area() + " " + e.getcolor());
		
		Rectangle f = new Rectangle (9, 1, "black");
		System.out.println("Rectangle f:  dimentions: " + 9 + ", " + 1 + ", area: " + f.area() + " " + f.getcolor());
	}

}

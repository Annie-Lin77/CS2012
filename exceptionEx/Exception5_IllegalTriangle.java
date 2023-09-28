package exceptionEx;

public class Exception5_IllegalTriangle {
	
	public class IllegalTriangleExceptionextendsException{
	    private double side1;
	    private double side2;
	    private double side3;

	    public static String IllegalTriangleException(String triangleExceptionMessage) {
	       return triangleExceptionMessage;
	    }

	    public void IllegalTriangleException(double side1, double side2, double side3) {
	        this.side1= side1;
	        this.side2= side2;
	        this.side3= side3;

	    }


	    public double getSide1() {
	        return side1;
	    }

	    public double getSide2() {
	        return side2;
	    }

	    public double getSide3() {
	        return side3;
	    }

}
}

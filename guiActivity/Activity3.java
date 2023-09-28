package guiActivity;
import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class Activity3 extends Application {
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception{
	   Pane p = new Pane();
	   Scene mainScene = new Scene(p, 700, 700);
	   
	   for(int i = 0; i < 100; i++) {
		   p.getChildren().add(createStars(mainScene));
	   }
	   
	   mainScene.setFill(Color.BLACK);
	   Rectangle rect = new Rectangle(100, 150);
	   rect.setStroke(ranColor());
	   rect.setFill(ranColor());
	   rect.xProperty().bind(p.widthProperty().divide(2).subtract(rect.widthProperty().divide(2)));
	   rect.yProperty().bind(p.heightProperty().divide(2).subtract(rect.heightProperty()));
	   
	   Polygon pony = new Polygon();
	}
	
	public Circle createStars(Scene s) {
		Random ran = new Random();
		Circle c = new Circle();
		
		c.setRadius(3);
		
		int radius = (int) c.getRadius();
		int sceneW = (int) s.getWidth();
		int sceneH = (int) s.getHeight();
		
		int rX = radius + ran.nextInt(sceneW);
		if(rX > sceneW - radius) {
			rX = rX - 2 * radius;
		}
		
		int rY = radius + ran.nextInt(sceneH);
		if(rY > sceneH - radius) {
			rY = rY - 2 * radius;
		}
		
		c.setLayoutX(rX);
		c.setLayoutY(rY);
		
		c.setStroke(Color.WHITE);
		c.setFill(ranColor());
		
		return c;
	}
	
	public Color ranColor() {
		Random ran = new Random();
		float r = ran.nextFloat();
		float g = ran.nextFloat();
		float b = ran.nextFloat();
		
		return new Color(r, g, b, 1);
	}
	
	public Polygon createFire(Rectangle rect) {
		Polygon poly = new Polygon();
		Double rectWidth = rect.getWidth();
		poly.getPoints().addAll(new Double[] {
				rect.getX() + 3, rect.getY() + rect.getHeight(),
				rect.getX() + (rectWidth / 4), rect.getY() + rect.getHeight() + 50,
				rect.getX() + (rectWidth / 2), rect.getY() + rect.getHeight() + 35,
				rect.getX() + ((rectWidth / 4) * 3), rect.getY() + rect.getHeight() + 50,
				rect.getX() + (rectWidth +10), rect.getY() + rect.getHeight(),
		});
		
		poly.setFill(Color.RED);
		poly.setStrokeWidth(5.0);
		poly.setStroke(Color.AQUA);
		return poly;
		
	}
	
	public Circle createPlanet(Rectangle rect) {
		Circle c = new Circle();
		c.setRadius(80);
		int x = (int) rect.getX();
		int y = (int) (50 + rect.getY() + (rect.getHeight() * 2));
		
		c.setLayoutX(x);
		c.setLayoutY(y);
		return c;
	}
}

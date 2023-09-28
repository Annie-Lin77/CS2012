package hw10;

import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Picture extends Application{
	
	//didn't really work as intended it barely looks like a bird, only drew a bird head where the bird is looking up
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Canvas canvas = new Canvas(800, 600);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		drawBackground(gc);
		drawBird(gc);
		
		BorderPane root = new BorderPane(canvas); 
		Scene scene = new Scene(root); 
		primaryStage.setScene(scene); 
		primaryStage.setTitle("Bird Picture"); 
		primaryStage.show(); 
		
	}
	
	private void drawBackground(GraphicsContext gc) {
		
		gc.setFill(Color.LIGHTBLUE);
		gc.fillRect(0, 0, 800, 600);
	}
	
	private void drawBird(GraphicsContext gc) {
		
		double bodyWidth = 20;
		double bodyHeight = 100;
		double bodyX = (800 - bodyWidth) / 2; 
		double bodyY = (600 - bodyHeight) / 2; 
		
		Color bodyColor = getRandomColor(); 
		gc.setFill(bodyColor); 
		gc.fillOval(bodyX, bodyY, bodyWidth, bodyHeight); 
		
		double eyeSize = 20; 
		double eyeX = bodyX + bodyWidth * 0.75; 
		double eyeY = bodyY + bodyHeight * 0.35; 
		
		Color eyeColor = getRandomColor(); 
		gc.setFill(eyeColor); 
		gc.fillOval(eyeX, eyeY, eyeSize, eyeSize); 
		
		double beakSize = 30; 
		double beakX = bodyX + bodyWidth * 0.45; 
		double beakY = bodyY + bodyHeight * 0.6; 
		
		Color beakColor = getRandomColor(); 
		double wingSize = 100; double wingX = bodyX - wingSize / 2; 
		double wingY = bodyY + bodyHeight / 2; 
		
		Color wingColor = getRandomColor(); gc.setFill(wingColor); 
		gc.fillOval(wingX, wingY, wingSize, bodyHeight); 
		
		double tailSize = 80; 
		double tailX = bodyX - tailSize / 2 - 10; 
		double tailY = bodyY + bodyHeight * 0.3; 
	}
	
	private Color getRandomColor() { 
		
		Random rand = new Random();
		return Color.rgb(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
	}
}

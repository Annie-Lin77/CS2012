package guiTest;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class IntroJavaFX_ColorGrid extends Application{
	

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
	    try {
	        
	    	Rectangle r1 = new Rectangle(50,50);
	    	Rectangle r2 = new Rectangle(50,50);
	    	Rectangle r3 = new Rectangle(50,50);
	    	Rectangle r4 = new Rectangle(50,50);
	    	Rectangle r5 = new Rectangle(50,50);
	    	Rectangle r6 = new Rectangle(50,50);
	    	Rectangle r7 = new Rectangle(50,50);
	    	Rectangle r8 = new Rectangle(50,50);
	    	Rectangle r9 = new Rectangle(50,50);
	    	
	    	r1.setFill(Color.BLANCHEDALMOND);
	    	r2.setFill(Color.ALICEBLUE);
	    	r3.setFill(Color.BLACK);
	    	r4.setFill(Color.DARKSLATEGREY);
	    	r5.setFill(Color.LEMONCHIFFON);
	    	r6.setFill(Color.TEAL);
	    	r7.setFill(Color.BLUEVIOLET);
	    	r8.setFill(Color.LIGHTGREEN);
	    	r9.setFill(Color.ORANGE);
	    	
	    	GridPane root = new GridPane();
	    	root.setVgap(15);
	    	root.setHgap(15);
	    	root.setPadding(new Insets(10, 10, 10, 10));
	    	root.setAlignment(Pos.CENTER);
	    	root.add(r1, 0, 0);
	    	root.add(r2, 1, 0);
	    	root.add(r3, 2, 0);
	    	root.add(r4, 0, 1);
	    	root.add(r5, 1, 1);
	    	root.add(r6, 2, 1);
	    	root.add(r7, 0, 2);
	    	root.add(r8, 1, 2);
	    	root.add(r9, 2, 2);
	    	
	    	Scene mainScene = new Scene(root, 300, 300);
	    	primaryStage.setScene(mainScene);
	    	primaryStage.show();
	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	}
}

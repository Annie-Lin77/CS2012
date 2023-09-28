package guiTest;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class IntoToJavaFX extends Application{
	

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
	    try {
	        
	    	Button b1 = new Button("Button 1");
	    	Button b2 = new Button("Button 2");
	    	
	    	HBox hb = new HBox();
	    	hb.setAlignment(Pos.CENTER);
	    	hb.getChildren().add(b1);
	    	hb.getChildren().add(b2);
	    	
	    	Label l1 = new Label("Top text for vbox");
	    	Label l2 = new Label("Bottom text for vbox");
	    	
	    	//button one action 
	    	//lambda expression
	    	b1.setOnAction((event) -> {
	    		l1.setText("you have changed top text");
	    	});
	    	
	    	b2.setOnAction((event) -> {
	    		l2.setText("You have changed alignment");
	    	});
	    	
	    	VBox root = new VBox();
	    	root.setAlignment(Pos.CENTER);
	    	root.getChildren().add(l1);
	    	root.getChildren().add(l2);
	    	root.getChildren().add(hb);
	 
	    	Scene mainScene = new Scene(root, 400, 400);
	    	
	    	primaryStage.setScene(mainScene);
	    	primaryStage.show();
	    	
	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	}
}


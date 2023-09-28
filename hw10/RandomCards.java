package hw10;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RandomCards extends Application {

	private ArrayList<Image> getCards(){
		ArrayList<Image> cards = new ArrayList<>();
		File cardFile = new File("cards");
		for(int i = 0; i < 52; i++) {
			cards.add(new Image(cardFile.toURI().toString()));
		}
		
		Collections.shuffle(cards);
		return cards;
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		ArrayList<Image> cards = getCards();
		HBox pane = new HBox();
		VBox root = new VBox();
		
		for(int i = 0; i <= 7; i++) {
			pane.getChildren().add(new ImageView(new Image("card" + cards.get(i) + ".png")));
		}
		
		root.getChildren().add(pane);
		primaryStage.setTitle("Cards");
		primaryStage.setScene(new Scene(root, 200, 200));		
		primaryStage.show();
	
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}

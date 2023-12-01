package application;
	
import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		
		try {
			// Creating root and loading the start up page
			Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
			//Parent root = FXMLLoader.load(getClass().getResource("projectTable.fxml"));
			// Creating new scene
			Scene scene = new Scene(root);
			// Creating a new stage
			Stage stage = new Stage();
			// Loading style sheet
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// Setting up scene
			stage.setScene(scene);
			// Setting up stage
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

		
		
		
}
	







































	
/*	try {
			Parent root = FXMLLoader.load(getClass().getResource("/Main.fxml"));
			Scene scene = new Scene(root, 600, 600, Color.LIGHTSKYBLUE);
			Stage stage = new Stage();
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

//primaryStage.setWidth(420);  do what it says
		//primaryStage.setHeight(420);
		//primaryStage.setResizable(false);
		//primaryStage.setFullScreen(true);


	// Create text item
		Text text = new Text();
		// Set string to it
		text.setText("I hate CSE 360 and Robert Lynn Carter");
		// X/Y Coordinates
		text.setX(50);
		text.setY(50);
		// Font
		text.setFont(Font.font("Verdana", 50));
		text.setFill(Color.LIMEGREEN);
		
		Line line = new Line();
		line.setStartX(200);
		line.setStartY(200);
		line.setEndX(500);
		line.setEndY(200);
		line.setStrokeWidth(5);
		
		Rectangle rect = new Rectangle();
		rect.setX(100);
		rect.setY(100);
		rect.setWidth(100);
		rect.setHeight(100);
		
		// Set icon for application
		Image icon = new Image("dio.png");
		stage.getIcons().add(icon);
		
		root.getChildren().add(text);
		root.getChildren().add(line);
		root.getChildren().add(rect);

*
*/

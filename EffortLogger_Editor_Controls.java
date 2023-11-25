package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EffortLogger_Editor_Controls {
	private Scene scene;
	private Stage stage;
	private Parent root;
	
	public void editorConsole(ActionEvent event) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("EffortLogger_Console.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setTitle("EffortLogger Console V2");
		stage.setScene(scene);
		stage.show();
	}
	
	public void returnConsole(ActionEvent event) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("EffortLogger_Editor_FXML.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setTitle("EffortLogger Console V2");
		stage.setScene(scene);
		stage.show();
	}
	
	public void deleteConsole(ActionEvent event) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("DeleteScreen.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setTitle("EffortLogger Entry Delete Screen");
		stage.setScene(scene);
		stage.show();
	}
}

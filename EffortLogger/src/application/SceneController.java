package application;

import java.io.IOException;

import javafx.event.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;




public class SceneController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	// Istiyak
	public void switchToSceneLogin(ActionEvent event) throws IOException {
		//This will link the login page
		root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		// The following sets up the GUI page
		stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	// Jonathan
	public void switchToSceneDebug(ActionEvent event) throws IOException {
		//This Will link the Debug Console
		root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		// The following sets up the GUI page
		stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	// Washik
	public void switchToeditorConsole(ActionEvent event) throws IOException
	{
		//This will link the Effort Log Console
		root = FXMLLoader.load(getClass().getResource("EffortLogger_Console.fxml"));
		// The following sets up the GUI page
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setTitle("EffortLogger Console V2");
		stage.setScene(scene);
		stage.show();
	}
	// Washik
	public void switchToreturnConsole(ActionEvent event) throws IOException
	{
		//This will link the First page after logging in
		root = FXMLLoader.load(getClass().getResource("EffortLogger_Editor.fxml"));
		// The following sets up the GUI page
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setTitle("EffortLogger Console V2");
		stage.setScene(scene);
		stage.show();
	}
	// Washik
	public void switchTodeleteConsole(ActionEvent event) throws IOException
	{
		//This will link the delete notification page
		root = FXMLLoader.load(getClass().getResource("DeleteScreen.fxml"));
		// The following sets up the GUI page
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setTitle("EffortLogger Console V2");
		stage.setScene(scene);
		stage.show();
	}
	// Washik
	public void switchToMainConsole(ActionEvent event) throws IOException
	{
		//This will link the main console page
		root = FXMLLoader.load(getClass().getResource("EffortLoggerMainConsole.fxml"));
		// The following sets up the GUI page
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setTitle("EffortLogger Console V2");
		stage.setScene(scene);
		stage.show();
	}
	// Jonathan
	public void switchToEditorMainConsole(ActionEvent event) throws IOException
	{
		//This will link the editor console
		root = FXMLLoader.load(getClass().getResource("EffortLoggerEditor.fxml"));
		// The following sets up the GUI page
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setTitle("EffortLogger Console V2");
		stage.setScene(scene);
		stage.show();
	}
	public void switchToTable(ActionEvent event) throws IOException
	{
		//This will link the main console page
		root = FXMLLoader.load(getClass().getResource("table-view.fxml"));
		// The following sets up the GUI page
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setTitle("EffortLogger Console V2");
		stage.setScene(scene);
		stage.show();
	}
}
	
	
	
	
	
package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.util.Objects;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class loginController {
    // in the login-view.fxml file, when the sign in button is clicked,
    // the login-success.fxml file is loaded
	private Stage stage;
	private Scene scene;
	private Parent root;


    @FXML
    private Text loginFormFeedback;

    @FXML
    private Button loginButton;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    private Button goToLoggedInPages;

    // set the goToLoggedInPages button to invisible
    public void initialize() {
        goToLoggedInPages.setVisible(false);
        // set default text for emailTextField and passwordTextField
        emailTextField.setText("iasheyam@gmail.com");
        passwordTextField.setText("123456");

        loginFormFeedback.setText("Login Feedback: valid credentials are prefilled for testing purpose. Click login or provide wrong credentials to test more.");
    }

    @FXML
    //when login button is clicked, show logged in message
    private void onLoginButtonClicked(ActionEvent event) {
        if (emailTextField.getText().equals("iasheyam@gmail.com") && passwordTextField.getText().equals("123456")) {

            // change color of text to green
            loginFormFeedback.setStyle("-fx-fill: green");
            loginFormFeedback.setText("Login Feedback: Login Success!");

            // change goToLoggedInPages button to visible
            goToLoggedInPages.setVisible(true);
        } else {
            // change color of text to red
            loginFormFeedback.setStyle("-fx-fill: red");
            loginFormFeedback.setText("Login Feedback: Login Failed! Please provide valid credentials.");

            // change goToLoggedInPages button to invisible
            goToLoggedInPages.setVisible(false);
        }
    }
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
    
}
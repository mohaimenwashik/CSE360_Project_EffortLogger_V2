package application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

public class ExampleTableViewController implements Initializable{
	@FXML
    private TableColumn<Person, String> firstName;

    @FXML
    private TableColumn<Person, String> lastName;

    @FXML
    private TableColumn<Person, String> origin;

    @FXML
    private TableView<Person> table;

    @FXML
    private TextField txtFName;

    @FXML
    private TextField txtLName;

    @FXML
    private TextField txtOrigin;

    ObservableList<Person> initialData(){
        Person p1 = new Person("Sample","Last Sample Name"," US");
        Person p2 = new Person("Test","Last Name"," PH");
        return FXCollections.observableArrayList(p1, p2);
    }
    @FXML
    private void btnInsert(ActionEvent event){
    	Person newData = new Person(txtFName.getText(), txtLName.getText(), txtOrigin.getText());
        table.getItems().add(newData);
        txtFName.clear();
        txtLName.clear();
        txtOrigin.clear();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        firstName.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));
        origin.setCellValueFactory(new PropertyValueFactory<Person, String>("origin"));

        table.setItems(initialData());
    }
}
    
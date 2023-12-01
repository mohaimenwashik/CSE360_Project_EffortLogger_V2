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



import java.net.URL;
import java.util.ResourceBundle;

public class TableViewController implements Initializable{
	@FXML
	private TableColumn<projectClass, String> Start;
	
	@FXML
    private TableColumn<projectClass, String> endTime;
	
	@FXML
    private TableColumn<projectClass, String> project;
	
	@FXML
    private TableColumn<projectClass, String> LCS;
	
    @FXML
    private TableColumn<projectClass, String> EffortCategory;

    @FXML
    private TableColumn<projectClass, String> plan;

    

   

    @FXML
    private TableView<projectClass> table;
    
    @FXML
    private TextField txtStart;
    
    @FXML
    private TextField txtEnd;
    
    @FXML
    private TextField txtProject;
    
    @FXML
    private TextField txtLCS;
    
    @FXML
    private TextField txtEC;
    
    @FXML
    private TextField txtPlan;

    ObservableList<projectClass> initialData(){
    	projectClass p1 = new projectClass("November 11, 2023 10:12", "November 11, 2023 12:12", "Business Project", "Planning", "Plans", "Project Plan");
    	return FXCollections.<projectClass> observableArrayList(p1);
    }
    
    @FXML
    private void btnInsert(ActionEvent event) {
    	projectClass newData = new projectClass(txtStart.getText(), txtEnd.getText(), txtProject.getText(), txtLCS.getText(), txtEC.getText(), txtPlan.getText());
    	table.getItems().add(newData);
    	txtStart.clear();
    	txtEnd.clear();
    	txtProject.clear();
    	txtLCS.clear();
    	txtEC.clear();
    	txtPlan.clear();
    }
    
	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		// TODO Auto-generated method stub
		Start.setCellValueFactory(new PropertyValueFactory<projectClass, String>("Start"));
		endTime.setCellValueFactory(new PropertyValueFactory<projectClass, String>("endTime"));
		project.setCellValueFactory(new PropertyValueFactory<projectClass, String>("project"));
		LCS.setCellValueFactory(new PropertyValueFactory<projectClass, String>("LCS"));
		EffortCategory.setCellValueFactory(new PropertyValueFactory<projectClass, String>("EffortCategory"));
		plan.setCellValueFactory(new PropertyValueFactory<projectClass, String>("plan"));
		
		table.setItems(initialData());
	}
	

}

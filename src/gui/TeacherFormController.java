package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TeacherFormController implements Initializable {

	@FXML
	private TextField txtId;
	
	@FXML
	private TextField txtName;
	
	@FXML
	private TextField txtCpf;
	
	@FXML
	private TextField txtPhone;
	
	@FXML
	private DatePicker dpAdmissionDate;
	
	@FXML
	private TextField txtSalary;
	
	@FXML
	private TextField txtChief;
	
	@FXML
	private TextField txtCoordinator;
	
	@FXML
	private Label labelErrorName;
	
	@FXML
	private Label labelErrorCpf;
	
	@FXML
	private Label labelErrorPhone;
	
	@FXML
	private Label labelErrorAdmissionDate;
	
	@FXML
	private Label labelErrorSalary;
	
	@FXML
	private Label labelErrorChief;
	
	@FXML
	private Label labelErrorCoordinator;
		
	@FXML
	private Button btSave;
	
	@FXML
	private Button btCancel;
	
	@FXML
	private void onBtSaveAction() {
		System.out.println("onBtSaveAction");
	}
		
	@FXML
	private void onBtCancelAction() {
		System.out.println("onBtCancelAction");
			
	}
	@Override
	public void initialize(URL url, ResourceBundle rb) {
				
	}
	
	private void initializeNodes() {
		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldMaxLength(txtName, 60);
		Constraints.setTextFieldMaxLength(txtCpf, 12);
		Constraints.setTextFieldMaxLength(txtPhone, 15);
		Constraints.setTextFieldMaxLength(txtChief, 3);
		Constraints.setTextFieldMaxLength(txtCoordinator, 3);
		Constraints.setTextFieldDouble(txtSalary);
	}

}

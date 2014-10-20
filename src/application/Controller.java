package application;

import java.net.URL;
import java.util.ResourceBundle;

import application.GUIfeatures.*;
import javafx.scene.control.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class Controller implements Initializable {
	View myView;
	@FXML private NewWorkspaceButton newWorkspaceButton = new NewWorkspaceButton();
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("initializing");
		newWorkspaceButton.setController(this);
		System.out.println("initalized");
	}
	public void setView(View view){
		this.myView = view;
	}
	public View getView(){
		return myView;
	}

}

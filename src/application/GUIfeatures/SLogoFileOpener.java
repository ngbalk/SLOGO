package application.GUIfeatures;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ResourceBundle;

import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class SLogoFileOpener extends GenericGUIFeature {
	private Desktop desktop;

	public SLogoFileOpener() {
		Button button = new Button();
		button.setText("Load File");
		button.setOnAction(event -> openFile());
		this.getChildren().add(button);
		desktop = Desktop.getDesktop();
	}

	private void openFile() {
		Stage mainStage = new Stage();
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open Resource File");
		fileChooser.getExtensionFilters().addAll(
				new ExtensionFilter("Text Files", "*.txt"),
				new ExtensionFilter("Properties Files", "*.properties"),
				new ExtensionFilter("All Files", "*.*"));
		File selectedFile = fileChooser.showOpenDialog(mainStage);
		System.out.println(selectedFile.getPath());
		ResourceBundle rc = ResourceBundle.getBundle("resources.languages/"
				+ selectedFile.getPath().split("/")[selectedFile.getPath()
						.split("/").length - 1].split(".")[0]);
		System.out.println(rc.getString("background"));
		try {
			desktop.open(selectedFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package application.GUIfeatures;

import application.Constants.GUIconstants;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import static application.View.myResources;

public class HelpPageButton extends GenericGUIFeature implements
		GUIButtonFeature {

	private Stage myStage;

	public HelpPageButton() {
		super();
		Button button = new Button();
		button.setText(myResources.getString(GUIconstants.HELP_PAGE_TITLE));
		button.setOnAction(event -> behavior());

		Group root = new Group();

		WebView myWeb = new WebView();
		myWeb.getEngine()
				.load(myResources.getString(GUIconstants.HELP_PAGE_URL));

		myStage = new Stage();
		myStage.setTitle("Help Page");
		Scene scene = new Scene(root, 750, 500);
		root.getChildren().add(myWeb);
		myStage.setScene(scene);

		this.getChildren().add(button);
	}

	@Override
	public void behavior() {
		myStage.show();
	}

}

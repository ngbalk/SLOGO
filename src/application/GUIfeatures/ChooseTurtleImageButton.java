package application.GUIfeatures;

import application.View;
import application.Constants.GUIconstants;
import static application.Controller.myResources;


public class ChooseTurtleImageButton implements GUIButtonFeature {
	SubmitTextField myInput;
	View myView;

	public ChooseTurtleImageButton(double x, double y, View view, SubmitTextField input) {
		super(x, y);
		myView = view;
		this.setText(myResources.getString(GUIconstants.TURTLE_IMAGE_BUTTON_TITLE));
		myInput = input;
	}

	@Override
	public void behavior() {
		myView.getActiveWorkspace().getCurrentTurtle().setImage(myInput.getText());
	}

}

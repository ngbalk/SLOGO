package application.GUIfeatures;

import application.View;

public class ChooseTurtleImageButton extends GUIButtonFeature {
	SubmitTextField myInput;
	View myView;

	public ChooseTurtleImageButton(double x, double y, View view, SubmitTextField input) {
		super(x, y);
		myView = view;
		this.setText("Change Turtle Image");
		myInput = input;
	}

	@Override
	public void behavior() {
		myView.getActiveWorkspace().getCurrentTurtle().setImage(myInput.getText());
	}

}

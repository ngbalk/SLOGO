package application.GUIfeatures;

import application.View;

public class PenSizeButton extends GUIButtonFeature {
	SubmitTextField myInput;
	View myView;

	public PenSizeButton(double x, double y, View view, SubmitTextField input) {
		super(x, y);
		myView = view;
		this.setText("Change Pen Size");
		myInput = input;
		
	}

	@Override
	public void behavior() {
		myView.myActiveWorkspace.getCanvas().setPenSize(Double.parseDouble(myInput.getText()));
		
	}

}

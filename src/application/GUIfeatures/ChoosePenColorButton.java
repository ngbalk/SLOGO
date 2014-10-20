package application.GUIfeatures;

import javafx.scene.paint.Color;
import application.View;

public class ChoosePenColorButton extends GUIButtonFeature {
	View myView;

	public ChoosePenColorButton(double x, double y, View view) {
		super(x, y);
		myView = view;
		this.setText("Choose Pen Color");
	}

	public void behavior() {
		myView.myActiveWorkspace.getCanvas().setPenColor(myView.myColorPicker.getValue());
	}

}

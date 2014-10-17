package application.GUIfeatures;

import application.View;
import javafx.scene.control.TextArea;

public class SubmitTextButton extends GUIButtonFeature {
	private TextArea myInputText;
	private View myView;

	public SubmitTextButton(double x, double y, TextArea text, View view) {
		super(x, y);
		this.setText("Submit");
		myInputText = text;
		myView = view;
	}

	@Override
	public void behavior() {
		myView.updateTurtle(myView.myModel.parseInput(myInputText.getText()));
		myInputText.clear();
		
	}

}

package application.GUIfeatures;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import application.View;

public class PenSizeSlider extends AbstractGUIFeature {
	Slider mySlider;
	HBox myContainer;
	Label myLabel;

	public PenSizeSlider() {
		myContainer = new HBox();
		myLabel = new Label();
		mySlider = new Slider();
		mySlider.setMin(1);
		mySlider.setMax(100.0);
		mySlider.valueProperty().addListener(new ChangeListener<Number>(){

			@Override
			public void changed(ObservableValue<? extends Number> arg0,
					Number arg1, Number arg2) {
					behavior();
				
			}
		});
		myLabel.setText("Change Pen Size");
		myContainer.getChildren().addAll(myLabel, mySlider);
		this.getChildren().add(myContainer);
	}

	private void behavior() {
		myController.getActiveWorkspace().getCurrentTurtle().getPen().setPenSize(mySlider.getValue());
		
	}

}

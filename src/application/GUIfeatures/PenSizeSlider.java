package application.GUIfeatures;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import application.View;
import application.Constants.GUIconstants;
import static application.View.myResources;

public class PenSizeSlider extends AbstractGUIFeature {
	Slider mySlider;
	HBox myContainer;
	Label myLabel;

	public PenSizeSlider() {
		myContainer = new HBox();
		myLabel = new Label();
		mySlider = new Slider();
		mySlider.setMin(GUIconstants.PEN_SIZE_SLIDER_MINIMUM_VALUE);
		mySlider.setMax(GUIconstants.PEN_SIZE_SLIDER_MAXIMUM_VALUE);
		mySlider.valueProperty().addListener(new ChangeListener<Number>(){

			@Override
			public void changed(ObservableValue<? extends Number> arg0,
					Number arg1, Number arg2) {
					behavior();
				
			}
		});
		myLabel.setText(myResources.getString(GUIconstants.PEN_SLIDER_TITLE));
		myContainer.getChildren().addAll(myLabel, mySlider);
		this.getChildren().add(myContainer);
	}

	private void behavior() {
		myController.getActiveWorkspace().getCurrentTurtle().getPen().setPenSize(mySlider.getValue());
		
	}

}

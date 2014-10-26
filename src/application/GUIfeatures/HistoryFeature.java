package application.GUIfeatures;

import application.Constants.GUIconstants;
import javafx.collections.ListChangeListener;
import javafx.scene.control.TextArea;
import static application.View.myResources;

public class HistoryFeature extends GenericGUIFeature {
	private TextArea myText;

	public HistoryFeature() {
		myText = new TextArea();
		String toDisplay = GUIconstants.EMPTY_STRING;
		myText.setText(toDisplay);
		myText.setDisable(true);
		this.getChildren().add(myText);
	}
	/**
	 * Refresh the HistoryFeature display and add a change listener to the current ActiveWorkspace.
	 */
	public void update() {
		refreshDisplay();
		myController.getActiveWorkspace().getHistory()
				.addListener(new ListChangeListener<String>() {
					@Override
					public void onChanged(Change change) {
						refreshDisplay();
					}
				});
	}
	private void refreshDisplay(){
		 String toDisplay = GUIconstants.EMPTY_STRING;
		 for(String action :
		 myController.getActiveWorkspace().getHistory()){
		 toDisplay += action.toString() + GUIconstants.NEW_LINE;
		 }
		 myText.setText(toDisplay);
	}

}

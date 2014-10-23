package application.GUIfeatures;

import javafx.collections.ListChangeListener;
import javafx.scene.control.TextArea;

public class HistoryFeature extends AbstractGUIFeature {
	private TextArea myText;

	public HistoryFeature() {
		myText = new TextArea();
		String toDisplay = "";
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
					public void onChanged(Change arg0) {
						refreshDisplay();
					}
				});
	}
	private void refreshDisplay(){
		 String toDisplay = "";
		 for(String action :
		 myController.getActiveWorkspace().getHistory()){
		 toDisplay += action.toString() + "\n";
		 }
		 myText.setText(toDisplay);
	}

}

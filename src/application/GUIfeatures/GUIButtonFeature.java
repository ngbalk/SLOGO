package application.GUIfeatures;

import application.Controller;


/**
 * All GUI buttons must implement some behavior to be set on action. We chose to
 * use an interface so that all GUI Features can also extend GenericGUIFeature.
 * 
 * @author Wesley Valentine
 * @author Nick Balkisoon
 *
 */
public interface GUIButtonFeature {
	public abstract void behavior();
}

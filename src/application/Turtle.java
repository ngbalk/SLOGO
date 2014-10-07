package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Turtle extends AbstractDrawer{

	private ImageView myImage;
	
	public Turtle(double x, double y) {
		super(x, y);
	
	}
	
	public void rotateLeft(double rotation){
		this.rotate(rotation);
	}
	
	public void rotateRight(double rotation){
		this.rotate(-rotation);
	}
	
	public ImageView display(){
		return myImage;
	}
	
	public void setImage(String imageFileName){
		myImage.setImage(new Image(imageFileName));
	}
	
	
	
}

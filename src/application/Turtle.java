package application;

import Constants.UI;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Turtle extends AbstractDrawer{

	private ImageView myImage;
	
	public Turtle(double x, double y) {
		super(x, y);
		myImage = new ImageView();
		
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
		try{
			myImage.setImage(new Image(this.getClass().getResource(imageFileName).toExternalForm()));
		}
		catch(IllegalArgumentException e){
			System.out.println("Turtle image not found.\n" + e.getMessage());
			e.printStackTrace();
		}
		catch(NullPointerException e){
			System.out.println("Turtle image not found.\n" + e.getMessage());
			e.printStackTrace();	
		}
		
	}
	
	
	
}

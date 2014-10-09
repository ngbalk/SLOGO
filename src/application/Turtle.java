package application;

import application.Constants.UI;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Turtle extends AbstractDrawer{

	private ImageView myImage;
	
	public Turtle(double x, double y) {
		super(x, y);
		myImage = new ImageView();
		myImage.setRotate(90);
	

	}
	
	
	public void rotateLeft(double rotation){
		this.rotate(rotation);
		myImage.setRotate(myImage.getRotate() - rotation);
	}
	
	public void rotateRight(double rotation){
		this.rotate(-rotation);
		myImage.setRotate(myImage.getRotate() + rotation);
	}
	
	public void setDirection(double degree){
		myOrientation = degree;
		myImage.setRotate(-degree + 90);
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

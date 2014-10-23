package application;

import application.Constants.GUIconstants;
import javafx.geometry.Point2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;

public class Turtle extends AbstractTurtle{

	private ImageView myImage;
	
	public Turtle(double x, double y) {
		super(x, y);
		myImage = new ImageView();
		this.myImage.setX(x);
		this.myImage.setY(y);
		myImage.setRotate(90);
	}
	public Line move(double distance){
		Line line = super.move(distance);
		this.myImage.setX(this.myXLocation);
		this.myImage.setY(this.myYLocation);
		return line;
	}
	
	public void rotateLeft(double rotation){
		this.rotate(rotation);
		myImage.setRotate(myImage.getRotate() - rotation);
	}
	
	public void rotateRight(double rotation){
		this.rotate(-rotation);
		myImage.setRotate(myImage.getRotate() + rotation);
	}
	
	public double getSizeX(){
		return myImage.getX();
	}
	
	public double getSizeY(){
		return myImage.getY();
	}
	
	public void setDirection(double degree){
		myOrientation = degree;
		myImage.setRotate(-degree + 90);
	}
	
	public ImageView display(){
		return myImage;
	}
	
	public boolean isPenDown(){
		return myPen.getPenDownStatus();
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

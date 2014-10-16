package application;


import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class SLogoCanvas{
	Canvas myCanvas;
	Pane myPane;
	Rectangle myRectangle;

	public SLogoCanvas(double x, double y) {
		myCanvas = new Canvas(x, y);
		myPane = new Pane();
		myRectangle = new Rectangle(x, y);
		myRectangle.setFill(Color.WHITE);
		myPane.getChildren().add(myRectangle);
		myPane.getChildren().add(myCanvas);
	}
	/**
	 * Draw on the Canvas from the starting Point2D "start" to the ending Point2D "end"
	 * @param start Point2D
	 * @param end Point2D
	 */
	public void draw(Point2D start, Point2D end){
		myCanvas.getGraphicsContext2D().strokeLine(start.getX(), start.getY(), end.getX(), end.getY());
	}
	/**
	 * Clear the current canvas of any drawings
	 */
	public void clear(){
		myCanvas.getGraphicsContext2D().clearRect(0, 0, myCanvas.getWidth(), myCanvas.getHeight());
	}
	
	public Pane display(){
		return myPane;
	}
	
	public void setBackgroundColor(Color c){
		myRectangle.setFill(c);
	}

}

package application;

import com.sun.javafx.geom.Point2D;
import javafx.scene.canvas.Canvas;


public class SLogoCanvas{
	Canvas myCanvas;

	public SLogoCanvas(double x, double y) {
		myCanvas = new Canvas(x, y);
	}
	/**
	 * Draw on the Canvas from the starting Point2D "start" to the ending Point2D "end"
	 * @param start Point2D
	 * @param end Point2D
	 */
	public void draw(Point2D start, Point2D end){
		myCanvas.getGraphicsContext2D().strokeLine(start.x, start.y, end.x, end.y);
	}
	/**
	 * Clear the current canvas of any drawings
	 */
	public void clear(){
		myCanvas.getGraphicsContext2D().clearRect(0, 0, myCanvas.getWidth(), myCanvas.getHeight());
	}
	
	public Canvas display(){
		return myCanvas;
	}

}

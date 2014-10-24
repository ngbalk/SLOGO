package application;


import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;


public class SLogoCanvas{
	Canvas myCanvas;
	Pane myPane;
	Rectangle myRectangle;
	GridPane myReferenceGrid;
	boolean gridLinesVisible = false;
	

	public SLogoCanvas(double x, double y) {
		myCanvas = new Canvas(x, y);
		myPane = new Pane();
		myRectangle = new Rectangle(x, y);
		myRectangle.setFill(Color.WHITE);
		myPane.getChildren().add(myRectangle);
		myPane.getChildren().add(myCanvas);
		myReferenceGrid = setDefaultReferenceGrid();
	}
	
	public void toggleGridLines(){
		if (gridLinesVisible){
			myPane.getChildren().remove(myReferenceGrid);
			gridLinesVisible = false;
		}else{
			myPane.getChildren().add(myReferenceGrid);
			gridLinesVisible = true;
		}
	}
	
	private GridPane setDefaultReferenceGrid() {
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(0, 10, 0, 10));
		grid.setGridLinesVisible(true);
		for (int i = 0; i < 60; i++) {
	        RowConstraints rConstraint = new RowConstraints();
	        grid.getRowConstraints().add(rConstraint);
	    }
		for (int i = 0; i < 60; i++) {
	        ColumnConstraints cConstraint = new ColumnConstraints();
	        grid.getColumnConstraints().add(cConstraint);
	    }
		return grid;
	}
	/**
	 * Draw on the Canvas from the starting Point2D "start" to the ending Point2D "end"
	 * @param start Point2D
	 * @param end Point2D
	 */
	public void displayLine(Line line){
		myPane.getChildren().add(line);
	}
	/**
	 * Clear the current canvas of any drawings
	 */
	public void clear(){
		//myCanvas.getGraphicsContext2D().clearRect(0, 0, myCanvas.getWidth(), myCanvas.getHeight());
		myPane.getChildren().clear();
	}
	
	public Pane display(){
		//return myPane;
		return myPane;
	}
	
	public void setBackgroundColor(Color c){
		myRectangle.setFill(c);
	}
	
//	public void setPenSize(double size){
//		myCanvas.getGraphicsContext2D().setLineWidth(size);
//	}
//	
//	public void setPenColor(Color c){
//		myCanvas.getGraphicsContext2D().setStroke(c);
//	}

}

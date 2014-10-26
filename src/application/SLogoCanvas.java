package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import application.Constants.GUIconstants;
import javafx.geometry.Insets;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class SLogoCanvas {
	private Canvas myCanvas;
	private Pane myPane;
	private Rectangle myRectangle;
	private GridPane myReferenceGrid;
	private boolean gridLinesVisible = false;
	private List<Color> myColors;

	public SLogoCanvas(double x, double y) {
		myCanvas = new Canvas(x, y);
		myPane = new Pane();
		myRectangle = new Rectangle(x, y);
		myRectangle.setFill(Color.WHITE);
		myPane.getChildren().add(myRectangle);
		myPane.getChildren().add(myCanvas);
		myReferenceGrid = setDefaultReferenceGrid();
		myColors = setDefaultColors();
	}

	public void toggleGridLines() {
		if (gridLinesVisible) {
			myPane.getChildren().remove(myReferenceGrid);
			gridLinesVisible = false;
		} else {
			myPane.getChildren().add(myReferenceGrid);
			gridLinesVisible = true;
		}
	}
	public void addColor(int index, Color color){
		myColors.add(index, color);
	}
	public List<Color> getColors(){
		return myColors;
	}

	/**
	 * Creates a reference grid to be displayed on the canvas
	 * 
	 * @return
	 */
	private GridPane setDefaultReferenceGrid() {
		GridPane grid = new GridPane();
		grid.setHgap(GUIconstants.REFERENCE_GRID_GAP);
		grid.setVgap(GUIconstants.REFERENCE_GRID_GAP);
		grid.setPadding(new Insets(0, GUIconstants.REFERENCE_GRID_GAP, 0,
				GUIconstants.REFERENCE_GRID_GAP));
		grid.setGridLinesVisible(true);
		for (int i = 0; i < GUIconstants.REFERENCE_GRID_SIZE; i++) {
			RowConstraints rConstraint = new RowConstraints();
			grid.getRowConstraints().add(rConstraint);
			ColumnConstraints cConstraint = new ColumnConstraints();
			grid.getColumnConstraints().add(cConstraint);
		}
		return grid;
	}

	/**
	 * Draw on the Canvas from the starting Point2D "start" to the ending
	 * Point2D "end"
	 * 
	 * @param start
	 *            Point2D
	 * @param end
	 *            Point2D
	 */
	public void displayLine(Line line) {
		myPane.getChildren().add(line);
	}

	/**
	 * Clear the current canvas of any drawings
	 */
	public void clear() {
		myPane.getChildren().clear();
	}

	/**
	 * Return the Pane holding all of the content displayed on the SLogoCanvas
	 * 
	 * @return
	 */
	public Pane display() {
		return myPane;
	}

	/**
	 * Set the color of the background
	 * 
	 * @param color
	 */
	public void setBackgroundColor(Color color) {
		myRectangle.setFill(color);
	}

	public List<Color> setDefaultColors() {
		Color[] colors = new Color[] { Color.RED, Color.ORANGE, Color.YELLOW,
				Color.GREEN, Color.BLUE, Color.INDIGO, Color.VIOLET,
				Color.BLACK, Color.WHITE };
		List<Color> list = new ArrayList<Color>();
		for (Color c : colors){
			list.add(c);
		}
		return list;
	}

}

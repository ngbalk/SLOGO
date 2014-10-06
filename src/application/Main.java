package application;
import javafx.application.Application;
import javafx.stage.Stage;
public class Main extends Application{

	public Main() {
		// TODO Auto-generated constructor stub
	}
	public void start(Stage stage){
		View view = new View(stage);
	}
	public static void main(String[] args) {
		launch(args);

	}

}

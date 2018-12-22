import com.sun.prism.paint.Color;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class theDriverInWhichTheCodeIsRan extends Application
{

	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		spaceShip shiptopher = new spaceShip();
		Pane pain = new Pane(shiptopher);
		pain.setStyle("-fx-background-color: #000000");
		Scene scene = new Scene(pain, 750, 500);
		scene.setCursor(Cursor.NONE);


		primaryStage.setTitle("Test 123");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}

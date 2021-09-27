/**
 * Class: CMS 203 CS I
 * Instructor: Dr. Grinberg
 * Description: Running Hello Buttons with javaFX
 * Due: 9/27/2021
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Sign here: Yei Thek Wang
 */
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXDriver extends Application {
	   
	/**
	 * The main method for the GUI example program JavaFX version
	 * @param args not used
	 * @throws IOException
	 */
	public static void main(String[] args) {
		launch(args);   
	}
		   
	@Override
	public void start(Stage stage) throws IOException {
		//student Task #1:
		//  instantiate the FXMainPane, name it root
		FXMainPane root = new FXMainPane();
		//  set the scene to hold root
		stage.setScene(new Scene(root, 500, 100));
		//set stage title
		stage.setTitle("Hello World GUI");
		//display the stage
		stage.show();

	}
}
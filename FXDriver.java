package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXDriver extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

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

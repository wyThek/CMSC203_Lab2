
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.
 * Before beginning to implement, design the structure of your GUI in order to
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

    //student Task #2:
    //  declare five buttons, a label, and a textfield
    Button btn1, btn2, btn3, btn4, btn5, btn6;
    Label label1;
    TextField text1;

    //  declare two HBoxes
    HBox hb1, hb2;

    //student Task #4:
    //  declare an instance of DataManager
    DataManager dataManager;
    Insets inset = new Insets(5);

    /**
     * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
     * wait to add a component to its containing component until the container has
     * been created.  This is the only constraint on the order in which the following
     * statements appear.
     */
    FXMainPane() {
        //student Task #2:
        //  instantiate the buttons, label, and textfield
        btn1 = new Button("Hello");
        btn2 = new Button("Howdy");
        btn3 = new Button("Chinese");
        btn4 = new Button("Japanese");
        btn5 = new Button("Clear");
        btn6 = new Button("Exit");
        label1 = new Label("Feedback:");
        text1 = new TextField();

        //  instantiate the HBoxes
        hb1 = new HBox();
        hb2 = new HBox();

        // Add Events
        btn1.setOnAction(new handler());
        btn2.setOnAction(new handler());
        btn3.setOnAction(new handler());
        btn4.setOnAction(new handler());
        btn5.setOnAction(new handler());
        btn6.setOnAction(new handler());

        //student Task #4:
        //  instantiate the DataManager instance
        dataManager  = new DataManager();

        //  set margins and set alignment of the components
        hb1.setAlignment(Pos.CENTER);
        hb2.setAlignment(Pos.CENTER);
        hb1.setMargin(text1, inset);
        hb2.setMargin(btn1, inset);
        hb2.setMargin(btn2, inset);
        hb2.setMargin(btn3, inset);
        hb2.setMargin(btn4, inset);
        hb2.setMargin(btn5, inset);
        hb2.setMargin(btn6, inset);

        //student Task #3:
        //  add the label and textfield to one of the HBoxes
        //  add the buttons to the other HBox
        //  add the HBoxes to this FXMainPanel (a VBox)
        hb1.getChildren().addAll(label1, text1);
        hb2.getChildren().addAll(btn1, btn2, btn3, btn4, btn5,btn6);
        this.getChildren().addAll(hb1, hb2);
    }

    //Task #4:
    //  create a private inner class to handle the button clicks
    class handler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent event) {
            EventTarget returnedObject = event.getTarget();
            // if else statement to check which button is clicked
            if (returnedObject == btn1) {
                text1.setText(dataManager.getHello());
            } else if (returnedObject == btn2) {
                text1.setText(dataManager.getHowdy());
            } else if (returnedObject == btn3) {
                text1.setText(dataManager.getChinese());
            } else if (returnedObject == btn4) {
                text1.setText(dataManager.getJapanese());
            } else if (returnedObject == btn5) {
                text1.setText("");
            } else if (returnedObject == btn6) {
                Platform.exit();
                System.exit(0);
            }
        }
    }
}

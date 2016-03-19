package sample;


/*
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
*/


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        /*
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        */


        primaryStage.setTitle("SYNC");


        //grid layout
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));


        //Button
        Button btn = new Button("Join");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        //Text on action
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        //Sign in Button Event Handler
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                actiontarget.setId("actiontarget");
                actiontarget.setText("Sign in button pressed");
            }
        });

        //Scene code
        Scene scene = new Scene(grid, 1000, 1050);
        scene.getStylesheets().add(Main.class.getResource("Styles.css").toExternalForm());
        primaryStage.setScene(scene);


        //Controls
        Text scenetitle = new Text("SYNC");
        scenetitle.setId("sync-title");
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("Bluetooth Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        //grid.add(userTextField, 1, 1);
        grid.add(userTextField, 0, 2);


        primaryStage.show();


    }
}

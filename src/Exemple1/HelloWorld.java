package Exemple1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button buttonHelloWorld = new Button();
        buttonHelloWorld.setText("Print 'hello world'");

        buttonHelloWorld.setOnAction(event -> System.out.println("Hello world"));

        StackPane stackStackPane_root = new StackPane();
        stackStackPane_root.getChildren().add(buttonHelloWorld);

        primaryStage.setTitle("Hello world");
        primaryStage.setScene(new Scene(stackStackPane_root, 300, 250));
        primaryStage.show();
    }
}

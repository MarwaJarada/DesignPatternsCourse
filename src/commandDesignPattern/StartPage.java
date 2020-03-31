package commandDesignPattern;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartPage extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader=new FXMLLoader(getClass().getResource("UI.fxml"));
        Parent parent=loader.load();
        Scene scene=new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.setTitle("");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


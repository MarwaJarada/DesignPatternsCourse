package stateDesignPatern;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class UI extends Application implements Initializable {
    @FXML private ToggleGroup enemyGroup;
    @FXML private ToggleGroup healthGroup;
    @FXML private ToggleGroup ammoGroup;
    Player player=new Player();


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader=new FXMLLoader(getClass().getResource("UI.fxml"));
        Parent parent=loader.load();
        Scene scene=new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.setTitle("");
        primaryStage.show();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void lowHealthBtn(ActionEvent actionEvent) {
        player.lowHealth();

    }

    public void noHealthBtn(ActionEvent actionEvent) {
        player.noHealth();
    }

    public void playerRunsBtn(ActionEvent actionEvent) {
        player.playerRuns();
    }

    public void PlayerApproachesBtn(ActionEvent actionEvent) {
        player.playerApproaches();
    }

    public void fullAmmoBtn(ActionEvent actionEvent) {
        player.fullAmmo();
    }

    public void lowAmmoBtn(ActionEvent actionEvent) {
        player.lowAmmo();
    }

    public void startBtn(ActionEvent actionEvent) {
        // To reset the changes and start again
        enemyGroup.getSelectedToggle().setSelected(false);
        healthGroup.getSelectedToggle().setSelected(false);
        ammoGroup.getSelectedToggle().setSelected(false);
        player.startPlayer(); // to set the player into patrol state

    }

    public void actionBtn(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText("Current State");
        alert.setContentText("Player in "+player.getCurrentState().getClass().getSimpleName().split("S")[0]+" State");
        alert.showAndWait();


    }
}

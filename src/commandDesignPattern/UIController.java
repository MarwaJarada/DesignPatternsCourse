package commandDesignPattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class UIController implements Initializable {
    @FXML public ListView nameList;
    @FXML private TextField nameTxt;
    @FXML private Button addBtn;
    @FXML private Button redoBtn;
    @FXML private Button undoBtn;
    @FXML private Label warningMsg;
    private String name="";
    private CommandManager commandManager=new CommandManager();


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public static void main(String[] args) {



    }

    public void redoClicked(ActionEvent event){
        commandManager.redo();

    }

    public void undoClicked(ActionEvent event) {
        commandManager.undo();


    }
    // a null , b a , c b

    public void addClicked(ActionEvent event) {
          name= nameTxt.getText().trim();
          if (!name.equals("")) {
              warningMsg.setText("");
              AddingCommand addingCommand=new AddingCommand(name,nameList,nameTxt);
              addingCommand.execute();
              commandManager.addCommand(addingCommand);

          }else{
              nameTxt.setText("");
              warningMsg.setText("Please Enter valid Name!");
          }
    }
}

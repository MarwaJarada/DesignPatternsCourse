package commandDesignPattern;

import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class AddingCommand implements Command {
    String name;
    ListView listView;
    TextField textField;

    public AddingCommand(String name, ListView listView,TextField textField){
        this.name=name;
        this.listView=listView;
        this.textField=textField;
    }


    @Override
    public void execute() {
        listView.getItems().add(name);
        textField.setText("");
    }

    @Override
    public void unExecute() {
        listView.getItems().remove(name);
        textField.setText(name);
    }
}

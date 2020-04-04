package commandDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {
    List<Command> commandsList=new ArrayList<Command>();
    int cursor=0;

    public void addCommand(Command command){
        commandsList.add(command);
        cursor++;
    }

    public void redo(){
        if (cursor<commandsList.size()){
        commandsList.get(cursor).execute();
        cursor++;}

    }

    public void undo(){
        if (cursor>0){
            cursor--;
            commandsList.get(cursor).unExecute();
        }

    }


}

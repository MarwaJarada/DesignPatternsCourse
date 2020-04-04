package nocommand;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DrawCommandManager{

    List<nocommand.DrawingCommand> commands = new ArrayList<>();
    int index = 0;

    public void addCommand(nocommand.DrawingCommand c){
        commands.add(c);
        index++;
    }

    public  List<DrawingCommand> getCommands(){
        return commands;
    }

    public void undo() {
        if(index>0){
            index--;
            nocommand.DrawingCommand c = commands.get(index);
            c.unexecute();
        }
    }

    public void redo() {
        if(index < commands.size()){
            DrawingCommand c = commands.get(index);
            c.execute();
            index++;
        }
    }


}

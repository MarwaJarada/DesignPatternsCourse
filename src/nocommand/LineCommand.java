package nocommand;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;

public class LineCommand implements DrawingCommand,Serializable {

    int x1,y1,x2,y2;
    transient Graphics g;

    public LineCommand(int x1, int y1, int x2, int y2, Graphics g){
        this.x1= x1;
        this.y1 = y1;
        this.x2= x2;
        this.y2 = y2;
        this.g = g;
    }

    @Override
    public void execute() {
        g.setColor(Color.BLACK);
        g.drawLine(x1, y1, x2, y2);
}

    @Override
    public void unexecute() {
        g.setColor(Color.WHITE);
        g.drawLine(x1, y1, x2, y2);
    }



}

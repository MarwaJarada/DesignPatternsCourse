package nocommand;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JFrame;

import nocommand.ControlPanel.ControlPanelListener;


public class FreeDrawApp extends JFrame {
    FileOutputStream fileOut;
    ObjectOutputStream objectOut;
    FileInputStream fileInput;
    ObjectInputStream objectInput;


    DrawCommandManager manager;
    public FreeDrawApp() throws IOException, ClassNotFoundException {
        this.setTitle("draw app");
        manager = new DrawCommandManager();

        this.setSize(400, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().setBackground(Color.WHITE);
        final DrawingPanel drawPanel = new DrawingPanel(manager);
        this.getContentPane().add(drawPanel,BorderLayout.CENTER);
        String[] btns = {"Undo","Redo"};
        ControlPanel cp = new ControlPanel(btns);

        cp.addControlPanelListener(new ControlPanelListener(){

            @Override
            public void buttonPressed(String btnName) {
                if(btnName.equals("Undo")){
                    manager.undo();

                }else if(btnName.equals("Redo")){
                    manager.redo();
                }
            }

        });
        this.getContentPane().add(cp,BorderLayout.SOUTH);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        // Memento Pattern: ------------------------------------------------------------------------------------------
        this.drawAfterOpen();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                try {
                    if (manager.getCommands().isEmpty()){
                        fileOut = new FileOutputStream("commands.dat",true);
                    }else {
                        fileOut = new FileOutputStream("commands.dat",false);
                    }
                    objectOut=new ObjectOutputStream(fileOut);
                        objectOut.writeObject(manager.getCommands());
                    objectOut.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                super.windowClosing(windowEvent);
            }
        });
    }


    public void drawAfterOpen() throws IOException, ClassNotFoundException {
         fileInput=new FileInputStream("commands.dat");
         objectInput=new ObjectInputStream(fileInput);
        ArrayList<LineCommand> commands=(ArrayList<LineCommand>)objectInput.readObject();
        if (!commands.isEmpty()) {
            for (LineCommand lineCommand : commands) {
                FreeDrawApp.this.getGraphics().setColor(Color.BLACK);
                FreeDrawApp.this.getGraphics().drawLine(lineCommand.x1, lineCommand.y1, lineCommand.x2, lineCommand.y2);
            /*manager.addCommand( // To redo and undo functionality
                        new LineCommand(
                                lineCommand.x1, lineCommand.y1, lineCommand.x2, lineCommand.y2, FreeDrawApp.this.getGraphics()));
            */
            }
        }
        }
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        new FreeDrawApp();
    }
}

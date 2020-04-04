package nocommand;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel{

    long startTime, currentTime;
    int startX=0, startY=0;
    int delay = 100;
    DrawCommandManager manager;
    FileInputStream fileInput;
    ObjectInputStream objectInput;

    public DrawingPanel(DrawCommandManager manager) throws IOException, ClassNotFoundException {
        this.manager = manager;
        this.setBackground(Color.WHITE);
        this.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(MouseEvent e) {
                startX = e.getX();
                startY = e.getY();
                startTime = System.currentTimeMillis();

            }

            @Override
            public void mouseReleased(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

        });
        this.addMouseMotionListener(new MouseMotionListener(){

            @Override
            public void mouseDragged(MouseEvent e) {
                long currentTime = System.currentTimeMillis();
                if(currentTime - startTime >= delay){
                    LineCommand c = new LineCommand(startX, startY, e.getX(), e.getY(), DrawingPanel.this.getGraphics());
                    c.execute();
                    manager.addCommand(c);
                    DrawingPanel.this.getGraphics().drawLine(startX, startY, e.getX(), e.getY());
                    startX = e.getX();
                    startY = e.getY();
                    startTime = currentTime;
                }
            }

            @Override
            public void mouseMoved(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

        });
    }



}

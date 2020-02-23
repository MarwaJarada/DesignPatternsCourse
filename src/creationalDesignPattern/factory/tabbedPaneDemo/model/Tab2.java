package creationalDesignPattern.factory.tabbedPaneDemo.model;

import creationalDesignPattern.factory.tabbedPaneDemo.SuperTab;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

/**
 * @author Marwa N. Jarada
 * @Date 20/2/2020
 */

public class Tab2 implements SuperTab {
    JPanel panel;
    BufferedImage image;
    @Override
    public JPanel tabFunctionality(){
        // Does it's Functionality here
        panel=new JPanel();
        JTextArea textArea=new JTextArea("This is tab2");
        panel.add(textArea);
        return panel;
    }
}

package creationalDesignPattern.factory.tabbedPaneDemo.model;

import creationalDesignPattern.factory.tabbedPaneDemo.SuperTab;

import javax.swing.*;
import java.awt.*;

/**
 * @author Marwa N. Jarada
 * @Date 20/2/2020
 */

public class Tab3 implements SuperTab {
    JPanel panel;
    @Override
    public JPanel tabFunctionality() {
        // Does it's Functionality here
        panel=new JPanel();
        TextField textField=new TextField("This is tab3 content");
        this.panel.add(textField);
        return panel;
    }
}

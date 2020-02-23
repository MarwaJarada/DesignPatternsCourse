package creationalDesignPattern.factory.tabbedPaneDemo.model;

import creationalDesignPattern.factory.tabbedPaneDemo.SuperTab;

import javax.swing.*;

/**
 * @author Marwa N. Jarada
 * @Date 20/2/2020
 */

public class Tab1 implements SuperTab {
    private JPanel panel;
    @Override
    public JPanel tabFunctionality() {
        // Does it's Functionality here
        panel=new JPanel();
        JButton button=new JButton("This is tab1");
        panel.add(button);
        return panel;
    }
}

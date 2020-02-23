package creationalDesignPattern.factory.tabbedPaneDemo;

/**
 * @author Marwa N. Jarada
 * @Date 20/2/2020
 */

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;

public class UI extends JFrame {

    public  void setJFrame() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        setSize(600, 300);
        setTitle("Tabbed Panel Demo");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTabbedPane tabbedPane=new JTabbedPane();
        for (int num:TabFactory.getHashTap().keySet()){
            Class<? extends SuperTab> tab=TabFactory.getHashTap().get(num);
            JPanel panel= null;
            try {
                panel = tab.getConstructor().newInstance().tabFunctionality();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            tabbedPane.addTab(tab.getSimpleName(),panel);

        }
        this.add(tabbedPane);
        setVisible(true);

    }



    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        UI controlPanel=new UI();
        //UI.createTabs();
        controlPanel.setJFrame();


    }
}

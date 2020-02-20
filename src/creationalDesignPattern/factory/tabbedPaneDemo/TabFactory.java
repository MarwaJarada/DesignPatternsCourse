package creationalDesignPattern.factory.tabbedPaneDemo;

/**
 * @author Marwa N. Jarada
 * @Date 20/2/2020
 */

import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class TabFactory {
    private static Map<Integer,Class<? extends SuperTab>> hashTap=new HashMap<>();
    static{
        File file=new File("D:\\6th Semester\\Software Design And Arch\\DesignPatterns\\src\\creationalDesignPattern\\factory\\tabbedPaneDemo\\model");
        File[] tabs=file.listFiles();
        int number=0;
        for (File tab: tabs){
            String name=tab.getName().split("\\.")[0];
            try {
                Class tabClass=Class.forName("creationalDesignPattern.factory.tabbedPaneDemo.model."+name).asSubclass(SuperTab.class);
                hashTap.put(number,tabClass);
                number++;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }
    }
    public static Map<Integer,Class<? extends SuperTab>> getHashTap(){
        return hashTap;
    }




}

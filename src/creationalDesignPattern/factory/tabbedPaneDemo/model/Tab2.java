package creationalDesignPattern.factory.tabbedPaneDemo.model;

import creationalDesignPattern.factory.tabbedPaneDemo.SuperTab;

/**
 * @author Marwa N. Jarada
 * @Date 20/2/2020
 */

public class Tab2 implements SuperTab {
    @Override

    public String tabFunctionality() {
        // Does it's Functionality here
        return " This is tab number2";
    }
}

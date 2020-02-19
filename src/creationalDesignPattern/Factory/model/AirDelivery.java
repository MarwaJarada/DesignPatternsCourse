package creationalDesignPattern.Factory.model;

/**
 * @author Marwa N. Jarada
 * @Date 2/9/2020
 */

public class AirDelivery implements Delivery {
    @Override
    public void deliver() {
        //Doing Air Delivery
        System.out.println("Air Delivery choosed");
    }
}

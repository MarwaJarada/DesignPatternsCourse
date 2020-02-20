package creationalDesignPattern.factory.delivery.model;

/**
 * @author Marwa N. Jarada
 * @Date 2/9/2020
 */

public class MaritimeDelivery implements Delivery {
    @Override
    public void deliver() {
        //Doing Maritime Delivery
        System.out.println("Maritime Delivery choosed");

    }
}

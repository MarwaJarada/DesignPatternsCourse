package creationalDesignPattern.Factory.model;

/**
 * @author Marwa N. Jarada
 * @Date 2/9/2020
 */

public class LandDelivery implements Delivery {
    @Override
    public void deliver() {
        //Doing Land Delivery
        System.out.println("Land Delivery choosed");

    }
}

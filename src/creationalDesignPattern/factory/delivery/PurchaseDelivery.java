package creationalDesignPattern.factory.delivery;

import java.lang.reflect.InvocationTargetException;

public class PurchaseDelivery {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Factory.createDelivery(2);

    }
}

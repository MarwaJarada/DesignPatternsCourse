package creationalDesignPattern.Factory;

import creationalDesignPattern.Factory.model.Delivery;

import java.io.*;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class Factory {

    private static Map<Integer,Class <? extends Delivery>> deliveryHash= new HashMap<>();

    //Using Injection
    static {
        File file=new File("D:\\6th Semester\\Software Design And Arch\\DesignPatterns\\src\\creationalDesignPattern\\Factory\\model");
        File[] classFiles= file.listFiles();
        int number=0;
        for (File classFile: classFiles ){
            String name=classFile.getName().split("\\.")[0];

            try {
                Class deliverySubClass= Class.forName("creationalDesignPattern.Factory.model."+name).asSubclass(Delivery.class);
                deliveryHash.put(number,deliverySubClass);
                number++;

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }


        }

    }



    public static Delivery createDelivery(int num) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<? extends Delivery> deliveryType= deliveryHash.get(num);
        Delivery delivery=(Delivery) deliveryType.getConstructor().newInstance();
        delivery.deliver();
        return delivery;

    }

/**
 * Using if statement
    public Delivery createDelivery(int num){
        Delivery delivery=null;
        if (num==1){
            delivery=new LandDelivery();
        }else if (num==2){
            delivery=new AirDelivery();
        }else if (num==3){
            new MaritimeDelivery();
        }else
            throw new IllegalArgumentException("Wrong number!");
    }
*/

}

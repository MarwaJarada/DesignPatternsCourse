package creationalDesignPattern.factory.employee;

import creationalDesignPattern.builder.Student;

import java.lang.reflect.Field;
import java.util.HashMap;

public class Factory {
    public static Employee[] employees=new Employee[10];

    static {
        employees[0]=new Employee("1234","Marwa","Jarada","jobTitle");
        employees[1]=new Employee("3214","name2","lname2","jobTitle2");
        employees[2]=new Employee("5469","name3","lname3","jobTitle3");
        employees[3]=new Employee("8521","lname4","lname4","jobTitle4");

    }

    public static HashMap<Integer,String> showEmployeeAttribute() throws ClassNotFoundException {
        Class employeeClass=Class.forName("creationalDesignPattern.factory.employee.Employee");
//        Field[] empAtt=employeeClass.getDeclaredFields();
        HashMap<Integer,String> empAttHash=new HashMap<>();
        Field[] empAtt=employeeClass.getDeclaredFields();
        int count=0;
        for(Field name : empAtt){
            empAttHash.put(count,name.toString().split("\\.")[6]);
            count++;
        };
        return empAttHash;
    }


}

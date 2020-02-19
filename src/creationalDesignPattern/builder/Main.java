package creationalDesignPattern.builder;

/**
 * @author Marwa N. Jarada
 * @Date 2/9/2020
 */

public class Main {
    public static void main(String[] args) {
        Student.Builder builder= new Student.Builder();
        builder.setFirstName("Marwa");
        builder.setLastName("Jarada");
        builder.setId("220170326");
        builder.setDepartment("IT-CS");
        Student student=builder.build();


    }
}

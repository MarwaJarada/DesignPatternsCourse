package creationalDesignPattern.factory.employee;

/**
 * @author Marwa N. Jarada
 * @Date 20/2/2020
 */

public class Employee {
     String id,firetName,lastName,jobTitle;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFiretName() {
        return firetName;
    }

    public void setFiretName(String firetName) {
        this.firetName = firetName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Employee(String id, String firetName, String lastName, String jobTitle) {
        this.id = id;
        this.firetName = firetName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
    }


}

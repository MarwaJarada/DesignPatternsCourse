package creationalDesignPattern.builder;

/**
 * @author Marwa N. Jarada
 * @Date 2/9/2020
 */

public class Student {
    private String firstName,lastName,id,department;
    private String phoneNumber;

    private Student(String firstName,String lastName,String id,String department){
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=id;
        this.department=department;
        this.phoneNumber=phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    static class Builder{
        private String firstName,lastName,id,department;
        private String phoneNumber;

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }


        public Student build(){
            if (this.firstName==null)
                throw new NullPointerException(" First Name must be entered");
            if (this.lastName==null)
                throw new NullPointerException(" Last Name must be entered");
            if (this.id==null)
                throw new NullPointerException(" Id must be entered");
            if (this.department==null)
                throw new NullPointerException(" Department must be entered");
            Student student=new Student(firstName,lastName,id,department);
            student.setPhoneNumber(this.phoneNumber);
            return student;
        }

    }



}

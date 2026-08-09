package OOPS.Encapsulation;
// Student.java
class Student {

    // Private variables (Data Hiding)
    private String name;
    private int age;

    // Setter Method for Name
    public void setName(String name) {
        this.name = name;
    }

    // Setter Method for Age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter Method for Name
    public String getName() {
        return name;
    }

    // Getter Method for Age
    public int getAge() {
        return age;
    }
}

// Main Class
public class encap1 {

    public static void main(String[] args) {

        // Creating Object
        Student s = new Student();

        // Setting Values
        s.setName("Theniga");
        s.setAge(20);

        // Getting and Printing Values
        System.out.println("Name : " + s.getName());
        System.out.println("Age  : " + s.getAge());
    }
}
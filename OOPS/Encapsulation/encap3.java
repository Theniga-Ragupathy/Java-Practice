class Student {

    private int age;

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }
}

public class encap3 {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setAge(15);  // Invalid
        s1.setAge(20);  // Valid

        System.out.println("Age: " + s1.getAge());
    }
}
class Person{
    String name;
void displayname(){
    System.out.println(name);
}

    }
class Employee extends Person {
    int empid;
    void displayempid(){
        System.out.println(empid);
    }
}
class Manager extends Employee{
    String department;
    void displaydepartment(){
        System.out.println(department);
        }
}
public class multilevelinheritance{
    public static void main (String[]args){
        Manager m = new Manager();
        m.name="theniga";
        m.empid=59;
        m.department="cs";
        m.displayname();
        m.displayempid();
        m.displaydepartment();
    }
}
class student{
    private String name;
    private int age;


public void setname(String name){
    this.name=name;

}
public void setage(int age){
    this.age=age;
        } // Getter
    public String getname() {
        return name;
    }

    // Getter
    public int getage() {
        return age;
    }
}

public class encap2{
    public static void main(String []args){
        student s1=new student();
        s1.setname("theniga");
        s1.setage(19);
        System.out.println(s1.getname());
        System.out.println(s1.getage());
    }
}
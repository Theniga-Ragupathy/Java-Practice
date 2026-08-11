class employee{
    private String name;
    private int salary;
    public void setname(String name){
        this.name =name;
    }
    public void setsalary(int salary){
        if (salary>=10000){
            this.salary=salary;
        }else{
            System.out.println("Invalid salary");
        }
    }
    public String getname(){
        return name;
    }
    public int getsalary(){
        return salary;
    }
}
public class encap4{
    public static void main(String[] args) {
        employee s1 =new employee();
        s1.setname("theniga");
        s1.setsalary(25000);
        System.out.println(s1.getname());
         System.out.println("salary: " + s1.getsalary());

    }
}

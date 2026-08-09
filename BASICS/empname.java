package BASICS;
class empname{
    int empid;
    String name;
    double salary;
    empname(int empid,String name,double salary){
    this.empid=empid;
this.name=name;
this.salary=salary;
    }
    void display(){
        System.out.println(empid);
        System.out.println(name);
        System.out.println(salary);
        
    }

    public static void main(String[]args){

    empname n=new empname(1,"theniga",300000);
    empname a=new empname(2,"kani",50000);
    n.display();
    a.display();
    }}
    

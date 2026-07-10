class student{
    String name;
    int age;
    student(String name, int age){
    
this.name=name;
this.age=age;
    }
void display(){
    System.out.print(name);
    System.out.print(age);
}

public static void main(String[]args){
student n=new student("theniga",19);
student a=new student( "arun",19);

n.display();
a.display();
}}

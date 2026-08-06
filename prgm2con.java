class student{
    String name ;
    int age;
    student()
{
     name = "Theniga";
     age = 20;
}

void display(){
    System.out.println(name);
    System.out.println(age);
    }}
public class prgm2con{
    public static void main(String[] args) {
        student n= new student();
        
        n.display();
    }
}
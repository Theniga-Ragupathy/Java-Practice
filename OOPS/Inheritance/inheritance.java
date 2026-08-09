package OOPS.Inheritance;
class animal{
    void eat(){
System.out.println("the animal is eating");
}}
class dog extends animal{
    void bark(){
        System.out.println("the dog is barking");
    }
}
public class inheritance {
    public static void main(String []args){
        dog d = new dog();
        d.bark();
        d.eat();
    }
}

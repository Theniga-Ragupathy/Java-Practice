package OOPS.Polymorphism;
class calculater{
    void add(int a,int b)
    {
        System.out.println(a+b);
        
        }

void add (int a,int b, int c ){
    System.out.println(a+b+c);
}
 void add (double a, double b){
    System.out.println(a+b);
 } }
 public class methodoverloading{
    public static void main(String[] args) {
        calculater c=new calculater();
        c.add(10,20);
        c.add(5,9,3);
        c.add(3.5,5.9);
    }
 }
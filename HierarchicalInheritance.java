class Vehicle{
    String Brand;
     void displayBrand(){
        System.out.println(Brand);
    }
}
class Car extends Vehicle{
    String Model;
    void displayModel(){
        System.out.println(Model);
    }
}
class Bike extends Vehicle{
    int Mileage;
    void displayMileage(){
        System.out.println(Mileage);
    }
}
public class HierarchicalInheritance{
    public static void main(String[] args) {
        Car c=new Car();{
            c.Brand="BMW";
            c.Model="M5";
        c.displayBrand();
        c.displayModel();

            }
            Bike b=new Bike();
            b.Brand="Duke";
            b.Mileage=150;
            b.displayMileage();
            b.displayBrand();
    }
}
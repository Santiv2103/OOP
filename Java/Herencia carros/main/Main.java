package main;

public class Main {
    
    public static void main(String[] args) {
          
    Car car = new Car();
    
    car.go();
    
    Bicycle bike = new Bicycle();
    
    bike.stop();
    
    Motorcycle moto = new Motorcycle();
    
    moto.go();
    
    Skate skate = new Skate();
    
    skate.go();
    
    
    System.out.println(car.doors);
    System.out.println(bike.pedals);
    System.out.println(moto.wheels);
    System.out.println(skate.wheels);
    }
    
}

package Carrros;

public class Carrros {
    int modelYear;
    String modelName;
    int precio;
    
    public Carrros(int year, String name){
        modelYear = year;
        modelName = name;
        int prize = 0;
        precio = prize;
    System.out.println("mi carro es modelo" + modelYear + "y es un" + modelName);    
    }
    
    public int precio (int prize){
        precio = prize;
        return precio;
        
    }
    public static void main(String[] args) {
        Carrros myCar = new Carrros(2010,"volkswagen");
        System.out.println(myCar.precio(9000));
    
        
    }
    
}
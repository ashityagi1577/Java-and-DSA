class Vehicle{
    int wheels;
    String color;
    String engine;

    Vehicle(){
      System.out.println("Vechile ");
      color="black";
      wheels=4;  
    }

    void run(){
        System.out.println("running");
    }

    void brake(){
        System.out.println("brakes applied");
    }
}

   
    class Car extends Vehicle{
        Car(){
      super();
        }
      void display(){
        super.run();
        super.brake();
        System.out.println("Car");
    }
}
    
    public class Inheritance {
    public static void main(String[] args){
        Car c=new Car();
        //c.brake();
         //c.run();
         c.display();
    }
}



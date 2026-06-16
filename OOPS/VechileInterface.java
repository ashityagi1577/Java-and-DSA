interface Vechile1{
    void start();
    void stop();

}
class Car1 implements Vechile1{
    public void start(){
        System.out.println("The car starts");
    }
    public void stop(){
        System.out.println("The car stop");
    }
}

class Bike implements Vechile1{
    public void start(){
        System.out.println("The bike starts");
    }
    public void stop(){
        System.out.println("The bike stop");
    }
}

public class VechileInterface {
    public static void main(String[] args){
        Car1 c=new Car1();
        c.start();
        c.stop();
        Bike b=new Bike();
        b.start();
        b.stop();
    }
}


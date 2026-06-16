// 1.Create a class called printer overload a method called printDocument . One version takes an 
// integer (no. of copies) . The other class a string (a secret message).

//2. Create a parent class Application with a turnOn() method, Create a child class Toaster that
//  overrides trunOn() to say "Heating up bread" , test both in your main method 

class Printer{
         void printDocument(int n){
            System.out.println("Printing" +n);
         }
          //overload method
         void printDocument(String s){
            System.out.println("a secret message" +s);
         }
}

//task 2 method overloading

class Application{
    void turnOn(){
        System.out.println("Application is turning on");
    }
}

class Toaster extends Application{
    @Override
    void turnOn(){          // redefine turnOn() methods
    
    }
}
public class Polymorphism{
    public static void main(String[] args){
        System.out.println("Testing task 1:" );
        Printer myPrinter=new Printer();            //Creates a new object/instance 
        myPrinter.printDocument(5);
        myPrinter.printDocument("The cake is delicious");

        Toaster mytoaster=new Toaster();
        mytoaster.turnOn();
    }
    
}

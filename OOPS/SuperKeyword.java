// Create a parent class called Shape with a string variable color set as Red .
//  Then create a circle class that extends Shape. in circle , create its own color
//  variable set to blue.
// write a method in circle that prints both colors using the super keyboard .
//Create a another class square highlighting hierarchical inheritance.

class Shape1{
    String color="Red";
}

class Circle1 extends Shape1{
    String color="Blue";

    void display(){
        System.out.println("The color of Circle is :" +color);
        System.out.println("The color of Shape is :" +super.color);
    }
}

class Square extends Shape1{
  Square(){
  super();
  }
}

public class SuperKeyword {
    public static void main(String[] args){
    Circle1 c1=new Circle1();
    c1.display();
    }
}


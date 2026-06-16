abstract class Shape{
    abstract void area();
 
}

class Circle extends Shape{
    int r=5;

    void area(){
        double result=3.14*r*r;
        System.out.println("The area of circle:"+result);
    }

}

class Rectangle extends Shape{
    int l=4;
    int b=5;
    void area(){
        int result=l*b;
        System.out.println("The area of rectangle:"+result); 
    }

}

public class AbstractionShape {
 public static void main(String[] args){
    Circle c=new Circle();
    c.area();
    Rectangle re=new Rectangle();
    re.area();
 }   
}


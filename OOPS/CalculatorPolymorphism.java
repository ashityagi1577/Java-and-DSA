class Calculator{
    int add(int a,int b){
        return a+b;
    }

    double add(double a,double b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }
}

// Method Overloading

class AdvancedCalculator extends Calculator{
    int add(int a,int b){
        return a+b+10;
    }
}

public class CalculatorPolymorphism {
    public static void main(String[] args){
        Calculator c=new Calculator();
        System.out.println(c.add(5,10));
        System.out.println(c.add(55.25,100.65));
        System.out.println(c.add(5,10,3));


        AdvancedCalculator a=new AdvancedCalculator();
        System.out.println(a.add(5,10));

    }
}


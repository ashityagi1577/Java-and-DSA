class Animal1{

    void eats(){
        System.out.println("the animal eats food");
    }
}

class Dog1 extends Animal1{     //Single Inheritance
    void bark(){
        System.out.println("The dog barks");
    }
}

class Puppy extends Dog1{         //multilevel Inheritance
    void cute(){
        System.out.println("The puppy is very cute");
    }
}

class Cat1 extends Animal1{         //Hiearichical Inheritance
    void meow(){
        System.out.println("The cat meows");
    }
}


public class InheritanceTypes {
    public static void main(String[] args){
        Dog1 d1=new Dog1();
        d1.bark();
        d1.eats();

        Puppy p1=new Puppy();
        p1.bark();
        p1.cute();
        p1.eats();

        Cat1 c1=new Cat1();
        c1.eats();
    }
}

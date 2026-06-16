abstract class Animal{
  abstract void sound();

  public void sleep(){                 //Inheritance
    System.out.println("The animal sleeps");
  }
  }

  class Dog extends Animal{                //method override
    @Override
    void sound(){
        System.out.println("The dog barks");
    }
  }

  class Cat extends Animal{
    void sound(){
         System.out.println("The cat meow");
    }
  }


public class AbstractionAnimal {
    public static void main(String[] args){
        Dog d=new Dog();
        d.sound();
        Cat c=new Cat();
         c.sound();
    }
}



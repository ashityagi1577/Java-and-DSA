interface DogAnimal{
    void sound();
}

interface CatAnimal{
    void sound();

    }


class Puppy implements CatAnimal,DogAnimal{
    public void sound(){
        System.out.println("The puppy is very cute");
    }
}

public class InterfaceAnimal {
    public static void main(String[] args){
        Puppy p1=new Puppy();
        p1.sound();
    }
}


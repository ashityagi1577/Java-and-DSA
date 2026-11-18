
interface DogAnimal {
    void sound();
}

interface CatAnimal {
    void sound();
}

class PuppyAnimal implements DogAnimal, CatAnimal {
    @Override
    public void sound() {
        System.out.println("The puppy is very cute");
    }
}

public class InterfaceAnimal {
    public static void main(String[] args) {
        PuppyAnimal p1 = new PuppyAnimal();
        p1.sound();
    }
}



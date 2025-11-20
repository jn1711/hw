abstract class Animal{
    abstract String makeSound();
}

class Dog extends Animal{
    @Override
    String makeSound(){
        return "Gaf gaf";
    }
}

class Cat extends Animal{
    @Override
    String makeSound(){
        return "Meow meow";
    }
}

class Cow extends Animal{
    @Override
    String makeSound(){
        return "Moo moo";
    }
}

public class Task1 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal cow = new Cow();

        animal_sound(cat, dog, cow);
    }
    public static void animal_sound(Animal ...animal){
        for (int i=0; i< animal.length; i++){
            System.out.println(animal[i].makeSound());
        }
    }


}
public class ABSINT2 {
    public static void main(String[] args) {
        Dog dog = new Dog("Рэкс", 3);
        dog.makeSound();
        Cat cat = new Cat("Мурка", 2);
        cat.makeSound();
        Lion lion = new Lion("Симба", 5);
        lion.makeSound();
        Elephant elephant = new Elephant("Дамбо", 7);
        elephant.makeSound();
    }
}
abstract class Animal{
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void makeSound();
    public String info(){
        return name + " " + age;
    }
}

interface Domestic{
    String getOwner();
}
interface Wild{
    boolean isEndangered();
}

class Dog extends Animal implements Domestic{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Ит: аф аф");
    }

    @Override
    public String getOwner() {
        return "Хозяйн собаки Н";
    }
}

class Cat extends Animal implements Domestic{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Мысық: мяу");
    }

    @Override
    public String getOwner() {
        return "Хозяйн кошки У";
    }
}
class Lion extends Animal implements Wild{
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Арыстан: арр");
    }

    @Override
    public boolean isEndangered() {
        System.out.println("Арсытан жойылып бара жатқан жоқ");
        return false;
    }
}

class Elephant extends Animal implements Wild{
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Фффф");
    }

    @Override
    public boolean isEndangered() {
        System.out.println("Піл жойылып бара жатқан жоқ");
        return false;
    }
}
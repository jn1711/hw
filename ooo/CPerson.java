public class CPerson {
    public static void main(String[] args) {
        Person adam1 = new Person();
        adam1.move();
        adam1.talk();

        Person adam2 = new Person("Baijanov Rasul", 20);
        adam2.move();
        adam2.talk();
    }
}
class Person{
    private String fullName;
    int age;

    public Person() {}

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.println(fullName + " ходит");
    }
     public void talk(){
         System.out.println(fullName + " говорит");
     }
}
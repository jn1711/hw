public class AbcInt1 {
    public static void main(String[] args) {
        Carr car1 = new Carr("Audi", "E-trone");
        car1.move();
        car1.charge();

        Bike bike1 = new Bike("Trek", "X-Caliber");
        bike1.move();
        bike1.driveOffRoad();
    }
}

abstract class Transportt{
    String brand;
    String model;

    public Transportt(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void move();
}

interface Electric{
    void charge();
}
interface OffRoad{
    void driveOffRoad();
}

class Carr extends Transportt implements Electric{

    public Carr(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void move() {
        System.out.println("Машина движется");
    }

    @Override
    public void charge() {
        System.out.println("Осталось 59% зарядки");
    }
}

class Bike extends Transportt implements OffRoad{
    public Bike(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void move() {
        System.out.println("Велоосипед движется");
    }


    @Override
    public void driveOffRoad() {
        System.out.println("Велосипед сможет передвигаться по бездорожью");
    }
}
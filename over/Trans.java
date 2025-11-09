public class Trans {
    public static void main(String[] args){
        Car car1 = new Car("Toyota Camry", 210, "бензин");
        Car car2 = new Car("Tesla Model 3", 250, "электро");
        Car car3 = new Car("Hyundai Tucson", 200, "дизель");

        Bicycle b1 = new Bicycle("Forward Sport", 35, true);
        Bicycle b2 = new Bicycle("Stels Pilot", 25, false);
        Bicycle b3 = new Bicycle("Giant XTC", 40, true);

        Airplane a1 = new Airplane("Boeing 737", 850, 12000);
        Airplane a2 = new Airplane("Airbus A320", 830, 11800);
        Airplane a3 = new Airplane("Cessna 172", 300, 4000);

        Transport[] transports = {car1, car2, car3, b1, b2, b3, a1, a2, a3};
        for (int i = 0; i < transports.length; i++){
            transports[i].move();
        }
    }
}

class Transport{
    String name;
    int speed;

    public Transport(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
    public Transport(){}

    public void move(){
        System.out.println(name + " движется со скоростью " + speed + " км/ч");
    }
}

class Car extends Transport{
    String fuel_type;
    public Car(String name, int speed, String fuel_type) {
        super(name, speed);
        this.fuel_type=fuel_type;

    }

    public Car() {
    }
    @Override
    public void move(){
        System.out.println("Тип топлива " + name + " " + fuel_type);
    }
}

class Bicycle extends Transport{
    boolean has_gears;

    public Bicycle(String name, int speed, boolean has_gears) {
        super(name, speed);
        this.has_gears=has_gears;

    }

    public Bicycle() {}

    @Override
    public void move(){
        if (has_gears == true){
            System.out.println(name + " есть передачи");
        }else {
            System.out.println(name + " нет передачи");
        }
    }
}

class Airplane extends Transport{
    int altitude;

    public Airplane(String name, int speed, int altitude) {
        super(name, speed);
        this.altitude = altitude;
    }

    public Airplane() {}

    @Override
    public void move(){
        System.out.println(name + " летит на высоте " + altitude + " м");
    }
}
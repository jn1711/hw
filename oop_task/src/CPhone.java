public class CPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.receiveCall("M");
        phone1.getNumber();
        phone1.sendMessage("878787", "13542", "4685");

        Phone phone2 = new Phone();
        phone2.receiveCall("A");
        phone2.getNumber();

        Phone phone3 = new Phone();
        phone3.receiveCall("E");
        phone3.getNumber();
    }
}

class Phone{
    String number;
    String model;
    double weight;

    public Phone(){}
    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone(String number, String model, double weight){
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.println("Звонят: " + name);
    }

    public void receiveCall(String name, String number){
        System.out.println("Звонят: " + name + " " + number);
    }

    public String getNumber(){
        return number;
    }

    public void sendMessage(String ...numbers){
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
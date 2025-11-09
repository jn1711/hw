public class Stuudent {
    public static void main(String[] args){
        Student s1 = new Student("Айдос", "Тұрсынов", "SD1-24A", 4.8);
        Student s2 = new Student("Жанель", "Мұратова", "CS1-23C", 5.0);
        Student s3 = new Student("Руслан", "Ахметов", "WD1-25A", 3.9);

        Aspirant a1 = new Aspirant("Нұрдаулет", "Жамбылов", "AI1-24C", 5.0, "Machine Learning зерттеуі");
        Aspirant a2 = new Aspirant("Айгерім", "Серікқызы", "NET2-24K", 4.5, "Киберқауіпсіздік жобасы");
        Aspirant a3 = new Aspirant("Ерасыл", "Медеубек", "DB1-25B", 4.0, "Жасанды интеллект жүйесі");


        Student [] students = {s1, s2, s3, a1, a2, a3};
        for (int i = 0; i < students.length; i++){
            System.out.println(students[i].getScholarship());
        }
    }
}

class Student{
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Student() {}

    public int getScholarship(){
        if (averageMark == 5){
            int stependia = 2000;
            return stependia;
        }
        else {
            int stependia = 1900;
            return stependia;
        }
    }
}
class Aspirant extends Student{
    String scienceWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }

    public Aspirant() {}

    @Override
    public int getScholarship(){
        if (averageMark == 5){
            int stependia = 2500;
            return stependia;
        }
        else {
            int stependia = 2200;
            return stependia;
        }
    }
}
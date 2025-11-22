import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sulifa {
    public static void main(String[] args) {
        int qagaz = 1;
        int quduq = 2;
        int qaishy = 3;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("СУ ЛИ ФА ойынына қош келдіңіз!\nОйын 5 раундтан тұрады😊\nОйынды бастаймызба?\n1.Иә\n2.Жоқ");
        int bastau = sc.nextInt();
        if (bastau == 1) {
            System.out.println("Ойын басталды!");
            String [] oiyn = new String[5];
            int count_adam = 0;
            int count_bot = 0;
            for (int i=0; i<5; i++){
                int bot = rd.nextInt(1,4);
                System.out.println("Ойнау үшін таңдаңыз\n1.Қағаз\n2.Құдық\n3.Қайшы");
                int adam = sc.nextInt();
                if (adam == bot) {
                    System.out.println("Тең ойын, тағы байқап көріңіз");
                    oiyn[i] = "Тең ойын";
                }else if (adam == 1 && bot == 2) {
                    count_adam++;
                    System.out.println("Сіз ұттыңыз! Счет: " + count_adam + ":" + count_bot);
                    oiyn[i] = "Сіздің жеңісіңіз!";
                }else if (adam == 1 && bot == 3) {
                    count_bot++;
                    System.out.println ("Сіз жеңілдіңіз :( Счет: " + count_adam + ":" + count_bot);
                    oiyn[i]="Боттың жеңісі";
                }else if (adam==2 && bot == 1) {
                    count_bot++;
                    System.out.println("Сіз жеңілдіңіз :( Счет: " + count_adam + ":" + count_bot);
                    oiyn[i]="Боттың жеңісі";
                }else if (adam == 2 && bot == 3) {
                    count_adam++;
                    System.out.println("Сіз ұттыңыз! Счет: " + count_adam + ":" + count_bot);
                    oiyn[i] = "Сіздің жеңісіңіз!";
                }else if (adam == 3 && bot == 1) {
                    count_adam++;
                    System.out.println("Сіз ұттыңыз! Счет: " + count_adam + ":" + count_bot);
                    oiyn[i] = "Сіздің жеңісіңіз!";
                }else if (adam == 3 && bot == 2) {
                    count_bot++;
                    System.out.println("Сіз жеңілдіңіз :( Счет: " + count_adam + ":" + count_bot);
                    oiyn[i]="Боттың жеңісі";
                }else {
                    System.out.println("Қате");
                    oiyn[i] = "Қате";
                }
            }
            System.out.println("Ойын нәтижесі: ");
            for(int i=0; i<oiyn.length; i++){
                System.out.println(oiyn[i]);
            }
            System.out.println("Жалпы счет: " + count_adam + ":" + count_bot);
        } else if (bastau != 1 || bastau != 2) {
            System.out.println("Қате");
        } else return;
    }
}
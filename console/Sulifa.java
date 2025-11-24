import java.util.Random;
import java.util.Scanner;

public class Sulifa {
    public static void main(String[] args) {
        int qagaz = 1;
        int quduq = 2;
        int qaishy = 3;
        int count_adam = 0;
        int count_bot = 0;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("==============================\nСУ ЛИ ФА ойынына қош келдіңіз!\nКанша раунд ойнаймыз?\n==============================");
        int round = sc.nextInt();
        int [] oiyn = new int[round]; //0-утылдын 1-уттын 3-ничья

        System.out.println("------------------------------\n====    Ойын басталды!    ====");
        for (int i=0; i<round; i++){
            int bot = rd.nextInt(1,4);
            System.out.println("------------------------------\n====      " + (i+1) +"-ші раунд      ====\n------------------------------");
            System.out.println("====      Танданыз:      ====\n1-Кағаз\n2-Құдық\n3-Қайшы\n------------------------------");
            int adam = sc.nextInt();
            if (adam < 1 || adam > 3) {
                System.out.println("Қате! 1-3 аралығында мән енгізіңіз.");
                i--;
                continue;
            }
            if (adam == bot) {
                System.out.println("------------------------------\nСіздің таңдауыңыз: " + adam + "\nБоттың таңдауы: " + bot + "\nНәтиже: Ничья");
                oiyn[i] = 3;
            }else if (adam == 1 && bot == 2) {
                count_adam++;
                System.out.println("------------------------------\nСіздің таңдауыңыз: " + adam + "\nБоттың таңдауы: " + bot + "\nНәтиже: Сіз ұттыңыз");
                oiyn[i] = 1;
            }else if (adam == 1 && bot == 3) {
                count_bot++;
                System.out.println ("------------------------------\nСіздің таңдауыңыз: " + adam + "\nБоттың таңдауы: " + bot + "\nНәтиже: Бот ұтты");
                oiyn[i]=0;
            }else if (adam==2 && bot == 1) {
                count_bot++;
                System.out.println("------------------------------\nСіздің таңдауыңыз: " + adam + "\nБоттың таңдауы: " + bot + "\nНәтиже: Бот ұтты");
                oiyn[i]=0;
            }else if (adam == 2 && bot == 3) {
                count_adam++;
                System.out.println("------------------------------\nСіздің таңдауыңыз: " + adam + "\nБоттың таңдауы: " + bot + "\nНәтиже: Сіз ұттыңыз");
                oiyn[i] = 1;
            }else if (adam == 3 && bot == 1) {
                count_adam++;
                System.out.println("------------------------------\nСіздің таңдауыңыз: " + adam + "\nБоттың таңдауы: " + bot + "\nНәтиже: Сіз ұттыңыз");
                oiyn[i] = 1;
            }else if (adam == 3 && bot == 2) {
                count_bot++;
                System.out.println("------------------------------\nСіздің таңдауыңыз: " + adam + "\nБоттың таңдауы: " + bot + "\nНәтиже: Бот ұтты");
                oiyn[i]=0;
            }
        }
        System.out.println("------------------------------\n----    Ойын нәтижесі:    ----\n------------------------------");
        for (int i=0; i<round; i++){
            System.out.println("====      " + (i+1) +"-ші раунд      ====");
            if (oiyn[i] == 3){
                System.out.println((i+1)+". Ничья");
            } else if (oiyn[i] == 1) {
                System.out.println((i+1)+". Сіз ұттыңыз");
            } else if (oiyn[i] == 0) {
                System.out.println((i+1)+". Бот ұтты");
            }
        }
        System.out.println("==============================\n====         Cчет         ====\n----     Сіз " + count_adam + "-" + count_bot + " Бот      ----");
        System.out.println("------------------------------");

    }
}

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
            System.out.println("------------------------------\n====      1-шы раунд      ====\n------------------------------");
            System.out.println("====      Танданыз:      ====\n1-Кагаз\n2-Кудык\n3-Кайшы\n------------------------------");
            int adam = sc.nextInt();
            if (adam == bot) {
                System.out.println("Сыздын тандауыныз: " + adam + "\nБоттын тандауы: " + bot + "\nНатиже: Ничья");
                oiyn[i] = 3;
            }else if (adam == 1 && bot == 2) {
                count_adam++;
                System.out.println("Сыздын тандауыныз: " + adam + "\nБоттын тандауы: " + bot + "\nНатиже: Сыз уттыныз");
                oiyn[i] = 1;
            }else if (adam == 1 && bot == 3) {
                count_bot++;
                System.out.println ("Сыздын тандауыныз: " + adam + "\nБоттын тандауы: " + bot + "\nНатиже: Бот утты");
                oiyn[i]=0;
            }else if (adam==2 && bot == 1) {
                count_bot++;
                System.out.println("Сыздын тандауыныз: " + adam + "\nБоттын тандауы: " + bot + "\nНатиже: Бот утты");
                oiyn[i]=0;
            }else if (adam == 2 && bot == 3) {
                count_adam++;
                System.out.println("Сыздын тандауыныз: " + adam + "\nБоттын тандауы: " + bot + "\nНатиже: Сыз уттыныз");
                oiyn[i] = 1;
            }else if (adam == 3 && bot == 1) {
                count_adam++;
                System.out.println("Сыздын тандауыныз: " + adam + "\nБоттын тандауы: " + bot + "\nНатиже: Сыз уттыныз");
                oiyn[i] = 1;
            }else if (adam == 3 && bot == 2) {
                count_bot++;
                System.out.println("Сыздын тандауыныз: " + adam + "\nБоттын тандауы: " + bot + "\nНатиже: Бот утты");
                oiyn[i]=0;
            }else {
                System.out.println("Қате");
                oiyn[i] = -1;
            }
        }
            System.out.println("Ойын нәтижесі: ");
            for(int i=0; i<oiyn.length; i++){
                System.out.println(oiyn[i]);
            }
            System.out.println("Жалпы счет: " + count_adam + ":" + count_bot);
    }
}

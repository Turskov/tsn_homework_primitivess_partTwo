import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите баланс телефона: ");
        int phoneBalance = in.nextInt();
        System.out.print("Введите сумму пополнения баланса: ");
        int cash = in.nextInt();
        in.close();

        int present = 1; // 1 рубль за каждые 100 рублей пополнения


        if (cash % 100 == 0) System.out.println("Ваша итоговая сумма составит: " +
                (phoneBalance + (cash + ((cash * present) / 100))));
        else System.out.println("Ваш итоговый баланс телефона составил: " + (phoneBalance + cash));

    }
}
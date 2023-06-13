public class Main {
    public static void main(String[] args) {
        int phoneBalance = 100; // Баланс телефона
        int cash = 1100; // Сумма пополнения
        int present = 1; // 1 рубль за каждые 100 рублей пополнения

        if (cash >= 1000) {
            System.out.println("Ваша итоговая сумма составит: " + (phoneBalance + cash + (cash * present / 100)) + " руб.");
        } else {
            System.out.println("Ваша итоговая сумма составит: " +
                    (phoneBalance + cash) + "руб.");
        }
    }
}
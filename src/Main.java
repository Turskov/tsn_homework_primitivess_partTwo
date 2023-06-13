public class Main {
    public static void main(String[] args) {
        int phoneBalance = 1000;
        int cash = 100;
        int present = 1; // 1 рубль за каждые 100 рублей пополнения


        System.out.println("Ваша итоговая сумма составит: " +
                (phoneBalance + (cash + ((cash * present) / 100))));


    }
}
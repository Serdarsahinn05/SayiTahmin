import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Tahmin edilen sayıyı girin: " );
        int tahmin = scanner.nextInt();

        int randomNumber = random.nextInt(101);
        System.out.println(randomNumber);

        while(tahmin != randomNumber){
            if(tahmin < 0 || tahmin > 100){
                System.out.println("Sayı 1 ile 100 arasında olmalı1");

            }else if(tahmin < randomNumber){
                System.out.println("Hayır sayı daha büyük olmalı: ");
                tahmin = scanner.nextInt();
            } else {
                System.out.println("Hayır sayı daha küçük olmalı: ");
                tahmin = scanner.nextInt();
            }
        }

    System.out.println("Tebrikler kazandınız.");

    }
}
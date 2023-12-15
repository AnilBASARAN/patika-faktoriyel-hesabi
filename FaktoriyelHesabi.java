import java.util.Scanner;
public class FaktoriyelHesabi {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        // faktoriyelin hesaplanması için 1 den verilen sayıya kadar 1 arttırarak faktor
        // değişkenine hepsinin çarpımının toplamına eşitleyerek çıktı veriyoruz.

        System.out.print("Faktoriyelinin hesaplanması için bir sayı giriniz: ");
        number = input.nextInt();
        int faktor = 1;
        for(int i = 1; i <= number ; i++ ){
            faktor *= i;
        }
        System.out.print(faktor);
    }
}
import java.util.Scanner;
public class FaktoriyelHesabi {
    public static void main(String[] args) {
        int numberN,numberR;
        Scanner input = new Scanner(System.in);

        System.out.println("Kombinasyon N'in R li Kombinasyonları hesabı için: ");

        System.out.print("N sayısını girin:  ");
        numberN = input.nextInt();

        System.out.print("R sayısını girin:  ");
        numberR = input.nextInt();

        // faktorN için

        int faktorN = 1;
        for(int i = 1; i <= numberN ; i++ ){
            faktorN *= i;
        }

        // faktorR için

        int faktorR = 1;
        for(int i = 1; i <= numberR ; i++ ){
            faktorR *= i;
        }

        // faktorNR için

        int faktorNR = 1;
        for(int i = 1; i <= (numberN-numberR) ; i++ ){
            faktorNR *= i;
        }
        double result = faktorN/(faktorR*faktorNR);
        System.out.print("C(n,r) " + numberN +"'in  " + numberR + "'li kombinasyonu :  ");
        System.out.println((int)result);
    }
}
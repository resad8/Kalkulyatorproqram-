import java.util.Scanner;

public class Kalkulyator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (true) 
        {
            System.out.println("Zehmet olmasa ededeceyiniz emeli secin(bitirmek ucun 0 secin)");
            System.out.println("1 - Toplama");
            System.out.println("2 - Cixma");
            System.out.println("3 - Vurma");
            System.out.println("4 - Bolme");

            int secim = scan.nextInt();
            if(secim == 1)
            {
                long a = scan.nextLong();
                long b = scan.nextLong();
                System.out.println("Cavab :" + (a + b));
            }
            else if(secim == 2)
            {
                long a = scan.nextLong();
                long b = scan.nextLong();
                System.out.println("Cavab :" + (a - b));
            }
            else if(secim == 3)
            {
                long a = scan.nextLong();
                long b = scan.nextLong();
                System.out.println("Cavab :" + (a * b));
            }
            else if(secim == 4)
            {
                long a = scan.nextLong();
                long b = scan.nextLong();
                System.out.println("Cavab :" + (a / b));
            }
            else if(secim == 0)
            {
                System.out.println("Proqramdan cixilir...");
                break;
            }
            else{
                System.out.println("Bele bir emel yoxdur!");
            }
            }

    }
    
}
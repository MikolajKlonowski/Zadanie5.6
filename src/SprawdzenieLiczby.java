import java.util.Scanner;

public class SprawdzenieLiczby {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj Liczbe:");
        int a = sc.nextInt();
        while (a < 100 || a > 200 || a % 3 != 0) {

            if (a > 100 && a < 200 && a % 3 == 0) {
                System.out.println("Podana liczba jest ok");
            } else if (a >= 100 && a <= 200 && a % 3 != 0) {
                System.out.println("Podana liczba nie jest podzielna przez 3");


            } else if (a < 100) {
                System.out.println("Podana liczba jest za mała");

            } else if (a > 200) {
                System.out.println("Podana liczba jest za duża");
            }


            System.out.println("Podaj Liczbe:");
             a = sc.nextInt();
        }
    }
}







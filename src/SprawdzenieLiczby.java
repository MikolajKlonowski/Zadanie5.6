import java.util.Scanner;

public class SprawdzenieLiczby {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj Liczbe:");
        int a = sc.nextInt();
        if (a > 100 && a < 200 && a % 3 == 0) {
            System.out.println("Podana liczba jest ok");


        } else if (a >= 100 && a <= 200 && a % 3 != 0) {
            System.out.println("Podana liczba nie jest podzielna przez 3");
            while (a >= 100 && a <= 200 && a % 3 != 0){
                System.out.println("Podaj liczbe:");
                a = sc.nextInt();}


        } else if (a < 100) {
            System.out.println("Podana liczba jest za mała");
            while (a<100){
                System.out.println("Podaj liczbe:");
                a = sc.nextInt();}

        } else if (a > 200) System.out.println("Podana liczba jest za duża");
        while (a>=200){
            System.out.println("Podaj liczbe:");
            a = sc.nextInt();}
    }

}


//        do {
//            System.out.println("Podaj Liczbe:");
//             a = sc.nextInt();
//            if (a > 100 && a < 200 && a % 3 == 0) {
//                System.out.println("Podana liczba jest ok");
//                break;
//
//
//            } else if (a >= 100 && a <= 200 && a % 3 != 0) {
//                System.out.println("Podana liczba nie jest podzielna przez 3");
//
//            } else if (a < 100) {
//                System.out.println("Podana liczba jest za mała");
//
//            } else if (a > 200) System.out.println("Podana liczba jest za duża");
//        }

//
//    }
//
//
//}


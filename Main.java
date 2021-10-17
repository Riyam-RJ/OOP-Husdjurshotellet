package Animal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Hund sixten = new Hund(5000,"Sixten","hund",100);
        Hund dogge = new Hund(10000,"Dogge","hund",100);
        Katt venus = new Katt(5000,"Venus","katt",150);
        Katt ove = new Katt(3000,"Ove","Katt",150);
        Orm hypno = new Orm(1000,"Hypno","orm");

        System.out.println("Vilket djur av listan ska få mat?");
        System.out.println("1. Sixten");
        System.out.println("2. Dogge");
        System.out.println("3. Venus");
        System.out.println("4. Ove");
        System.out.println("5. Hypno");
        System.out.println("Ange en siffra mellan 1 till 5");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        switch (val) {
            case 1:
                System.out.println(sixten);
                break;
            case 2:
                System.out.println(dogge);
                break;
            case 3:
                System.out.println(venus);
                break;
            case 4:
                System.out.println(ove);
                break;
            case 5:
                System.out.println(hypno);
                break;
            default:
                System.out.println("Snälla skriv ett nummer mellan 1 till 5");
        }
    }
}


package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Work {


    public static void main(String[] args) {


        Scanner input = new Scanner (System.in);

        System.out.println("Adınızı ve SoyAdınızı giriniz");

        String adrs = input.nextLine();

        System.out.println("Adresinizi giriniz 'NO SUZ ŞEKİLDE'");

        String adrs2 = input.nextLine();

        System.out.println("OTURDUGUNUZ BİNANIN NO SU");

        int no = input.nextInt();
    }
}

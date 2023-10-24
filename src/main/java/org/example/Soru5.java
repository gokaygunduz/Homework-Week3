package org.example;
import java.util.Scanner;
public class Soru5 {
            public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);
            System.out.println("bir sayi giriniz");
            int sayi = kb.nextInt();
            boolean isPrimeXsayi = isPrimeX(sayi);
            System.out.println(isPrimeXsayi);
        }

        public static boolean isPrimeX(int num) {
            int toplam = num;
            while (toplam >= 10) {
                if (!isPrime(toplam)) {
                    return false;
                }
                int sum = calculateDigitSum(toplam);
                toplam = sum;
            }
            return isPrime(toplam);
        }

        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static int calculateDigitSum(int num) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            return sum;
        }



}

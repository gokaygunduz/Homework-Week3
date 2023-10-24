package org.example;

public class Soru4 { // programdan beklediğim sonuç 113  137 173 179 197 317 337 379 719 programdan aldığım 337 çıktı ?
    public static void main(String[] args) { // isPrime metodu ile sayının asal olup olmadığını denteler.
            for (int abc = 100; abc <= 999; abc++) {
                int cba = Integer.parseInt(new StringBuilder(String.valueOf(abc)).reverse().toString()); //cba sayısı abc sayısının tersidir.
                if (cba > abc && isPrime(abc) && isPrime(cba) && isPrime(abc / 100) && isPrime(abc % 100 / 10) && isPrime(abc % 10) && isPrime(cba / 100) && isPrime(cba % 100 / 10)
               && isPrime(cba % 10 ) ) {
                    System.out.println(abc);
                }
            }
            for (int bc= 10; bc<=99; bc++) {
                int cb = Integer.parseInt(new StringBuilder(String.valueOf(bc)).reverse().toString()); // cb sayısı bc sayısının tersi olarak al.
                boolean b = isPrime(bc) && isPrime(cb) && isPrime(bc % 100 / 10) && isPrime(bc % 10) && isPrime(cb % 100 / 10) && isPrime(cb % 10);
            }
        }

        public static boolean isPrime(int num) {
            if (num < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }


}

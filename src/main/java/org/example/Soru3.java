package org.example;

import javax.swing.JOptionPane;
import java.util.Random;

public class Soru3 {
    public static void main(String args[]){
        Random rastgele = new Random();
        int rastgelesayi = rastgele.nextInt(100) + 1;
        try {
            int tahmin = Integer.parseInt(JOptionPane.showInputDialog(null, "Bir sayı tahmin edin (1-100 arası):"));

            while (tahmin != rastgelesayi) { //tahmin rastgele sayıya eşit olana kadar çalıştır
                if (tahmin < rastgelesayi) {
                    tahmin = Integer.parseInt(JOptionPane.showInputDialog(null, "Daha yüksek bir sayı tahmin edin:"));
                } else {
                    tahmin = Integer.parseInt(JOptionPane.showInputDialog(null, "Daha düşük bir sayı tahmin edin:"));
                }
            }

            JOptionPane.showMessageDialog(null, "Tebrikler! Doğru tahmin ettiniz. Sayı: " + rastgelesayi);
        } catch (NumberFormatException e) { // sayı dısında herhangi bir komut girildiğinde
            JOptionPane.showMessageDialog(null, "Geçersiz giriş, lütfen sayı giriniz.");
        }
    }

}


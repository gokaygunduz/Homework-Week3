package org.example;


public class Soru2 { // zarın rastgele 2 sayı atması
    public static void Main(String args[]) {
       // Math random komutu 0 ile 1 arası rastegele sayı üretir.
        for(int i=1;i<=2;i++); // i atılan zar sayısı
        int zar = ((int) Math.random() * 6) + 1;
        {
            System.out.println(zar);
            if(zar==1)
            {
                System.out.println(".");
            }
            if(zar==2)
            {
                System.out.println("..");
            }
            if(zar==3)
            {
                System.out.println(". \n . \n  .");
            }
            if(zar==4)
            {
                System.out.println(". .\n. .");
            }
            if(zar==5)
            {
                System.out.println(". .\n .\n. .");
            }
            if(zar==6)
            {
                System.out.println(". . .\n. . .");
            }
        }



        }

    }


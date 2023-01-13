package proje5;

import java.util.Scanner;

public class Proje5 {


    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir string giriniz: ");
        String str;
        int sayac,i;
        char c,ch;
        str = scan.nextLine();
//        int upperCase = 0, lowerCase = 0, digit = 0;
        
        int n = str.length();
        int [] dizi=new int [100];
        int j=0;
        
        for(c='0'; c<='z'; c++){
            sayac=0;
            for(i=0; i<n; i++){
                ch = str.charAt(i);
                if(ch == c)
                {
                sayac++;
                }
            }
            if(sayac>0){
                dizi[j]=sayac;
                j++;
                System.out.println(c + " = " + sayac);
                System.out.println(c + " = " + sayac);
                //System.out.println();
            }
        }
        float toplam=0;
        for (int k = 0; k < j; k++){
                    //System.out.println(dizi[k]);
                    toplam=dizi[k]+toplam; 
        }
        
        System.out.println("Ortalaması :"+toplam/j);
        
//            if (Character.isDigit(str.charAt(i))){ 
//                digit++;
//            }
//
//            if (Character.isUpperCase(str.charAt(i))){ 
//                upperCase++;
//            }
//
//            if (Character.isLowerCase(str.charAt(i))){ 
//                lowerCase++;
//            }
//        
//        System.out.printf("Büyük Harf Sayısı: " + (upperCase) + "\nKüçük Harf Sayısı: " + (lowerCase) + "\nRakam Sayısı: " + (digit) + " ");
    }
    
}
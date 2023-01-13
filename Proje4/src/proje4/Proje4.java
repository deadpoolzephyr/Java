package proje4;

import java.util.Scanner;

public class Proje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir string giriniz: ");
        String kelime,buf;
        //int upperCase = 0, lowerCase = 0, digit = 0;
        int sayac=0, enBuyuk=0, enKucuk=99999999, bufi;
        
        kelime = scan.nextLine();
        kelime = kelime+"a";
        int l = kelime.length();
        System.out.println("Stringdeki sayılar: ");

        for (int i = 0; i < l; i++) {
            sayac=0;
            if(Character.isDigit(kelime.charAt(i))){
                for(int j=i+1; j<l; j++){
                    if(Character.isDigit(kelime.charAt(j))==false){
                    buf=kelime.substring(i, j);
                        System.out.print(buf+", ");
                        bufi = Integer.valueOf(buf);
                        if(bufi<enKucuk)
                            enKucuk=bufi;
                        if(bufi>enBuyuk)
                            enBuyuk=bufi;
                        
                        sayac=j;
                        break;
                    }
                }
                i=sayac;
            
            
            }
        }
        System.out.println("\nEn Büyük: "+ enBuyuk + "\tEn Küçük: " + enKucuk + "\nToplamları: " + (enBuyuk+enKucuk));
                
                
                
                
//    if (Character.isDigit(input.charAt(i))){ 
//        digit++;
//    }
//            
//    if (Character.isUpperCase(input.charAt(k))){ 
//        upperCase++;
//    }
// 
//    if (Character.isLowerCase(input.charAt(k))){ 
//        lowerCase++;
//    }
    
    
    
        //System.out.printf("Büyük Harf Sayısı: " + (upperCase) + "\nKüçük Harf Sayısı: " + (lowerCase) + "\nRakam Sayısı: " + (digit) + " ");
    }
        
}

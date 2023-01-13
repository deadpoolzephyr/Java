package javaapp01;

import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaApp01 {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
        
        System.out.println("Bir cümle giriniz: ");
        Scanner scan = new Scanner(System.in);
        String cümle=scan.nextLine();
        
        System.out.println("Cümle : "+cümle);
        //char[] metin =  str.toCharArray(); 
        
        String[] sayı = cümle.split(" ");
        
        System.out.println("kelime sayısı: "+sayı.length);
        System.out.println("kelime sayısı: "+sayı[sayı.length-1]);
        
        */
        
        Scanner scan = new Scanner(System.in);
        String cümle=scan.nextLine();
        StringTokenizer tokens = new StringTokenizer(cümle);
        System.out.println("kelime sayısı : "+ tokens.countTokens());
        
        while(tokens.hasMoreTokens()){
        
            System.out.println("\nToken Value is : "
                    +tokens.nextToken());
        
        }
    
    }
    
}

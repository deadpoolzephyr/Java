package proje2;

import java.util.Scanner;

public class Proje2 {

    public static void main(String[] args) {
        
        Scanner x=new Scanner(System.in);
        int n,m=2;
        
        System.out.println("Bir n sayısı giriniz: ");
        n=x.nextInt();
        System.out.println("n sayısının asal çarpanları:");
        
            if(n==1){
                System.out.println("1");
            }
        
        while(n>=m)
        {
            if(n==1){
                System.out.println("1");
            }
            
            if(n%m==0)
            {
                System.out.println(m);
                n/=m;
            }
            else
            {
                m++;
            }
            
        }
                
    }
    
}

package proje1;

import java.util.Scanner;

public class Proje1 {

    public static void main(String[] args) {
        
        Scanner x=new Scanner(System.in);
        int s,n,m;
        
        System.out.println("Seçimini yap: 1-2-3");
        s=x.nextInt();
        
        System.out.println("Bir n sayısı giriniz: ");
        n=x.nextInt();
        
        switch(s)
        {
            case 1:
                int toplam=0;
                for(m=1;m<=n;m++)
                {
                    toplam=toplam+m;
                }
                System.out.println("Toplam:"+toplam);
            
            break;    
            
            case 2:
                int carpim=1;
                for(m=1;m<=n;m++)
                {
                    carpim=carpim*m;
                }
                System.out.println("Carpim: "+carpim);
                
            break;
            
            case 3:
                System.out.println("3'un tam katı olanlar: ");
                for(m=1;m<=n;m++)
                {
                    if(m%3==0)
                    {
                        System.out.println(m);
                    }
                }
            break;
            
            
        }
        
    }
    
}

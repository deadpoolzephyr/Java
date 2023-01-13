package proje7;

import java.util.Scanner;

public class Proje7 {
    
    private String plaka;
    private int tip;
    private int bakiye;
    private int yükle;
    private int km;
    private int ücret;
    

    public void Yapılandırıcı(String Plaka,int Tip){
        this.plaka=Plaka;
        this.tip=Tip;
    
    }
    
    public void BakiyeYükleme(int Bakiye, int Yükle){
        this.bakiye=Bakiye;
        this.yükle=Yükle;
                
    }
    
    public void ParaTahsil(int KM, int Bakiye){
        this.km=KM;
        this.bakiye=Bakiye;
    }
       
    public void bilgi(String Plaka, int Bakiye){
        this.plaka=Plaka;
        this.bakiye=Bakiye;
    }
    
    public void ÜcretGüncelle(int n, int Ücret){
        this.tip=n;
        this.ücret=Ücret;
        if(n==1){
        
            
        }
        else if(n==2){
        
            
        }
        else if(n==3){
        
            
        }
    
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        
        Scanner s = new Scanner(System.in);
       
        
        n=s.nextInt();
        
        
        
    }
    
}

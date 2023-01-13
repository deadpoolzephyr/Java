package araba;

import java.util.ArrayList;

public class Araba {

    private String model;
    private int yıl;
    private int hız; //Maksimum 210 minimum 0 km/h olabilir
    private int numS; //Arabanın kaç defa hızlandığı
    private int numB; //Arabanın kaç defa yavaşladığı
    static int numA=0;
    
    Araba(String mod1, int yıl){
    this.model=mod1;
    this.yıl=yıl;
    this.numS=0;
    this.numB=0;
    this.hız=0;
    numA++;
    }
    
    Araba(String mod1,int hız, int yıl){
    this.model=mod1;
    this.yıl=yıl;
    this.numS=0;
    this.numB=0;
    this.hız=0;
    numA++;
    }
    
    public boolean hizlan(){
        System.out.println(this.model+" "+this.yıl+" - ");
        if(this.hız+5<=210){
        this.hız +=5;
        this.numS++;
            System.out.println("Araba hızlandı");
            System.out.println("Şimdiki Hızı: "+this.hız);
            System.out.println("Hızlanma Sayısı: "+this.numS);
            return true;
            
        }
        else{
            System.out.println("Araba hızlanmadı");
            System.out.println("Şimdiki Hızı: "+this.hız);
            System.out.println("Hızlanma Sayısı: "+this.numS);
            return false;
            
        }
            
    }
            
    public boolean yavaşla(){
        System.out.println(this.model+" "+this.yıl+" - ");
        if(this.hız-5>=0){
        this.hız -=5;
        this.numB++;
            System.out.println("Araba yavaşladı");
            System.out.println("Şimdiki Hızı: "+this.hız);
            System.out.println("Yavaşlama Sayısı: "+this.numB);
            return true;
            
        }
        else{
            System.out.println("Araba yavaşlamadı");
            System.out.println("Şimdiki Hızı: "+this.hız);
            System.out.println("Yavaşma Sayısı: "+this.numB);
            return false;
            
        }
            
    }
            
    public void bilgi(){
        System.out.println("Araba Modeli: "+this.model);
        System.out.println("Araba Yıl: "+this.yıl);
        System.out.println("Son Hızı: "+this.hız);
        System.out.println("Kaç Kere Hızlandı: "+this.numS);
        System.out.println("Kaç Kere Yavaşladı: "+this.numB);   
        
    }
    
    static void adet(){
        System.out.println("Şimdiye dek "+numA+" adet araba üretildi.");
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Araba.adet();
        Araba ar = new Araba("Mercedes",1985);
        Araba ar1 = new Araba("Mercedes",215,1985);
        Araba ar2 = new Araba("Mercedes",1986);
        Araba ar3 = new Araba("Mercedes",102,1986);
        ArrayList<Araba> araba =new ArrayList<Araba>();
        araba.add(ar);
        araba.add(ar1);
        araba.add(ar2);
        araba.add(ar3);
        for (int i = 0; i < araba.size(); i++) {
            if(i%2==0){
                    araba.get(i).yavaşla();
                    araba.get(i).yavaşla();
                    
            }
            else{
                araba.get(i).hizlan();
                araba.get(i).hizlan();
            }
                
        }
        Araba.adet();
        
    }
    
}

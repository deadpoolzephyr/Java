package javaapplication2;

import java.util.ArrayList;

public class rehberislem {    
   static ArrayList<rehber> kayitlar =  new ArrayList<rehber>();       
   static  void ekle (String ad , String soyad, String tel, String email){       
       rehber eklenecek = new rehber();
       rehber liste = new rehber();  
       boolean durum= true;
       if (kayitlar.size()>0) {
           for (int i = 0; i < kayitlar.size(); i++) {
              liste= kayitlar.get(i);
               if (liste.getAd().equals(ad) & liste.getAd().equals(soyad) & liste.getAd().equals(tel) & liste.getAd().equals(email) ) {
                  durum=false;
               }
           }
       } 
       if (durum) {
           eklenecek.setAd(ad);
           eklenecek.setSoyad(soyad);
           eklenecek.setTel(tel);
           eklenecek.setEmail(email);
           if(kayitlar.add(eklenecek)){
               System.out.println("kayıt eklendi");
             }
       }else {
           System.out.println("kayıt zaten mevcut");
       }       
   }
   
   
   static void listele(String ad){
       rehber liste = new rehber();      
       if (kayitlar.size()>0) {
           for (int i = 0; i < kayitlar.size(); i++) {
              liste= kayitlar.get(i);
               if (liste.getAd().equals(ad)) {
                   System.out.println(liste.getAd()+" "+liste.getSoyad()+" "+liste.getTel()+" "+liste.getEmail()); 
               }                             
           }
       }      
       
   }
    static void fulliste(){
       rehber liste = new rehber();     
       if (kayitlar.size()>0) {
           for (int i = 0; i < kayitlar.size(); i++) {
              liste= kayitlar.get(i);                
              System.out.println(liste.getAd()+" "+liste.getSoyad()+" "+liste.getTel()+" "+liste.getEmail());                    
           }
       }      
       
   }
    static void sil(String ad){
           rehber liste = new rehber();      
        if (kayitlar.size()>0) {
            for (int i = 0; i < kayitlar.size(); i++) {
                liste= kayitlar.get(i);
                if (liste.getAd().equals(ad)) {
                    kayitlar.remove(i);
               }                             
           }
       }
        
    }

}

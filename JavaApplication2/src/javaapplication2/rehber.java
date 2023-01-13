package javaapplication2;

    import java.util.Scanner;

public class rehber {
    
 
   
    public String ad ;
    public String soyad ;
    public String tel ;
    public String email ;
    public rehber(String ad, String soyad, String tel, String email) {
        this.ad = ad;
        this.soyad = soyad;
        this.tel = tel;
        this.email = email;
    }

    public rehber() {
        
    }
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        //Scanner scan = new Scanner(System.in);  
        //String ad = scan.nextLine();
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        //Scanner scan = new Scanner(System.in);  
        //String soyad = scan.nextLine();
        this.soyad = soyad;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        //Scanner scan = new Scanner(System.in);
        //String tel = scan.nextLine();
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        //Scanner scan = new Scanner(System.in);
        //String email = scan.nextLine();
        this.email = email;
    }

    
 
}

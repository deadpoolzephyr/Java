package proje8;

import proje8.oncalisma.CubeMatter;
import proje8.oncalisma.SphereMatter;



public class Proje8 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        CubeMatter cb = new CubeMatter(1.0,3.0);
        SphereMatter kure = new SphereMatter(3.0,5.0);
        SphereMatter sp = new SphereMatter(1.0,2.0);
        double kutlekup =cb.getDensity()*cb.getVolume();
        double kutlekure =kure.getMass();
        double kutle = sp.getMass();
        System.out.println("Kübün kütlesi:" + kutlekup);
        System.out.println("Kürenin kütlesi:" + kutlekure);
        System.out.println("Kütle: "+ kutle);
 
    
    }
    
}

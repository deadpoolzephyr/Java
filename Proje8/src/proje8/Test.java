package proje8;

import proje8.oncalisma.CubeMatter;
import proje8.oncalisma.SphereMatter;


public class Test {

    public static void main(String[] args) {
        CubeMatter cb=new CubeMatter(1,3);
        System.out.println(cb.getDensity()*cb.getVolume());
        System.out.println(cb.getMass());
        SphereMatter sp=new SphereMatter(1,3);
        System.out.println(sp.getDensity()*sp.getVolume());
        System.out.println(sp.getMass());
    }
    
}

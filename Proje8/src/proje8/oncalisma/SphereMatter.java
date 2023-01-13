package proje8.oncalisma;

public class SphereMatter implements Matter{
    public double density = 1.0;
    public double radius = 1.0;
    @Override
    public double getDensity() {
        return density;
        
    }

    public SphereMatter(double density, double radius) {
        this.density= density;
        this.radius=radius;
    }

    @Override
    public double getVolume() {
        return ((4 * 3.14 * radius * radius * radius)/3);
    }

    @Override
    public double getMass() {
       return (density * ( 4 * 3.14 * radius * radius * radius)/3);
    }        
    
}
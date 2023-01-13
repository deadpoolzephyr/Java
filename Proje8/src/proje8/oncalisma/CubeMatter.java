package proje8.oncalisma;

public class CubeMatter implements Matter {

    public double density = 1.0;
    public double edge = 1.0;

    public CubeMatter(double density, double edge) {
        this.density = density;
        this.edge = edge;
    }

    @Override
    public double getDensity() {
        return density;
    }

    @Override
    public double getVolume() {
        return Math.pow(edge, 3);
    }

    @Override
    public double getMass() {
        return density * edge * edge * edge;
    }

}
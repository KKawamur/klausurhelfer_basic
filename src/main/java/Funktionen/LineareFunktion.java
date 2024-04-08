package Funktionen;

public class LineareFunktion {
    private Polynom m;
    private Polynom b;

    public LineareFunktion(double m, double b){
        this.m = new Polynom(m, 1.0);
        this.b = new Polynom(b,0.0);
    }
    public double getValue(double x){
        return m.getValue(x)+b.getValue(x);
    }
    public String getString(){
        return m.getString()+"x*"+b.getString();
    }
}

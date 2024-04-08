package Funktionen;

public class Polynom {
    private double a;
    private double exp;

    public Polynom(double a, double exp){
        this.a = a;
        if (exp < 0)
            this.exp = 0;
        else
            this.exp = exp;
    }

    public double getValue(double x){
        return a*Math.pow(x,exp);
    }

    public String getString(){
        return a+"*x^"+exp;
    }
}

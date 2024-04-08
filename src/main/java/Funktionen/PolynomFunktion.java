package Funktionen;

import java.util.concurrent.ThreadLocalRandom;

public class PolynomFunktion {
    private int grad;
    private double scope = 10.0;
    private Polynom[] polynome;

    public PolynomFunktion(int grad, int scope){
        this.grad = grad;
        this.scope = scope;
        polynome = new Polynom[grad+1];
        for (int i = 0; i <= grad+1;i++){
            polynome[grad+1-i] = new Polynom(ThreadLocalRandom.current().nextDouble(-scope,scope),(double) grad-i );
        }
    }
}

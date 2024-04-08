package Panels.Graphen.RightPanel;

import Funktionen.PolynomFunktion;

import javax.swing.*;
import java.awt.*;

public class RightPanel extends JPanel {
    private int funktionViewCount = 2;
    private boolean isfunktionViewEmpty = true;
    public RightPanel() {
        setLayout(new GridLayout(funktionViewCount,1));
    }
    public void addFunktion(PolynomFunktion polynomFunktion){
        FunktionView funktionView = new FunktionView(polynomFunktion, isfunktionViewEmpty);
        isfunktionViewEmpty = false;
        this.add(funktionView);
    }
}

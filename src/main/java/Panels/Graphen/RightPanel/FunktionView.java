package Panels.Graphen.RightPanel;

import FunktionHandler.ButtonHandler;
import Funktionen.Polynom;
import Funktionen.PolynomFunktion;

import javax.swing.*;
import java.awt.*;

public class FunktionView extends JPanel {
    private JLabel funktionsName;
    ButtonHandler buttonHandler;

    public FunktionView(PolynomFunktion funktion, boolean first){
        setLayout(new FlowLayout());
        if (first){
            funktionsName = new JLabel("f(x)=");
            this.add(funktionsName);
        }
        else {
            funktionsName = new JLabel("g(x)=");
            this.add(funktionsName);
        }
        for (int i = funktion.getGrad(); i >= 0; i--) {
            Polynom iPolynom = funktion.getPolynome(i);
            if (iPolynom.getA() == 0) continue;

            JPanel polynomPanel = new JPanel();

            JTextField a = new JTextField(Double.toString(iPolynom.getA()));
            polynomPanel.add(a);

            switch (Double.toString(iPolynom.getExp())){
                case "0": {break;}
                case "1": {
                    JLabel x = new JLabel("x");
                    polynomPanel.add(x);
                }
                default: {
                    JLabel x = new JLabel("x^");
                    polynomPanel.add(x);
                    JTextField exp = new JTextField(Double.toString(iPolynom.getExp()));
                    polynomPanel.add(exp);
                }
            }

            if (i > 0){
                if (funktion.getPolynome(i-1).getA() > 0) {
                    JLabel plusSign = new JLabel("+");
                    polynomPanel.add(plusSign);
                }
            }
            this.add(polynomPanel);
        }
    }
}

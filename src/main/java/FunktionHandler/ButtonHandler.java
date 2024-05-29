package FunktionHandler;

import Funktionen.PolynomFactory;
import Funktionen.PolynomFunktion;
import Panels.Graphen.LeftPanel.LeftPanel;
import Panels.Graphen.MidPanel.MidPanel;
import Panels.Graphen.RightPanel.RightPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {
    LeftPanel leftPanel;
    MidPanel midPanel;
    RightPanel rightPanel;
    PolynomFactory polynomFactory = new PolynomFactory();

    public void setLeftPanel(LeftPanel leftPanel) {
        this.leftPanel = leftPanel;
    }

    public void setMidPanel(MidPanel midPanel) {
        this.midPanel = midPanel;
    }

    public void setRightPanel(RightPanel rightPanel) {
        this.rightPanel = rightPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "AddFunktion": {
                int funktionstyp = leftPanel.getFunktionsTyp();
                PolynomFunktion polynomFunktion = polynomFactory.makePolynomFunktion(funktionstyp);
                rightPanel.addFunktion(polynomFunktion);
                midPanel.getMidPanelCanvas().addToPolynomList(polynomFunktion);
                midPanel.getMidPanelCanvas().repaint();
                System.out.println(polynomFunktion.getString());
                break;
            }
            default: {}
        }
    }
}

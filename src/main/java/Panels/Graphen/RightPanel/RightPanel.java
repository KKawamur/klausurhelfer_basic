package Panels.Graphen.RightPanel;

import FunktionHandler.ButtonHandler;
import FunktionHandler.Panel;
import Funktionen.PolynomFunktion;

import javax.swing.*;
import java.awt.*;

public class RightPanel extends JPanel {
    Panel leftPanel, midPanel;
//    ButtonListener buttonListener = new ButtonListener();
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
    ButtonHandler buttonHandler;

//    class ButtonListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            switch (e.getActionCommand()) {
//                default: leftPanel.retrievedAction(e);
//            }
//        }
//    }

//    @Override
//    public void retrievedAction(ActionEvent action) {
//        buttonListener.actionPerformed(action);
//    }
//
//    public void setLeftPanel(Panel leftPanel) {
//        this.leftPanel = leftPanel;
//    }
//
//    public void setMidPanel(Panel midPanel) {
//        this.midPanel = midPanel;
//    }

    public void setButtonHandler(ButtonHandler buttonHandler) {
        this.buttonHandler = buttonHandler;
    }
}

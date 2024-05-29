package Panels.Graphen.LeftPanel;

import FunktionHandler.ButtonHandler;

import javax.swing.*;
import java.awt.*;

public class LeftPanel extends JPanel {
    JList funktionsTypMenu;
    JButton addButton;
    String[] funktionsTypen = {
            "Lineare Funktion",
            "Quadratische Funktion",
            "Exponantialfunktion",
            "Ganzrationale Funktion"
    };
    ButtonHandler buttonHandler;
//    Panel midPanel, rightPanel;
//    ButtonListener buttonListener = new ButtonListener();
//
//
//    private class ButtonListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            switch (e.getActionCommand()){
//                default: midPanel.retrievedAction(e);
//            }
//        }
//    }

    public LeftPanel(){
//        FlowLayout overlayLayout = new FlowLayout();
        setLayout(new FlowLayout());
        funktionsTypMenu = new JList(funktionsTypen);
        addButton = new JButton("+");
        addButton.setActionCommand("AddFunktion");
//        addButton.addActionListener(buttonListener);
        this.add(funktionsTypMenu);
        this.add(addButton);
    }

//    public void setMidPanel(Panel midPanel) {
//        this.midPanel = midPanel;
//    }
//
//    public void setRightPanel (Panel rightPanel) {
//        this.rightPanel = rightPanel;
//    }

    public int getFunktionsTyp() {
        return funktionsTypMenu.getSelectedIndex();
    }

    public void setButtonHandler(ButtonHandler buttonHandler) {
        this.buttonHandler = buttonHandler;
        addButton.addActionListener(buttonHandler);
    }

    //    @Override
//    public void retrievedAction(ActionEvent action) {
//        buttonListener.actionPerformed(action);
//    }
}

package Panels.Graphen.MidPanel;

import FunktionHandler.ButtonHandler;
import FunktionHandler.Panel;
import Panels.Graphen.MidPanel.Canveass.MidPanelCanvas;

import javax.swing.*;

public class MidPanel extends JPanel {
    MidPanelCanvas midPanelCanvas = new MidPanelCanvas();
    Panel leftPanel, rightPanel;

    public MidPanel(){
        OverlayLayout overlayLayout = new OverlayLayout(this);
        setLayout(overlayLayout);
        this.add(midPanelCanvas);
    }
    ButtonHandler buttonHandler;

//    private class ButtonListener implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            switch (e.getActionCommand()) {
//                default: rightPanel.retrievedAction(e);
//            }
//        }
//    }

//    @Override
//    public void retrievedAction(ActionEvent action) {
//
//    }

//    public void setLeftPanel(Panel leftPanel) {
//        this.leftPanel = leftPanel;
//    }
//
//    public void setRightPanel(Panel rightPanel) {
//        this.rightPanel = rightPanel;
//    }
    public void setButtonHandler(ButtonHandler buttonHandler) {
        this.buttonHandler = buttonHandler;
    }
}

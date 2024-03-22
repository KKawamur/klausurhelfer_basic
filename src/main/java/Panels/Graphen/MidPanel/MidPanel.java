package Panels.Graphen.MidPanel;

import Panels.Graphen.MidPanel.Canveass.MidPanelCanvas;

import javax.swing.*;

public class MidPanel extends JPanel {
    MidPanelCanvas midPanelCanvas = new MidPanelCanvas();

    public MidPanel(){
        OverlayLayout overlayLayout = new OverlayLayout(this);
        setLayout(overlayLayout);
        this.add(midPanelCanvas);
    }
}

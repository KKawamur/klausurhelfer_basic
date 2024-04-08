package Panels.Graphen.LeftPanel;

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

    public LeftPanel(){
//        FlowLayout overlayLayout = new FlowLayout();
        setLayout(new FlowLayout());
        funktionsTypMenu = new JList(funktionsTypen);
        addButton = new JButton("+");
        this.add(funktionsTypMenu);
        this.add(addButton);
    }
}

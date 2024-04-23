package MainWindow;

import FunktionHandler.ButtonHandler;
import Panels.Graphen.LeftPanel.LeftPanel;
import Panels.Graphen.MidPanel.MidPanel;
import Panels.Graphen.RightPanel.RightPanel;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    LeftPanel leftPanel;
    MidPanel midPanel;
    RightPanel rightPanel;

//    class ComboBoxListener implements ActionListener{
//        public void actionPerformed(ActionEvent e) {
//            System.out.println(funktionsTypMenu.getSelectedItem().toString());
//            switch (funktionsTypMenu.getSelectedItem().toString()){
//                case "Funktionstyp auswählen":{
//                    break;
//                }
//                case "Lineare Funktion":{
//                    remove(midPanel);
//                    midPanel = new MidPanel();
//                    add(midPanel);
//                    setSize(1280,720);
//                    break;
//                }
//                case "Quadratische Funktion":{
//                    break;
//                }
//                case "Exponantialfunktion":{
//                    break;
//                }
//                case "Ganzrationale Funktion":{
//                    break;
//                }
//                default:{
//                    break;
//                }
//            }
//        }
//    }
//
    MainWindow(){

//        ComboBoxListener funktionsMenuListener = new ComboBoxListener();
//        funktionsTypMenu.addActionListener(funktionsMenuListener);

        setLayout(new FlowLayout());
        leftPanel = new LeftPanel();
        midPanel = new MidPanel();
        rightPanel = new RightPanel();

        ButtonHandler buttonHandler = new ButtonHandler();
        leftPanel.setButtonHandler(buttonHandler);
        midPanel.setButtonHandler(buttonHandler);
        rightPanel.setButtonHandler(buttonHandler);

        buttonHandler.setLeftPanel(leftPanel);
        buttonHandler.setMidPanel(midPanel);
        buttonHandler.setRightPanel(rightPanel);


        add(leftPanel);
        add(midPanel);
        add(rightPanel);


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setTitle("Klausurhelfer");
        pack();
        setPreferredSize(new Dimension(1280,720));
        setVisible(true);
    }

    public static void main(String[]args){
        MainWindow window = new MainWindow();
    }

}

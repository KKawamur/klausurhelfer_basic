package MainWindow;

import Panels.Graphen.LeftPanel.LeftPanel;
import Panels.Graphen.MidPanel.MidPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    JPanel leftPanel, midPanel, rightPanel;


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
        rightPanel = new JPanel(new FlowLayout());
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

package Panels.Graphen;

import PanelInterfaces.MidPanel;

import javax.swing.*;
import java.awt.*;

public class LineareFunktionenMidPanel extends JPanel {
    LineareFunktionenMidCanvas canvas = new LineareFunktionenMidCanvas();

    public LineareFunktionenMidPanel(){
        this.add(canvas);
    }



    class LineareFunktionenMidCanvas extends Canvas{
        int scale;
        public LineareFunktionenMidCanvas(int scale){
            this.scale = scale;
            this.setBackground(Color.BLACK);
            this.setForeground(Color.white);
            this.setSize(720,720);
        }

        public LineareFunktionenMidCanvas(){
            this(10);
        }
        public void paint(Graphics g){
            int halfWindowHeigt = this.getHeight()/2;
            g.translate(halfWindowHeigt,halfWindowHeigt);
            g.drawLine(0,-halfWindowHeigt,0,halfWindowHeigt);
            g.drawLine(-halfWindowHeigt,0,halfWindowHeigt,0);
            for (int i = 0; i < halfWindowHeigt; i+=halfWindowHeigt/(scale)+1){
                g.drawLine(i,0,i,halfWindowHeigt/40);
                g.drawLine(0,-i,-halfWindowHeigt/40,-i);
                g.drawLine(-i,0,-i,halfWindowHeigt/40);
                g.drawLine(0,i,-halfWindowHeigt/40,i);
                if (i == (scale/2)*(halfWindowHeigt/(scale)+1))
                    g.drawString(""+(double)scale/2,i,halfWindowHeigt/40);
            }
        }
    }
}

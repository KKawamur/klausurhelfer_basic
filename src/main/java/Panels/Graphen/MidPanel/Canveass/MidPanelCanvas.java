package Panels.Graphen.MidPanel.Canveass;

import java.awt.*;

public class MidPanelCanvas extends Canvas {
    int scale;
    public MidPanelCanvas(int scale){
        this.scale = scale;
        this.setBackground(Color.BLACK);
        this.setForeground(Color.white);
        this.setSize(700,700);
    }

    public MidPanelCanvas(){
        this(10);
    }
    public void paint(Graphics g){
        int halfWindowHeigt = this.getHeight()/2;
        g.translate(halfWindowHeigt,halfWindowHeigt);
        g.drawLine(0,-halfWindowHeigt,0,halfWindowHeigt);
        g.drawLine(-halfWindowHeigt,0,halfWindowHeigt,0);
        for (int i = 0; i < halfWindowHeigt; i+=halfWindowHeigt/(scale+1)){
            g.drawLine(i,0,i,halfWindowHeigt/40);
            g.drawLine(0,-i,-halfWindowHeigt/40,-i);
            g.drawLine(-i,0,-i,halfWindowHeigt/40);
            g.drawLine(0,i,-halfWindowHeigt/40,i);
            if (i == (scale/2)*(halfWindowHeigt/(scale+1))) {
                g.drawString("" + (double) scale / 2, i - halfWindowHeigt / 40, halfWindowHeigt / 20);
                g.drawString("" + (double) scale / 2,-halfWindowHeigt/10,-i);
                g.drawString("-"+(double) scale/2, -i - halfWindowHeigt/40,halfWindowHeigt / 20);
                g.drawString("-" + (double) scale / 2,-halfWindowHeigt/10,i);
            }
            if (i == (scale)*(halfWindowHeigt/(scale+1))) {
                g.drawString("" + (double) scale, i - halfWindowHeigt / 40, halfWindowHeigt / 20);
                g.drawString("" + (double) scale,-halfWindowHeigt/10,-i);
                g.drawString("-"+(double) scale, -i - halfWindowHeigt/40,halfWindowHeigt / 20);
                g.drawString("-" + (double) scale,-halfWindowHeigt/10,i);
            }
        }
    }

    public void paintLinearGraph(){

    }
}

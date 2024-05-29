package Panels.Graphen.MidPanel.Canveass;

import Funktionen.PolynomFunktion;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MidPanelCanvas extends Canvas {
    int scale;
    int coordinateLineLengthFactor = 40;
    int numberOfCoordinateIndices = 2;
    private List<PolynomFunktion> polynomFunktionList = new ArrayList<>();
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
        int halfWindowHeight = this.getHeight()/2;
        g.translate(halfWindowHeight,halfWindowHeight);

        drawCartesianAxis(g, halfWindowHeight);
        drawCoordinateLines(g,halfWindowHeight,coordinateLineLengthFactor);
        drawCoordinateIndices(g,halfWindowHeight,coordinateLineLengthFactor,numberOfCoordinateIndices);

        int xPos, yPos, xNextPos, yNextPos;
        for (PolynomFunktion polynomFunktion: polynomFunktionList){
            g.setColor(new Color(ThreadLocalRandom.current().nextInt(0,256),
                    ThreadLocalRandom.current().nextInt(0,256),
                    ThreadLocalRandom.current().nextInt(0,256)));

            for (double x = -halfWindowHeight; x < halfWindowHeight; x += (double) 1/this.getHeight()){
                xPos = (int) (x*halfWindowHeight/(scale));
                yPos = (int) (-polynomFunktion.getValue(x)*halfWindowHeight/(scale));

                xNextPos = (int) ((x+1/this.getHeight())*halfWindowHeight/(scale));
                yNextPos = (int) (-polynomFunktion.getValue(x+ (double) 1/this.getHeight())*halfWindowHeight/(scale));

                g.drawLine(xPos,yPos,xNextPos,yNextPos);
            }
        }
    }

    private void drawCartesianAxis(Graphics g, int halfWindowHeight){
        g.drawLine(0,-halfWindowHeight,0,halfWindowHeight);
        g.drawLine(-halfWindowHeight,0,halfWindowHeight,0);
    }

    private void drawCoordinateLines(Graphics g, int halfWindowHeight, int coordinateLineLengthFactor){
        int coordinateLineLength = halfWindowHeight/coordinateLineLengthFactor;
        for (int i = 0; i < halfWindowHeight; i+=halfWindowHeight/(scale)){
            g.drawLine(i,   0,           i,            coordinateLineLength);
            g.drawLine(0,   -i, -coordinateLineLength,      -i);
            g.drawLine(-i,  0,          -i,             coordinateLineLength);
            g.drawLine(0,   i,  -coordinateLineLength,      i);
        }
    }

    private void drawCoordinateIndices(Graphics g, int halfWindowHeight, int coordinateLineLengthFactor, int numberOfCoordinateIndices){
        int xAxisCoordinateIndent = halfWindowHeight/coordinateLineLengthFactor;
        int distanceToXAxis = xAxisCoordinateIndent*2;
        int distanceToYAxis = xAxisCoordinateIndent*4;

        int j = numberOfCoordinateIndices;

        for (int i = 0; i < halfWindowHeight; i+=halfWindowHeight/(scale)) {
            if (i == (scale / j) * (halfWindowHeight / (scale))) {
                //positive x axis
                g.drawString("" + (double) scale / j, i - xAxisCoordinateIndent, distanceToXAxis);
                //positive y axis
                g.drawString("" + (double) scale / j, -distanceToYAxis, -i);
                //negative x axis
                g.drawString("-" + (double) scale / j, -i - xAxisCoordinateIndent, distanceToXAxis);
                //negative y axis
                g.drawString("-" + (double) scale / j, -distanceToYAxis, i);

                j--;
            }
        }
    }

    public List<PolynomFunktion> getPolynomFunktionList() {
        return polynomFunktionList;
    }
    public void addToPolynomList(PolynomFunktion polynomFunktion){
        polynomFunktionList.add(polynomFunktion);
    }
}

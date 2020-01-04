package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.util.Observable;
import java.util.Observer;

public class MyScroll extends JScrollBar implements Observer{
    private Cube cube;
    private Viewer panel;
    private static int c = 0;
    private int q;
    int ux = 0;
    int uy = 0;

    public MyScroll(int orint, int value, int min, int max, Cube cube, Viewer panel){
        this.setOrientation(orint);
        this.setValue(value);
        this.setMinimum(min);
        this.setMaximum(max);

        c++;
        q = c;

        if (q == 1){
            MyScrollListener listener = new MyScrollListener();
            this.addAdjustmentListener(listener);
        }
        if (q == 2){
            MyScrollListener1 listener1 = new MyScrollListener1();
            this.addAdjustmentListener(listener1);
        }
        this.cube = cube;
        this.panel = panel;
    }

//    public int getq(){return this.q;}

    @Override
    public void update(Observable o, Object arg) {
//        cube = (Cube) o;
//        panel.setux(ux);
//        panel.repaint();
    }

    private class MyScrollListener implements AdjustmentListener {
        public void adjustmentValueChanged(AdjustmentEvent e){
            ux = e.getValue();
            panel.setux(ux);
            panel.setVisible(false);
            panel.updateUI();
            panel.setVisible(true);
        }
    }

    private class MyScrollListener1 implements AdjustmentListener {
        public void adjustmentValueChanged(AdjustmentEvent e){
            uy = e.getValue();
            panel.setuy(uy);
            panel.setVisible(false);
            panel.updateUI();
            panel.setVisible(true);
        }
    }
//    public int getValue(){return getValue();}
}


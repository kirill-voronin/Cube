package com.company;

import javax.swing.*;
import java.awt.*;

public class Viewer extends JFrame {
    private Cube c;
    public Viewer(){
        this.setSize(1240,1240);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public Viewer(Cube c){
        this();
        this.c = c;

    }

    public void paint(Graphics g){
//        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D)g;
        g.translate(getWidth()/2,getHeight()/2);
        g.drawLine(0,-getHeight(),0,getHeight());
        g.drawLine(-getWidth(),0,getWidth(),0);
        //c.draw(g2d);
        c.perpdraw(g2d);
    }
}

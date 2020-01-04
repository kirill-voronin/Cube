package com.company;

import javax.swing.*;
import java.awt.*;

public class Viewer extends JPanel {
    private Cube cube;
    private int ux = 0;
    private int uy = 0;
    private int uz = 0;
    private int kof = 0;
    private MyButton button;
    public Viewer(){

    }

    public Viewer(Cube c){
        this();
        this.cube = cube;

    }

    public void setux(int ux){this.ux = ux;}

    public void setuy(int uy){this.uy = uy;}

    public void setKof(int kof){this.kof = kof;}


    public void paint(Graphics g){
//        super.paintComponents(g);

        Graphics2D g2d = (Graphics2D)g;
        g.translate(getWidth()/2,getHeight()/2);
        g.drawLine(0,-getHeight(),0,getHeight());
        g.drawLine(-getWidth(),0,getWidth(),0);
        Cube c = new Cube();
        cube = c;
        c.scaleCube(300);
        c.translateCube(-150,-150,-150);
        c.rotateCube(ux,uy,uz);
        if(this.kof == 1)
            c.draw(g2d);
        else if (this.kof == 2)
            c.perpdraw(g2d);

    }


}

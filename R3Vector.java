package com.company;

// описание радиус вектора
public class R3Vector {
    private double x, y, z;

    public R3Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getZ(){
        return z;
    }

    public void out(){
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }

    public R3Vector sum(R3Vector a){
        return new R3Vector(x + a.x,y + a.y,z + a.z);
    }

    public static R3Vector sum(R3Vector a, R3Vector b){
        return new R3Vector(a.x + b.x, a.y + b.y, a.z + b.z);
    }

    public void scale(double k){
        x *=k;
        y *=k;
        z *=k;
//        System.out.println("(" + x*k + ", " + y*k + ", " + z*k + ")");
    }

    public void translate(double dx, double dy, double dz){
        x += dx;
        y += dy;
        z += dz;

//        System.out.println("(" + (x+dx) + ", " + (y+dy) + ", " + (z+dz) + ")");
    }

    public static R3Vector vectorProduct(R3Vector a, R3Vector b){
//        return new R3Vector(a.y*b.z - a.z*b.y,a.z*b.x - a.x*b.z,a.x*b.y - a.y*b.x);
        return new R3Vector(a.y*b.z - a.z*b.y,a.z*b.x - a.x*b.z, a.x*b.y - a.y*b.x);
    }

    public static double scalarProduct(R3Vector a, R3Vector b){
        System.out.println(a.x*b.x + a.y*b.y + a.z*b.z);
        return a.x*b.x + a.y*b.y + a.z*b.z;
    }



    public void turnX(double u){
        double y1 = y*Math.cos(u*(Math.PI/180)) + z*Math.sin(u*(Math.PI/180));
        double z1 = -y*Math.sin(u*(Math.PI/180)) + z*Math.cos(u*(Math.PI/180));
        x *= 1;
        y = y1;
        z = z1;
//        double len = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

    }

    public void turnY(double u){
        double x1 = x*Math.cos(u*(Math.PI/180)) + z*Math.sin(u*(Math.PI/180));
        double z1 = -x*Math.sin(u*(Math.PI/180)) + z*Math.cos(u*(Math.PI/180));
        y *=1;
        x = x1;
        z = z1;
//        double len = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

    }

    public void turnZ(double u){
        double x1 = x*Math.cos(u*(Math.PI/180)) - y*Math.sin(u*(Math.PI/180));
        double y1 = x*Math.sin(u*(Math.PI/180)) + y*Math.cos(u*(Math.PI/180));
        z *= 1;
        x = x1;
        y = y1;
//        double len = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

    }

    public void turn(double ux, double uy, double uz){

         this.turnX(ux);
         this.turnY(uy);
         this.turnZ(uz);
    }
}

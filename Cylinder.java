package day6;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {}


    public Cylinder( double radius){
     super(radius);
     this.height=height;
        }

    public Cylinder( double radius, double height){

        }

    public Cylinder( double radius, double height, String color){
        }

        public double getHeight () {

        return height;
        }

        public void setHeight ( double height){
        this.height=height;

        this.height = height;
        }
        public double getVolume () {
        return getHeight()*getArea();
        }
    }




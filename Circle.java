package q3day6;

    public class Circle implements GeometricObject{
        protected double radius;

    public Circle (double radius){

        this.radius=radius;
    }

        @Override
        public String toString() {
            return "Circle{" +
                    "radius=" + radius +
                    '}';
        }

public double getPerimeter() {
    return Math.PI*this.radius*2;

        }
        public double getArea(){
            return Math.PI*Math.pow(this.radius,2);

        }

    }

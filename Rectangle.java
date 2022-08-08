public class Rectangle extends Shape{
    protected double width=1.0;
    protected  double length=1.0;
    public Rectangle(){

    }
    public Rectangle(double width, double length, Object Shape){
        super(Shape);
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){

    }
    public double getPerimeter(){

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}

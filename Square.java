public class Square extends Rectangle{

 public Square() {
     super(Rectangle);
    }
    public Square(double side){

        this.side = side;
    }
    public Square( double side, String color,boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
 public double getSide(){
     return getSide();

    }
    public void setSide (double side){
     this.setSide=setSide();
    }
    public void setWidth(double side){
     this.setWidth()=setWidth;
    }
    public void setLength(){
     this.setWidth()=setLength;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                '}';
    }
}

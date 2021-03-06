package Shapes;

public class Rectangle extends Shapes{
    private Double width;
    private Double height;

    public Rectangle(Double width,Double height){
        setWidth(width);
        setHeight(height);
    }
    private void setWidth(Double width) {
        this.width = width;
    }
    private void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return this.width;
    }

    public Double getHeight() {
        return this.height;
    }

    @Override
    protected void calculatePerimeter() {
        setPerimeter(this.width * 2 + this.height * 2);
    }

    @Override
    protected void calculateArea() {
      setArea(this.width * this.height);
    }
}

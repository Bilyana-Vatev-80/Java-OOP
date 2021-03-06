package Shapes;

public class Circle extends Shapes {
    private Double radius;

    public Circle(Double radius) {
        setRadius(radius);
        this.calculateArea();
        this.calculatePerimeter();
    }

    private void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return this.radius;
    }

    @Override
    protected void calculatePerimeter() {
        setPerimeter(2 * Math.PI * this.radius);
    }

    @Override
    protected void calculateArea() {
        setArea(Math.PI * this.radius * this.radius);
    }
}

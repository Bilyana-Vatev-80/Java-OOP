package PointInRectangle;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public boolean isBigger (Point point){
        return point.x >= this.x && point.y >= this.y;
    }
    public boolean isSmaller (Point point) {
        return point.x <= this.x && point.y <= this.y;
    }
}

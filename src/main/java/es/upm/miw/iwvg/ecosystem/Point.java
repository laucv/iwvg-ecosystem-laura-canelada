package es.upm.miw.iwvg.ecosystem;

public class Point {

    private int x;

    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int xy) {
        this(xy, xy);
    }

    public Point() {
        this(0, 0);
    }

    public double module() {
        return Math.sqrt((double) this.x * this.x + this.y * this.y);
    }

    public double phase() {
        return Math.atan((double) this.y / this.x);
    }

    public void translateOrigin(Point origin) {
        this.x -= origin.getX();
        this.y -= origin.getY();
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public boolean isEquals(Point point) {
        return this.x == point.getX() && this.y == point.getY();
    }

    public double distance(Point point){
        return Math.sqrt( (double) ((this.x - point.getX())*(this.x - point.getX())) + (double) ((this.y - point.getY()) * (this.y - point.getY())) );
    }


}
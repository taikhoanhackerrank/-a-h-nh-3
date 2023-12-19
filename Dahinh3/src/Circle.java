import java.awt.*;

public class Circle extends Shape {
    protected double radius;
    protected Point center;
    protected boolean move_up, move_left;

    /** Circle constructor 1. */
    public Circle() {
    }

    /** Circle constructor 2. */
    public Circle(double radius) {
        this.radius = radius;
    }

    /** Circle constructor 3. */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /** Circle constructor 4. */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    /** Circle constructor 5. */
    public Circle(Point center, double radius, String color, boolean filled, double velocity) {
        super(color, filled, velocity);
        this.radius = radius;
        this.center = center;
    }

    /** Javadoc. */
    public Point getCenter() {
        return center;
    }

    /** Javadoc. */
    public void setCenter(Point center) {
        this.center = center;
    }

    /** Javadoc. */
    public double getRadius() {
        return radius;
    }

    /** Javadoc. */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Javadoc. */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /** Javadoc. */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /** Javadoc. */
    @Override
    public boolean equals(Object o) {
        Circle circle = (Circle) o;
        return this.getCenter().equals(circle.getCenter())
                && Math.abs(this.getRadius() - circle.getRadius()) <= 0.001;
    }

    /** Javadoc. */
    @Override
    public int hashCode() {
        int result;
        long tmp;
        tmp = Double.doubleToLongBits(radius);
        result = (int) (tmp ^ (tmp >>> 32));
        result = 31 * result + (center != null ? center.hashCode() : 0);
        return result;
    }

    /** Javadoc. */
    @Override
    public String toString() {
        return "Circle[center=(" + center.getPointX()
                + "," + center.getPointY() + ")" + ",radius="
                + radius + ",color=" + color + ",filled=" + filled + "]";
    }

    /** Javadoc. */
    @Override
    public void paint(Graphics g) {
        int x = (int)center.getPointX() - (int)radius;
        int y = (int)center.getPointY() - (int)radius;
        g.fillOval(x, y, (int)radius * 2, (int)radius * 2);
    }

    /** Javadoc. */
    public void move() {
        int x = (int)center.getPointX() - (int)radius;
        int y = (int)center.getPointY() - (int)radius;
        if (x > Frame.FRAME_WIDTH - (int)radius * 2) {
            move_left = true;
        }
        if (x < 0) {
            move_left = false;
        }
        if (y > Frame.FRAME_HEIGHT - (int)radius * 2) {
            move_up = true;
        }
        if (y < 0) {
            move_up = false;
        }
        if (move_left) {
            x -= velocity;
        } else {
            x += velocity;
        }
        if (move_up) {
            y -= velocity;
        } else {
            y += velocity;
        }
        center.setPointX(x + (int)radius);
        center.setPointY(y + (int)radius);
    }
}

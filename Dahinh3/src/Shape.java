import java.awt.*;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    protected double velocity;

    /** Shape constructor 1. */
    public Shape() {
    }

    /** Shape constructor 2. */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /** Shape constructor 3. */
    public Shape(String color, boolean filled, double velocity) {
        this.color = color;
        this.filled = filled;
        this.velocity = velocity;
    }

    /** Javadoc. */
    public double getVelocity() {
        return velocity;
    }

    /** Javadoc. */
    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    /** Javadoc. */
    public String getColor() {
        return color;
    }

    /** Javadoc. */
    public void setColor(String color) {
        this.color = color;
    }

    /** Javadoc. */
    public boolean isFilled() {
        return filled;
    }

    /** Javadoc. */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Javadoc. */
    public abstract double getArea();

    /** Javadoc. */
    public abstract double getPerimeter();

    /** Javadoc. */
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }

    /** Javadoc. */
    public abstract void paint(Graphics g);

    /** Javadoc. */
    public abstract void move();
}

import java.awt.*;

public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;
    protected boolean move_up, move_left;

    /** Rec constructor 1. */
    public Rectangle() {
    }

    /** Rec constructor 2. */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /** Rec constructor 3. */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /** Rec constructor 4. */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    /** Rec constructor 5. */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled, double velocity) {
        super(color, filled, velocity);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    /** Javadoc. */
    public Point getTopLeft() {
        return topLeft;
    }

    /** Javadoc. */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /** Javadoc. */
    public double getWidth() {
        return width;
    }

    /** Javadoc. */
    public void setWidth(double width) {
        this.width = width;
    }

    /** Javadoc. */
    public double getLength() {
        return length;
    }

    /** Javadoc. */
    public void setLength(double length) {
        this.length = length;
    }

    /** Javadoc. */
    @Override
    public double getArea() {
        return width * length;
    }

    /** Javadoc. */
    @Override
    public  double getPerimeter() {
        return 2 * (length + width);
    }

    /** Javadoc. */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            Rectangle rec = (Rectangle) o;
            return this.getTopLeft().equals(rec.getTopLeft())
                    && Math.abs(this.getLength() - rec.getLength()) <= 0.001
                    && Math.abs(this.getWidth() - rec.getWidth()) <= 0.001;
        }
        return false;
    }

    /** Javadoc. */
    @Override
    public int hashCode() {
        int result;
        long tmp;
        tmp = Double.doubleToLongBits(width);
        result = (int) (tmp ^ (tmp >>> 32));
        tmp = Double.doubleToLongBits(length);
        result = 31 * result + (int) (tmp ^ (tmp >>> 32));
        result = 31 * result + (topLeft != null ? topLeft.hashCode() : 0);
        return result;
    }

    /** Javadoc. */
    @Override
    public String toString() {
        return "Rectangle[topLeft=(" + topLeft.getPointX() + ","
                + topLeft.getPointY() + ")"
                + ",width=" + width + ",length=" + length
                + ",color=" + color + ",filled=" + filled + "]";
    }

    /** Javadoc. */
    @Override
    public void paint(Graphics g) {
        int x = (int)topLeft.getPointX();
        int y = (int)topLeft.getPointY();
        g.fillRect(x, y, (int)width, (int)length);
    }

    /** Javadoc. */
    public void move() {
        int x = (int)topLeft.getPointX();
        int y = (int)topLeft.getPointY();
        if (x + (int)width >= Frame.FRAME_WIDTH) {
            move_left = true;
        }
        if (x <= 0) {
            move_left = false;
        }
        if (y + (int)length >= Frame.FRAME_HEIGHT) {
            move_up = true;
        }
        if (y <= 0) {
            move_up = false;
        }
        if (move_left) {
            topLeft.setPointX(x - (int)velocity);
        } else {
            topLeft.setPointX(x + (int)velocity);
        }
        if (move_up) {
            topLeft.setPointY(y - (int)velocity);
        } else {
            topLeft.setPointY(y + (int)velocity);
        }
    }
}

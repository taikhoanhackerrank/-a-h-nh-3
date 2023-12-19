public class Square extends Rectangle {
    /** Square constructor 1. */
    public Square() {
    }

    /** Square constructor 2. */
    public Square(double side) {
        super(side, side);
    }

    /** Square constructor 3. */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /** Square constructor 4. */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    /** Square constructor 5. */
    public Square(Point topLeft, double side, String color, boolean filled, double velocity) {
        super(topLeft, side, side, color, filled, velocity);
    }

    /** Javadoc. */
    public double getSide() {
        return width;
    }

    /** Javadoc. */
    public void setSide(double side) {
        width = side;
        length = side;
    }

    /** Javadoc. */
    @Override
    public void setWidth(double side) {
        width = side;
        length = side;
    }

    /** Javadoc. */
    @Override
    public void setLength(double side) {
        width = side;
        length = side;
    }

    /** Javadoc. */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /** Javadoc. */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Square) {
            Square square = (Square) o;
            return this.getTopLeft().equals(square.getTopLeft())
                    && Math.abs(this.getLength() - square.getLength()) <= 0.001;
        }
        return false;
    }

    /** Javadoc. */
    @Override
    public String toString() {
        return "Square[topLeft=(" + topLeft.getPointX() + ","
                + topLeft.getPointY() + ")"
                + ",side=" + getSide() + ",color=" + color
                + ",filled=" + filled + "]";
    }
}

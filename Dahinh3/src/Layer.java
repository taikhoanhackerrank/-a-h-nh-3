import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.awt.Graphics;

public class Layer extends JPanel {
    private List<Shape> shapes = new ArrayList<>();

    /** Javadoc. */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /** Javadoc. */
    public void removeCircles() {
        for (int i = shapes.size() - 1; i >= 0; i--) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
            }
        }
    }

    /** Javadoc. */
    public String getInfo() {
        String result = "Layer of crazy shapes:\n";
        for (int i = 0; i < shapes.size(); i++) {
            result += shapes.get(i).toString() + "\n";
        }
        return result;
    }

    /** Javadoc. */
    public void removeDuplicates() {
        Set<Shape> uniqueShapes = new LinkedHashSet<>(shapes);
        shapes = new ArrayList<>(uniqueShapes);
    }

    @Override
    public void paintComponent(Graphics g) {
        int x = 0;
        int y = 0;
        for (Shape shape : shapes) {
            shape.paint(g);
        }
    }
}

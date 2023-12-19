import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Panel extends JPanel implements ActionListener {
    Rectangle rect = new Rectangle(new Point(10, 300), 50, 60, "orange", true, 10);
    Circle cir = new Circle(new Point(250, 100), 30, "orange", true, 10);
    Timer timer;
    Color[] colorList = {Color.red, Color.blue, Color.orange, Color.cyan, Color.pink, Color.yellow};
    Random ranColor = new Random();

    public Panel() {
        this.setFocusable(true);
        timer = new Timer(50, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
//        int i = ranColor.nextInt(colorList.length);
//        g.setColor(colorList[i]);
        rect.paint(g);
//        i = ranColor.nextInt(colorList.length);
//        g.setColor(colorList[i]);
        cir.paint(g);
    }

    public void update() {
        rect.move();
        cir.move();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        update();
        repaint();
    }
}

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame {
    public static int FRAME_WIDTH = 500;
    public static int FRAME_HEIGHT = 500;

    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        myFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        myFrame.setResizable(false);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        JPanel myPanel = new Panel();
        myFrame.add(myPanel);
    }
}

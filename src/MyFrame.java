import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
    public MyFrame() {
        setSize(350, 400); // w, h
    }

    public MyFrame(int x, int y) {
        setSize(x, y);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 클릭시 main 종료

        JPanel panel = (JPanel) getContentPane();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        setVisible(true);
    }
}

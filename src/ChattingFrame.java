import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChattingFrame extends MyFrame {

    ChattingFrame() {
        super(350, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 클릭시 main 종료

        JPanel panel = (JPanel) getContentPane();
        panel.setLayout(null);

        JTextArea chatLog = new JTextArea();
        chatLog.setSize(300, 350);
        chatLog.setLocation(350, 400);
        chatLog.setBackground(Color.BLACK);
        panel.add(chatLog);

        JTextField chatInput = new JTextField();
        chatInput.setSize(350, 50);
        chatLog.setLocation(350, 800);

        panel.add(chatInput);
        // chatInput.setBounds(, y, width, height);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ChattingFrame();
    }
}

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class ChattingFrame extends MyFrame implements ActionListener {

    ChattingFrame() {
        super(350, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 클릭시 main 종료

        Panel p1 = new Panel();
        TextField ipN = new TextField("...", 20); // IP
        Button bnt2 = new Button("Connect");
        p1.add(ipN);
        p1.add(bnt2);
        add(p1, BorderLayout.NORTH);

        Panel p2 = new Panel();
        TextArea chatLog = new TextArea(300, 350);
        chatLog.setBackground(Color.darkGray);
        chatLog.setForeground(Color.white);

        ScrollPane s = new ScrollPane();
        s.add(chatLog);

        s.setPreferredSize(new Dimension(300, 350)); // 스크롤 사이즈
        add(s, "Center");
        add(p2, BorderLayout.CENTER);

        Panel p3 = new Panel();
        TextField chatTxt = new TextField(20); // msg 입력
        p3.add(chatTxt);

        Button bnt = new Button("send");
        p3.add(bnt);
        add(p3, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ChattingFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }
}

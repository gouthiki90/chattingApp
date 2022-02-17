package site.metacoding.ch01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class CFrame extends JFrame{

	public CFrame () {
		this(500,500);
	}
	public CFrame(int x,int y) {
		setTitle("MyFrame");
		setSize(x,y);
		setBackground(Color.lightGray);
		setLayout(new FlowLayout());
		setLocation(700,300);
		
		//윈도우 창 종료 리스너
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
		setResizable(true);
	}
	
}

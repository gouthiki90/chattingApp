package site.metacoding.ch01;

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
import java.io.BufferedReader;
import java.io.PrintWriter;

public class CClient extends CFrame implements ActionListener, Runnable {
	
	Button connect, send;
	TextField hostTxt, chatTxt;
	TextArea ta;
	
	
	public CClient() {
		super(250,300);
		setTitle("MyChat2.0");
		
		Panel p1 = new Panel();
		p1.add(hostTxt = new TextField("...",20));
		p1.add(connect = new Button("Connect"));
		add(p1,BorderLayout.NORTH);
		
		ta = new TextArea(10,30);
		ta.setBackground(Color.darkGray);
		ta.setForeground(Color.white);
		ScrollPane s = new ScrollPane();
		s.add(ta);
		s.setPreferredSize(new Dimension(240,190));
		add(s,"Center");
		
		Panel p3 = new Panel();
		p3.add(chatTxt = new TextField(20));
	
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	public static void main(String[] args) {
	new CClient();

	}

	

}

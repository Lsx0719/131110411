package ui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;


public class Sold extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sold frame = new Sold();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Sold() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("\u7C73\u7C89\u9500\u552E");
		button.setFont(new Font("华文楷体", Font.BOLD, 20));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sold.this.setVisible(false);
				sell s=new sell();
				s.setVisible(true);
			}
		});
		button.setBounds(37, 171, 118, 59);
		contentPane.add(button);
		
		JLabel label = new JLabel("\u5E38\u5FB7\u7C73\u7C89\u9500\u552E\u7BA1\u7406\u7CFB\u7EDF");
		label.setFont(new Font("华文行楷", Font.BOLD, 36));
		label.setForeground(Color.BLACK);
		label.setBounds(32, 51, 392, 90);
		contentPane.add(label);
		
		JButton button_1 = new JButton("\u7C73\u7C89\u7BA1\u7406");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sold.this.setVisible(false);
				Manage m=new Manage();
				m.setVisible(true);
			}
		});
		button_1.setFont(new Font("华文楷体", Font.BOLD, 20));
		button_1.setBounds(274, 171, 118, 59);
		contentPane.add(button_1);
	}
	
}

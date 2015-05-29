package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Manage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manage frame = new Manage();
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
	public Manage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u9700\u8981\u6DFB\u52A0\u7684\u7C73\u7C89\u4FE1\u606F");
		label.setForeground(Color.RED);
		label.setFont(new Font("华文行楷", Font.BOLD, 20));
		label.setBounds(10, 10, 268, 38);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u7C73\u7C89\u540D\u79F0");
		label_1.setFont(new Font("华文行楷", Font.BOLD, 24));
		label_1.setBounds(21, 81, 118, 22);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(186, 82, 131, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("\u7C73\u7C89\u4EF7\u683C");
		label_2.setFont(new Font("华文行楷", Font.BOLD, 24));
		label_2.setBounds(21, 127, 118, 27);
		contentPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(186, 132, 131, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_3 = new JLabel("\u7C73\u7C89\u6570\u91CF");
		label_3.setFont(new Font("华文行楷", Font.BOLD, 24));
		label_3.setBounds(20, 176, 104, 38);
		contentPane.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(186, 187, 131, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manage.this.setVisible(false);
				sure s =new sure();
				s.setVisible(true);
			}
		});
		button.setBounds(320, 229, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manage.this.setVisible(false);
				Sold s=new Sold();
				s.setVisible(true);
			}
			
		});
		button_1.setBounds(10, 229, 93, 23);
		contentPane.add(button_1);
	}
}

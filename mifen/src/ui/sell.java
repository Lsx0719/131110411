package ui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import model.RiceFlourInfo;
import control.RiceFlourInfoControl;

public class sell extends JFrame {

	private JPanel contentPane;
	private static JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sell frame = new sell();
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
	public sell() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 40, 367, 151);
		contentPane.add(scrollPane);
		
		String [] header = {"米粉名称","米粉价格","剩余量"};
		String[][] celldata = null;
		DefaultTableModel model = new DefaultTableModel(celldata,header);
		table = new JTable(model);
		scrollPane.setViewportView(table);
		update();
		
		
		JButton btnOK = new JButton("\u786E\u5B9A");
		btnOK.setBounds(34, 218, 93, 23);
		contentPane.add(btnOK);
		btnOK.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				

				int a = table.getSelectedRow();
				
				String riceName = (String) table.getValueAt(a, 0);
				RiceFlourInfo rice = RiceFlourInfoControl.getControl().getRiceByName(riceName);
				int number = rice.getRiceFlourNum();
				rice.setRiceFlourNum(number-1);
				RiceFlourInfoControl.getControl().update(rice);
				
				Ok ok = new Ok();
				ok.setVisible(true);
				ok.setLocationRelativeTo(null);
				
				
			}
			
		});
		
		JButton btnReturn = new JButton("\u8FD4\u56DE");
		btnReturn.setBounds(260, 218, 93, 23);
		contentPane.add(btnReturn);
		
		btnReturn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				sell.this.setVisible(false);
				Sold m=new Sold();
				m.setVisible(true);
			}
			
		});
	}
	
	public static void update(){
		int a = table.getRowCount();
		for(int i = 0;i<a;i++){
			((DefaultTableModel) table.getModel()).removeRow(0);
		}
		List<RiceFlourInfo> list = RiceFlourInfoControl.getControl().getRiceAll();
		for(int i = 0;i<list.size();i++){
			String [] rowdata = {list.get(i).getRiceFlourName(),list.get(i).getRiceFlourPrice()+"",list.get(i).getRiceFlourNum()+""};
			((DefaultTableModel) table.getModel()).addRow(rowdata);
		}
	}
}

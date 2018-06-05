package JavaProjectGui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JavaProjectGui {
	JPanel panel5;
	JPanel panel4;
	JPanel panel3;
	JPanel panel2;
	JPanel panel1;
	JList<String> list1;
	JLabel label7;
	JLabel label6;
	JLabel label5;
	JLabel label4;
	JLabel label3;
	JLabel label1;
	JLabel label2;
	JTextField text1;
	JTextField text2;
	JTextField text3;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	DefaultListModel<String> listmodel;
	JFrame thisGUI;
	int pin = 5342;
	int balance = 0;
	
	public static void main(String[] args) {
		new JavaProjectGui();
	}
		
	public JavaProjectGui(){
		System.out.println("Welcome");
		thisGUI = new JFrame();
		thisGUI.setTitle("www.NOTASCAMBANK.com");
		thisGUI.setSize(408, 400);
		thisGUI.setResizable(false);
		thisGUI.setLocationRelativeTo(null);
		thisGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ListenForButton lForButton = new ListenForButton();
		ListenForButton2 lForButton2 = new ListenForButton2();
		ListenForText lForText = new ListenForText();
		ListenForLogout lForOpenItem = new ListenForLogout();
		ListenForPrint lForPrint = new ListenForPrint();
		ListenForWithdraw lforWithdraw = new ListenForWithdraw();
		ListenForDeposit lforDeposit = new ListenForDeposit();
		ListenForText3 lForText3 = new ListenForText3();
		ListenForText2 lForText2 = new ListenForText2();
		ListenForAbout lForAbout = new ListenForAbout();
		ListenForHome lForHome = new ListenForHome();
		
		
		
		
		//.______      ___      .__   __.  _______  __         1    
		//|   _  \    /   \     |  \ |  | |   ____||  |        1   
		//|  |_)  |  /  ^  \    |   \|  | |  |__   |  |        1  
		//|   ___/  /  /_\  \   |  . `  | |   __|  |  |        1 
		//|  |     /  _____  \  |  |\   | |  |____ |  `----.   1  
		//| _|    /__/     \__\ |__| \__| |_______||_______|   1 
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setOpaque(true);
		panel1.setBackground(Color.GREEN);
		
		label1 = new JLabel();
		label1.setText("Please Enter Your Pin Number Hint: 5342");
		label1.setBackground(Color.GREEN);
		label1.setOpaque(true);
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setVerticalAlignment(JLabel.TOP);
		label1.setBounds(0,0,398,40);
		label1.setFont(new Font(label1.getName(), Font.PLAIN, 18));
		panel1.add(label1);
		
		text1 = new JTextField(20);
		text1.setAlignmentY(JPanel.CENTER_ALIGNMENT);
		text1.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		text1.setBounds(100,100, 100, 30);
		text1.setOpaque(true);
		text1.addActionListener(lForText);
		panel1.add(text1);
		
		
		button1  = new JButton("Login");
		button1.setBounds(100, 130, 135, 30);
		button1.addActionListener(lForButton);
		button1.setOpaque(true);
		panel1.add(button1);
	
		
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		JMenuItem openMenuItem = new JMenuItem("Logout", KeyEvent.VK_O);
		openMenuItem.addActionListener(lForOpenItem);
		fileMenu.add(openMenuItem);
		fileMenu.addSeparator();
		JMenuItem printMenuItem = new JMenuItem("Print Balance", KeyEvent.VK_P);
		printMenuItem.addActionListener(lForPrint);
		fileMenu.add(printMenuItem);
		
		JMenu editMenu = new JMenu("Edit");
		JMenuItem copyMenuItem = new JMenuItem("About");
		copyMenuItem.addActionListener(lForAbout);
		editMenu.add(copyMenuItem);
		editMenu.addSeparator();
		JMenuItem pasteMenuItem = new JMenuItem("Home");
		pasteMenuItem.addActionListener(lForHome);
		editMenu.add(pasteMenuItem);
		
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		thisGUI.add(menuBar);
		thisGUI.setJMenuBar(menuBar);
		
		
		
		thisGUI.add(panel1);
		thisGUI.setVisible(true);
		
		//.______      ___      .__   __.  _______  __         2    
		//|   _  \    /   \     |  \ |  | |   ____||  |        2   
		//|  |_)  |  /  ^  \    |   \|  | |  |__   |  |        2  
		//|   ___/  /  /_\  \   |  . `  | |   __|  |  |        2 
		//|  |     /  _____  \  |  |\   | |  |____ |  `----.   2  
		//| _|    /__/     \__\ |__| \__| |_______||_______|   2

		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setOpaque(true);
		panel2.setBackground(Color.GREEN);
		

		label2 = new JLabel();
		label2.setText("Pin#: 5342  What Would You Like To Do?");
		label2.setBackground(Color.GREEN);
		label2.setOpaque(true);
		label2.setHorizontalAlignment(JLabel.CENTER);
		label2.setVerticalAlignment(JLabel.TOP);
		label2.setBounds(0,0,398,40);
		label2.setFont(new Font(label1.getName(), Font.PLAIN, 18));
		panel2.add(label2);
		
		button2  = new JButton("Deposit");
		button2.setBounds(250, 130, 135, 30);
		button2.addActionListener(lforDeposit);
		panel2.add(button2);
	
		button3  = new JButton("Withdraw");
		button3.setBounds(50, 130, 135, 30);
		button3.addActionListener(lforWithdraw);
		panel2.add(button3);
	
		//.______      ___      .__   __.  _______  __         3
		//|   _  \    /   \     |  \ |  | |   ____||  |        3   
		//|  |_)  |  /  ^  \    |   \|  | |  |__   |  |        3  
		//|   ___/  /  /_\  \   |  . `  | |   __|  |  |        3 
		//|  |     /  _____  \  |  |\   | |  |____ |  `----.   3  
		//| _|    /__/     \__\ |__| \__| |_______||_______|   3
		
		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setOpaque(true);
		panel3.setBackground(Color.GREEN);
		
		label3 = new JLabel();
		label3.setText("How much do you want to Withdraw");
		label3.setBackground(Color.GREEN);
		label3.setOpaque(true);
		label3.setHorizontalAlignment(JLabel.CENTER);
		label3.setVerticalAlignment(JLabel.TOP);
		label3.setBounds(0,0,398,40);
		label3.setFont(new Font(label3.getName(), Font.PLAIN, 18));
		panel3.add(label3);
		
		label4 = new JLabel();
		label4.setText("Your Balance is: $"+ balance);
		label4.setBackground(Color.GREEN);
		label4.setOpaque(true);
		label4.setHorizontalAlignment(JLabel.CENTER);
		label4.setVerticalAlignment(JLabel.TOP);
		label4.setBounds(30,40,300,400);
		label4.setFont(new Font(label4.getName(), Font.PLAIN, 18));
		panel3.add(label4);
		
		text2 = new JTextField(20);
		text2.setAlignmentY(JPanel.CENTER_ALIGNMENT);
		text2.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		text2.setBounds(100,100, 100, 30);
		text2.addActionListener(lForText2);
		text2.setOpaque(true);
		panel3.add(text2);
		
		button4  = new JButton("Back");
		button4.setBounds(50, 130, 135, 30);
		button4.addActionListener(lForButton2);
		button4.setOpaque(true);
		panel3.add(button4);
		

		//.______      ___      .__   __.  _______  __         4
		//|   _  \    /   \     |  \ |  | |   ____||  |        4   
		//|  |_)  |  /  ^  \    |   \|  | |  |__   |  |        4  
		//|   ___/  /  /_\  \   |  . `  | |   __|  |  |        4 
		//|  |     /  _____  \  |  |\   | |  |____ |  `----.   4  
		//| _|    /__/     \__\ |__| \__| |_______||_______|   4
		
		panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setOpaque(true);
		panel4.setBackground(Color.GREEN);
		
		label5 = new JLabel();
		label5.setText("How much do you want to Deposit");
		label5.setBackground(Color.GREEN);
		label5.setOpaque(true);
		label5.setHorizontalAlignment(JLabel.CENTER);
		label5.setVerticalAlignment(JLabel.TOP);
		label5.setBounds(0,0,398,40);
		label5.setFont(new Font(label5.getName(), Font.PLAIN, 18));
		panel4.add(label5);
		
		label6 = new JLabel();
		label6.setText("Your Balance is: $"+ balance);
		label6.setBackground(Color.GREEN);
		label6.setOpaque(true);
		label6.setHorizontalAlignment(JLabel.CENTER);
		label6.setVerticalAlignment(JLabel.TOP);
		label6.setBounds(30,40,300,400);
		label6.setFont(new Font(label6.getName(), Font.PLAIN, 18));
		panel4.add(label6);
		
		text3 = new JTextField(20);
		text3.setAlignmentY(JPanel.CENTER_ALIGNMENT);
		text3.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		text3.setBounds(100,100, 100, 30);
		text3.addActionListener(lForText3);
		text3.setOpaque(true);
		panel4.add(text3);
		
		button4  = new JButton("Back");
		button4.setBounds(50, 130, 135, 30);
		button4.addActionListener(lForButton2);
		button4.setOpaque(true);
		panel4.add(button4);
		
		//.______      ___      .__   __.  _______  __         5
		//|   _  \    /   \     |  \ |  | |   ____||  |        5   
		//|  |_)  |  /  ^  \    |   \|  | |  |__   |  |        5  
		//|   ___/  /  /_\  \   |  . `  | |   __|  |  |        5 
		//|  |     /  _____  \  |  |\   | |  |____ |  `----.   5  
		//| _|    /__/     \__\ |__| \__| |_______||_______|   5
		
		panel5 = new JPanel();
		panel5.setLayout(null);
		panel5.setOpaque(true);
		panel5.setBackground(Color.GREEN);
		
		label7 = new JLabel();
		label7.setText("<HTML>This is about the coders. Our names are Giulio and Rene we are students at PDHS.</HTML>");
		label7.setBackground(Color.GREEN);
		label7.setOpaque(true);
		label7.setHorizontalAlignment(JLabel.CENTER);
		label7.setVerticalAlignment(JLabel.TOP);
		label7.setBounds(0,0,398,80);
		label7.setFont(new Font(label7.getName(), Font.PLAIN, 18));
		panel5.add(label7);
		
		button4  = new JButton("Back");
		button4.setBounds(50, 130, 135, 30);
		button4.addActionListener(lForButton2);
		button4.setOpaque(true);
		panel5.add(button4);
		
		
	}
	
	//Add Action Listeners Here
	private class ListenForButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Button has been clicked");
			AddToList();
			
		}
		
	}
	
	private class ListenForText implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			AddToList();
		}
		
	}
	
	private class ListenForLogout implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			thisGUI.setContentPane(panel1);
			thisGUI.invalidate();
			thisGUI.validate();
		}
		
	}
	
	private class ListenForPrint implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(thisGUI, "$"+ balance);
		}
		
	}
	
	private void AddToList() {
		String txt = text1.getText();
		txt = txt.trim();
		Integer txt2 = Integer.parseInt(txt);	
		if (txt2==pin) {
			thisGUI.setContentPane(panel2);
			thisGUI.invalidate();
			thisGUI.validate();
			}
		else {
			JOptionPane.showMessageDialog(thisGUI, "Please enter right pin number");
		}
	}
	
	private class ListenForWithdraw implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			thisGUI.setContentPane(panel3);
			thisGUI.invalidate();
			thisGUI.validate();
		}
		
	}
	
	private class ListenForDeposit implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			thisGUI.setContentPane(panel4);
			thisGUI.invalidate();
			thisGUI.validate();
		}
		
		
	}

	private class ListenForText3 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String txt = text3.getText();
			 balance = balance + Integer.parseInt(txt);
			 label6.setText("Your Balance is: $"+ balance);
			 label4.setText("Your Balance is: $"+ balance);
			 
		}
		
		
	}
	private class ListenForText2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String txt = text2.getText();
			 balance = balance - Integer.parseInt(txt);
			 label4.setText("Your Balance is: $"+ balance);
			 label6.setText("Your Balance is: $"+ balance);
		}
		
		
	}
	private class ListenForButton2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			thisGUI.setContentPane(panel2);
			thisGUI.invalidate();
			thisGUI.validate();
		}
		
		
	}
	private class ListenForAbout implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			thisGUI.setContentPane(panel5);
			thisGUI.invalidate();
			thisGUI.validate();
		}
		
		
	}
	private class ListenForHome implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			thisGUI.setContentPane(panel2);
			thisGUI.invalidate();
			thisGUI.validate();
		}
		
		
	}
}









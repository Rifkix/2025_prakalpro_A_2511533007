package Pekan9_2511533007;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class kalkulator_2511533007 {

	private JFrame frame;
	private JTextField textField;
	
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kalkulator_2511533007 window = new kalkulator_2511533007();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public kalkulator_2511533007() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 321, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		textField.setBounds(10, 11, 272, 48);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 14));
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0); {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setBounds(10, 83, 69, 55);
		frame.getContentPane().add(btnBackspace);
		
		JButton btn7_2511533007 = new JButton("7");
		btn7_2511533007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7_2511533007.getText();
				textField.setText(number);
			}
		});
		btn7_2511533007.setBounds(10, 135, 69, 55);
		frame.getContentPane().add(btn7_2511533007);
		
		JButton btn4_2511533007 = new JButton("4");
		btn4_2511533007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4_2511533007.getText();
				textField.setText(number);
			}
		});
		btn4_2511533007.setBounds(10, 187, 69, 55);
		frame.getContentPane().add(btn4_2511533007);
		
		JButton btn1_2511533007 = new JButton("1");
		btn1_2511533007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1_2511533007.getText();
				textField.setText(number);
			}
		});
		btn1_2511533007.setBounds(10, 239, 69, 55);
		frame.getContentPane().add(btn1_2511533007);
		
		JButton btn0_2511533007 = new JButton("0");
		btn0_2511533007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0_2511533007.getText();
				textField.setText(number);
			}
		});
		btn0_2511533007.setBounds(10, 291, 69, 55);
		frame.getContentPane().add(btn0_2511533007);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setBounds(78, 83, 69, 55);
		frame.getContentPane().add(btnC);
		
		JButton btn8_2511533007 = new JButton("8");
		btn8_2511533007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8_2511533007.getText();
				textField.setText(number);
			}
		});
		btn8_2511533007.setBounds(78, 135, 69, 55);
		frame.getContentPane().add(btn8_2511533007);
		
		JButton btn5_2511533007 = new JButton("5");
		btn5_2511533007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5_2511533007.getText();
				textField.setText(number);
			}
		});
		btn5_2511533007.setBounds(78, 187, 69, 55);
		frame.getContentPane().add(btn5_2511533007);
		
		JButton btn2_2511533007 = new JButton("2");
		btn2_2511533007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2_2511533007.getText();
				textField.setText(number);
			}
		});
		btn2_2511533007.setBounds(78, 239, 69, 55);
		frame.getContentPane().add(btn2_2511533007);
		
		JButton btnDot_2511533007 = new JButton(".");
		btnDot_2511533007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot_2511533007.getText();
				textField.setText(number);
			}
		});
		btnDot_2511533007.setBounds(78, 291, 69, 55);
		frame.getContentPane().add(btnDot_2511533007);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setBounds(147, 83, 69, 55);
		frame.getContentPane().add(btn00);
		
		JButton btn9_2511533007 = new JButton("9");
		btn9_2511533007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9_2511533007.getText();
				textField.setText(number);
			}
		});
		btn9_2511533007.setBounds(147, 135, 69, 55);
		frame.getContentPane().add(btn9_2511533007);
		
		JButton btn6_2511533007 = new JButton("6");
		btn6_2511533007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6_2511533007.getText();
				textField.setText(number);
			}
		});
		btn6_2511533007.setBounds(147, 187, 69, 55);
		frame.getContentPane().add(btn6_2511533007);
		
		JButton btn3_2511533007 = new JButton("3");
		btn3_2511533007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3_2511533007.getText();
				textField.setText(number);
			}
		});
		btn3_2511533007.setBounds(147, 239, 69, 55);
		frame.getContentPane().add(btn3_2511533007);
		
		JButton btnEqual_2511533007 = new JButton("=");
		btnEqual_2511533007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}else if(operation=="*") {
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}else if(operation=="/") {
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}else if(operation=="%") {
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				
			}
		});
		btnEqual_2511533007.setBounds(147, 291, 69, 55);
		frame.getContentPane().add(btnEqual_2511533007);
		
		JButton btnPlus_2511533007 = new JButton("+");
		btnPlus_2511533007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+"; 
				
			}
		});
		btnPlus_2511533007.setBounds(213, 83, 69, 55);
		frame.getContentPane().add(btnPlus_2511533007);
		
		JButton btnMinus_2511533007 = new JButton("-");
		btnMinus_2511533007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-"; 
			}
		});
		btnMinus_2511533007.setBounds(213, 135, 69, 55);
		frame.getContentPane().add(btnMinus_2511533007);
		
		JButton btnMul_2511533007 = new JButton("*");
		btnMul_2511533007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*"; 
			}
		});
		btnMul_2511533007.setBounds(213, 187, 69, 55);
		frame.getContentPane().add(btnMul_2511533007);
		
		JButton btnDiv_2511533007 = new JButton("/");
		btnDiv_2511533007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/"; 
			}
		});
		btnDiv_2511533007.setBounds(213, 239, 69, 55);
		frame.getContentPane().add(btnDiv_2511533007);
		
		JButton btnPercent_2511533007 = new JButton("%");
		btnPercent_2511533007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%"; 
			}
		});
		btnPercent_2511533007.setBounds(213, 291, 69, 55);
		frame.getContentPane().add(btnPercent_2511533007);
	}
}

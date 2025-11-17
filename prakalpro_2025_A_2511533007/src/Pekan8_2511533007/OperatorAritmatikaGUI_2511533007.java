package Pekan8_2511533007;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI_2511533007 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;

	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan",JOptionPane.WARNING_MESSAGE);
	}
	private void pesanEror (String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Eror",JOptionPane.ERROR_MESSAGE );
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511533007 frame = new OperatorAritmatikaGUI_2511533007();
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
	public OperatorAritmatikaGUI_2511533007() {
		setResizable(false);
		setTitle("Operator Aritmatika");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 379, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Operator Aritmatika");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		lblNewLabel.setBounds(120, 10, 140, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setBounds(10, 60, 87, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Operator");
		lblNewLabel_1_1.setBounds(10, 136, 87, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Bilangan 2");
		lblNewLabel_1_1_1.setBounds(10, 96, 87, 20);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Hasil");
		lblNewLabel_1_1_2.setBounds(10, 172, 87, 20);
		contentPane.add(lblNewLabel_1_1_2);
		
		txtBil1 = new JTextField();
		txtBil1.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil1.setBounds(96, 61, 48, 18);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil2.setColumns(10);
		txtBil2.setBounds(96, 97, 48, 18);
		contentPane.add(txtBil2);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(96, 136, 48, 20);
		contentPane.add(cbOperator);
		
		txtHasil = new JTextField();
		txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
		txtHasil.setEditable(false);
		txtHasil.setColumns(10);
		txtHasil.setBounds(96, 173, 48, 18);
		contentPane.add(txtHasil);
		
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if(txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan ("Silahkan isi bilangan terlebih dahulu");
				}else if (txtBil2.getText().trim().isEmpty()) {
					pesanPeringatan ("Silahkan isi bilangan terlebih dahulu");
				}else if (txtBil2.getText().trim().startsWith("0")) {
					pesanPeringatan ("Tidak Boleh 0");
				} else {
				
					try {
						int a = Integer.parseInt(txtBil1.getText());
						int b = Integer.parseInt(txtBil2.getText());
						int c = cbOperator.getSelectedIndex(); //memilih operator
						if (c==0) {
							hasil = a+b;}
						if (c==1) {
							hasil = a-b;}
						if (c==2) {
							hasil = a*b;}
						if (c==3) {
							hasil = a/b;}
						if (c==4) {
							hasil = a%b;}
						
					} catch (NumberFormatException ex) {
						pesanEror ("Bilangan 1 dan Bilangan 2 harus angka ");
					}
				}
				
				txtHasil.setText(String.valueOf(hasil));
			}
		});
		btnNewButton.setBounds(176, 136, 84, 20);
		contentPane.add(btnNewButton);

	}
}
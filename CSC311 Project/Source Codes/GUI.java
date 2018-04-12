import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JButton;

public class GUI {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JLabel label;
	private JTextField textField4;
	private JTextField textField5;
	private JTextField textField6;
	private JLabel lblEnterTheValues;
	private JTextField txtA;
	private JTextField textField;
	private JTextField txtB;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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


	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 847, 696);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblR = new JLabel("Solution by linear :");
		lblR.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblR.setBounds(38, 210, 213, 34);
		frame.getContentPane().add(lblR);
		
		textField1 = new JTextField();
		textField1.setEditable(false);
		textField1.setForeground(Color.BLACK);
		textField1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField2 = new JTextField();
		textField2.setForeground(Color.BLACK);
		textField2.setEditable(false);
		textField2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField3 = new JTextField();
		textField3.setForeground(Color.BLACK);
		textField3.setEditable(false);
		textField3.setFont(new Font("Tahoma", Font.BOLD, 16));
		label = new JLabel("Solution by divide and conquer :");
		textField4 = new JTextField();
		textField5 = new JTextField();
		textField5.setForeground(Color.BLACK);
		textField5.setEditable(false);
		textField6 = new JTextField();
		textField6.setForeground(Color.BLACK);
		textField6.setEditable(false);
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_2 = new JTextField();
		textField_2.setForeground(Color.BLACK);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		Main m=new Main();
		JButton btnEnter = new JButton("  Enter");
		btnEnter.setForeground(Color.BLACK);
		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{String j1=textField.getText();
				String j2=textField_2.getText();
				m.setA(j1);
				m.setB(j2);
				m.main();
				textField1.setText("A : "+m.getA()+"  ,  B : "+m.getB());
				textField2.setText("In "+m.gettimeL()+" \u00B5s\n");
				
					textField3.setText("A*B = "+m.getd1());
			
				textField4.setText("A : "+m.getA()+"  ,  B : "+m.getB());
				textField5.setText("In "+m.gettimeD()+" \u00B5s\n");
				
				textField6.setText("A*B = "+m.getd2());
		
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
				}
		});
		btnEnter.setBounds(256, 125, 190, 43);
		frame.getContentPane().add(btnEnter);
				
		textField1.setBounds(38, 260, 368, 43);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		
		textField2.setBounds(38, 300, 368, 43);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		
		textField3.setColumns(10);
		textField3.setBounds(38, 342, 368, 43);
		frame.getContentPane().add(textField3);
		
		
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(38, 401, 368, 34);
		frame.getContentPane().add(label);
		
		
		
		textField4.setForeground(Color.BLACK);
		textField4.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField4.setEditable(false);
		textField4.setColumns(10);
		textField4.setBounds(38, 451, 368, 43);
		frame.getContentPane().add(textField4);
		
		
		
		textField5.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField5.setColumns(10);
		textField5.setBounds(38, 493, 368, 43);
		frame.getContentPane().add(textField5);
		
		
		
		textField6.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField6.setColumns(10);
		textField6.setBounds(38, 536, 368, 43);
		frame.getContentPane().add(textField6);
		
		lblEnterTheValues = new JLabel("Enter the values :");
		lblEnterTheValues.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEnterTheValues.setBounds(38, 16, 213, 34);
		frame.getContentPane().add(lblEnterTheValues);
		
		txtA = new JTextField();
		txtA.setText("A =");
		txtA.setForeground(Color.BLACK);
		txtA.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtA.setEditable(false);
		txtA.setColumns(10);
		txtA.setBounds(38, 66, 44, 43);
		frame.getContentPane().add(txtA);
		
		
		textField.setBounds(81, 66, 230, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		txtB = new JTextField();
		txtB.setText("B =");
		txtB.setForeground(Color.BLACK);
		txtB.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtB.setEditable(false);
		txtB.setColumns(10);
		txtB.setBounds(388, 66, 44, 43);
		frame.getContentPane().add(txtB);
		
		textField_2.setColumns(10);
		textField_2.setBounds(431, 66, 230, 43);
		frame.getContentPane().add(textField_2);
		
		
	}
}

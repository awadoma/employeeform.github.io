//154 INcasulation
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

public class FrameEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAdresse;
	private JTextField txtPhone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameEmployee frame = new FrameEmployee();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeForm = new JLabel("Employee Form");
		lblEmployeeForm.setBounds(163, 11, 138, 22);
		lblEmployeeForm.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblEmployeeForm);
		
		JLabel lblEmployeeName = new JLabel("Employee Name");
		lblEmployeeName.setBounds(36, 54, 84, 14);
		contentPane.add(lblEmployeeName);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setBounds(36, 95, 46, 14);
		contentPane.add(lblAdresse);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(36, 131, 46, 14);
		contentPane.add(lblPhone);
		
		txtName = new JTextField();
		txtName.setBounds(130, 51, 209, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtAdresse = new JTextField();
		txtAdresse.setBounds(130, 86, 209, 20);
		contentPane.add(txtAdresse);
		txtAdresse.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(131, 128, 208, 20);
		contentPane.add(txtPhone);
		txtPhone.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(79, 191, 69, 23);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					PrintWriter w = new PrintWriter(txtName.getText()+ ".text");
					w.println(txtName.getText()+ " ; ");
					w.println(txtAdresse.getText()+ " ; ");
					w.println(txtPhone.getText()+ " ; ");
					w.println(".............");
					w.close();
					JOptionPane.showMessageDialog( null,"information saved..");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		contentPane.add(btnSave);
		
		JButton btnExet = new JButton("Exet");
		btnExet.setBounds(207, 191, 69, 23);
		btnExet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExet.setForeground(Color.RED);
		contentPane.add(btnExet);
	}
}

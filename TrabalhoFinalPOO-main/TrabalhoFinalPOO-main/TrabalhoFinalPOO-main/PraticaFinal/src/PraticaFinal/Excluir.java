package PraticaFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Excluir extends JFrame {

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
					Excluir frame = new Excluir();
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
	public Excluir() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Achados e Perdidos");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 13));
		lblNewLabel.setBounds(165, 11, 120, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Digite o nome:");
		lblNome.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNome.setBounds(46, 72, 120, 14);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(183, 69, 167, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(183, 104, 167, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(183, 135, 167, 20);
		contentPane.add(textField_2);
		
		JLabel lblLocal = new JLabel("Digite o local:");
		lblLocal.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblLocal.setBounds(46, 107, 120, 14);
		contentPane.add(lblLocal);
		
		JLabel lblData = new JLabel("Digite a data");
		lblData.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblData.setBounds(46, 138, 120, 14);
		contentPane.add(lblData);
		
		JButton btnexcluir = new JButton("Excluir");
		btnexcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				achadoseperdidos app = new achadoseperdidos();
				try {
					app.connect();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			String deletar;
			if(btnexcluir.isSelected()==true) {
				 deletar = "tem certeza que deseja deletar";
				
			} 
			else 
				deletar ="Item deletado";
			
			
			try {
				app.deleteRecord();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 }
			
			
			
			
		});
		btnexcluir.setBackground(Color.RED);
		btnexcluir.setBounds(150, 212, 135, 23);
		contentPane.add(btnexcluir);
	}
}

package PraticaFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Alterar extends JFrame {

	private static final char[] UPDATE_USERS_SQL = null;
	private JPanel contentPane;
	private  JLabel lbltitulo;
	private  JTextField textpesquisar;
	private JButton btnNewButton;
	public  JTextField txtobs;
	public JTextField txtdata;
	public JTextField txtlocal;
	public JTextField txtproduto;
	public JLabel lblIdentificacao;

	/**
	 * Launch the application.
	 */
 

	/**
	 * Create the frame.
	 */
	public Alterar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblnomealt = new JLabel("Digite o nome do produto:");
		lblnomealt.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblnomealt.setBounds(10, 48, 143, 14);
		contentPane.add(lblnomealt);
		
		lbltitulo = new JLabel("Achados e Perdidos");
		lbltitulo.setFont(new Font("Impact", Font.PLAIN, 13));
		lbltitulo.setBounds(161, 11, 143, 14);
		contentPane.add(lbltitulo);
		
		textpesquisar = new JTextField();
		textpesquisar.setBounds(163, 45, 164, 20);
		contentPane.add(textpesquisar);
		textpesquisar.setColumns(10);
		
		
		JLabel lblitem = new JLabel("Nome do produto:");
		lblitem.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblitem.setBounds(34, 147, 117, 26);
		contentPane.add(lblitem);
		
		JLabel lbllocal = new JLabel("Digite o local:");
		lbllocal.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lbllocal.setBounds(34, 184, 97, 14);
		contentPane.add(lbllocal);
		
		JLabel lbldata = new JLabel("Digite a data de hoje:");
		lbldata.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lbldata.setBounds(34, 218, 117, 14);
		contentPane.add(lbldata);
		
		JLabel lblobs = new JLabel("Observa\u00E7\u00E3o:");
		lblobs.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblobs.setBounds(34, 252, 117, 14);
		contentPane.add(lblobs);
		
		JLabel lblop = new JLabel("Marque sua op\u00E7\u00E3o:");
		lblop.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblop.setBounds(34, 289, 117, 14);
		contentPane.add(lblop);
		
		JRadioButton rdbtnperdido = new JRadioButton("Perdido");
		rdbtnperdido.setBounds(180, 289, 76, 23);
		contentPane.add(rdbtnperdido);
		
		JRadioButton rdbtnEncontrado = new JRadioButton("Encontrado");
		rdbtnEncontrado.setBounds(258, 289, 109, 23);
		contentPane.add(rdbtnEncontrado);
		
		txtobs = new JTextField();
		txtobs.setColumns(10);
		txtobs.setBounds(180, 244, 199, 38);
		contentPane.add(txtobs);
		
		txtdata = new JTextField();
		txtdata.setColumns(10);
		txtdata.setBounds(180, 213, 199, 20);
		contentPane.add(txtdata);
		
		txtlocal = new JTextField();
		txtlocal.setColumns(10);
		txtlocal.setBounds(180, 182, 199, 20);
		contentPane.add(txtlocal);
		
		txtproduto = new JTextField();
		txtproduto.setColumns(10);
		txtproduto.setBounds(180, 151, 199, 20);
		contentPane.add(txtproduto);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(34, 122, 46, 14);
		contentPane.add(lblNewLabel);
		
		 lblIdentificacao = new JLabel("1");
		lblIdentificacao.setBounds(180, 122, 46, 14);
		contentPane.add(lblIdentificacao);
		

		
		
		JButton btnalterar = new JButton("Alterar");
		btnalterar.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
			achadoseperdidos app = new achadoseperdidos();
			try {
				app.connect();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 
		 	
        //update
			
			
			}
			
			
		 });
		btnalterar.setBackground(Color.YELLOW);
		btnalterar.setBounds(199, 402, 165, 23);
		contentPane.add(btnalterar);
		
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				achadoseperdidos app = new achadoseperdidos();
				try {
					app.connect();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			 	
				app.getUserBuscarNome(textpesquisar.getText());
			}
			
		});
		btnNewButton_1.setBounds(351, 44, 89, 23);
		contentPane.add(btnNewButton_1);
	}
	 
            }
        
  
 
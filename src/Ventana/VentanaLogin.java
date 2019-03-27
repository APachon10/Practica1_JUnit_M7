package Ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Usuarios;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class VentanaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JTextField txtPassword;
	private JLabel lblUsuario,lblPassword;
	private JButton btnLogin,btnInscripcion;
	private ArrayList <Usuarios> lista;
	private JLabel lblUser;
	private JLabel lblUser_Confirmado;
	
	public VentanaLogin() {
		Usuarios u = new Usuarios();
		lista = u.users;
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblUsuario = new JLabel("Usuario");
		
		lblPassword = new JLabel("Password");
		
		txtUser = new JTextField();
		txtUser.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		
		btnLogin = new JButton("Login");
		
		btnInscripcion = new JButton("Inscripcion");
		
		lblUser = new JLabel("User:");
		
		lblUser_Confirmado = new JLabel("");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(36)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblUser)
							.addGap(18)
							.addComponent(lblUser_Confirmado)
							.addGap(298))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblPassword)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblUsuario)
										.addGap(18)
										.addComponent(txtUser, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(70, Short.MAX_VALUE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(btnLogin)
								.addGap(18)
								.addComponent(btnInscripcion, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
								.addGap(135)))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(12)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUser)
						.addComponent(lblUser_Confirmado))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsuario)
						.addComponent(txtUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLogin)
						.addComponent(btnInscripcion))
					.addContainerGap(77, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Login(lista);
			}
		});
		this.setVisible(true);
	}
	public ArrayList <Usuarios> cargarDatosIniciales (ArrayList<Usuarios> usuarios){
		
		return usuarios;
	}
	public void Login(ArrayList<Usuarios> lista_users) {
		for (Usuarios usuarios : lista_users) {
			System.out.println(lista_users);
		}
	}
}

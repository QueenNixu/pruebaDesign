package pruebaDesign;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;

public class uno extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private static uno frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new uno();
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
	public uno() {
		
		setIconImage(tres.getImage());
		
		setTitle("Datos de Usuario");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 192);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(43, 0, 43));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 11, 61, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField.setForeground(new Color(255, 255, 0));
		textField.setBackground(new Color(0, 0, 0));
		textField.setBounds(74, 8, 350, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNickname = new JLabel("Nickname:");
		lblNickname.setForeground(new Color(255, 255, 255));
		lblNickname.setBounds(10, 36, 61, 14);
		contentPane.add(lblNickname);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_1.setForeground(new Color(255, 255, 0));
		textField_1.setBackground(new Color(0, 0, 0));
		textField_1.setColumns(10);
		textField_1.setBounds(74, 33, 350, 20);
		contentPane.add(textField_1);
		
		JLabel lblTitulo = new JLabel("Titulo:");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setBounds(10, 61, 414, 14);
		contentPane.add(lblTitulo);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_2.setForeground(new Color(255, 255, 0));
		textField_2.setBackground(new Color(0, 0, 0));
		textField_2.setColumns(10);
		textField_2.setBounds(74, 58, 350, 20);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("Generar saludo");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if( (textField.getText().isBlank()) || (textField.getText().isEmpty()) ) {
						throw new exception1();
					}
					if( (textField_1.getText().isBlank()) || (textField_1.getText().isEmpty()) ) {
						throw new exception1();
					}
					if( (textField_2.getText().isBlank()) || (textField_2.getText().isEmpty()) ) {
						throw new exception1();
					}
					else {
						setVisible(false);
						
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									dos frame = new dos(textField.getText(), textField_1.getText(), textField_2.getText());
									frame.setVisible(true);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});
					}
				}catch(exception1 e1) {
					Alerta A = new Alerta("Alguno de los campos de texto estan vacios");
				}
			}
		});
		btnNewButton.setBounds(148, 86, 138, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
			}
		});
		btnNewButton_1.setBounds(148, 115, 138, 23);
		contentPane.add(btnNewButton_1);
	}
	public static uno getUno() {
		return frame;
	}
}

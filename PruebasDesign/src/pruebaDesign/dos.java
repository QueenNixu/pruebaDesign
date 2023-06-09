package pruebaDesign;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class dos extends JFrame {

	private JPanel contentPane;

	public dos(String name, String nickname, String title) {
		
		setIconImage(tres.getImage());
		
		setTitle("Saludo");
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100, 340, 174);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(43, 0, 43));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Atras");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				uno.getUno().setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 0));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(113, 100, 86, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Hola "+name+",");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(18, 11, 300, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("A.K.A.: "+nickname);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(18, 36, 300, 44);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel(title+".");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(18, 60, 300, 44);
		contentPane.add(lblNewLabel_1_1);
	}
}

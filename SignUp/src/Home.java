import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	
	int xx,xy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setUndecorated(true);
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
	public Home() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 418);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 373, 441);
		panel.setBackground(Color.DARK_GRAY);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				xx = e.getX();
				xy = e.getY();
				
				
			}
		});
		lblNewLabel_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				
			int x = e.getXOnScreen();
			int y = e.getYOnScreen();
			Home.this.setLocation(x - xx, y -xy);
				
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(Home.class.getResource("/img/front-end.png")));
		lblNewLabel_1.setBounds(-367, 0, 740, 306);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setIcon(new ImageIcon(Home.class.getResource("/img/logo2.fw.png")));
		lblNewLabel_2.setBounds(56, 328, 83, 85);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setIcon(new ImageIcon(Home.class.getResource("/img/java.fw.png")));
		lblNewLabel_3.setBounds(137, 253, 189, 177);
		panel.add(lblNewLabel_3);
		
		JLabel lblJava = new JLabel("JAVA SWING ");
		lblJava.setForeground(Color.WHITE);
		lblJava.setBounds(161, 295, 94, 31);
		panel.add(lblJava);
		
		Button button = new Button("ENTRAR");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(Color.BLACK);
		button.setBounds(398, 307, 195, 35);
		contentPane.add(button);
		
		JLabel lblNome = new JLabel("NOME");
		lblNome.setBounds(398, 34, 54, 16);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(398, 51, 195, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(398, 84, 195, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("EMAIL");
		lblNewLabel.setBounds(398, 92, 54, 16);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(398, 109, 195, 35);
		contentPane.add(textField_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(398, 142, 195, 2);
		contentPane.add(separator_1);
		
		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setBounds(398, 161, 54, 16);
		contentPane.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(398, 178, 195, 33);
		contentPane.add(passwordField);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(398, 209, 195, 2);
		contentPane.add(separator_2);
		
		JLabel lblRepitaASenha = new JLabel("REPITA A SENHA");
		lblRepitaASenha.setBounds(398, 222, 118, 16);
		contentPane.add(lblRepitaASenha);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(398, 242, 195, 33);
		contentPane.add(passwordField_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(398, 273, 195, 2);
		contentPane.add(separator_3);
		
		JLabel lblX_CLOSE = new JLabel("             X");
		lblX_CLOSE.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.exit(0);
			}
		});
		lblX_CLOSE.setBounds(576, 0, 47, 14);
		contentPane.add(lblX_CLOSE);
	}
}

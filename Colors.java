package colorss;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JTextArea;

import java.awt.EventQueue;
import java.awt.Font;

public class Colors extends JFrame {
	// TODO Auto-generated method stub
	private JPanel contentPane;
	private JTextField textFieldRed;
	private JTextField textFieldGreen;
	private JTextField textFieldBlue;
	private JLabel lblNewLabel;
	private JLabel lblG;
	private JLabel lblB;
	private JTextArea textArea;
	
	private JSlider sliderBlue;
	private JTextField textFieldNumber16;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Colors frame = new Colors();
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
	public Colors() {
		setTitle("Colors");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSlider sliderRed = new JSlider();
		sliderRed.setMaximum(255);
		sliderRed.setBounds(71, 124, 200, 26);
		contentPane.add(sliderRed);
		
		JSlider sliderGreen = new JSlider();
		sliderGreen.setMaximum(255);
		sliderGreen.setBounds(71, 184, 200, 26);
		contentPane.add(sliderGreen);
		
		JSlider sliderBlue = new JSlider();
		sliderBlue.setMaximum(255);
		sliderBlue.setBounds(71, 241, 200, 26);
		contentPane.add(sliderBlue);		
	    
		textFieldRed = new JTextField();
		textFieldRed.setBounds(283, 124, 78, 22);
		contentPane.add(textFieldRed);
		textFieldRed.setColumns(10);
		
		textFieldGreen = new JTextField();
		textFieldGreen.setColumns(10);
		textFieldGreen.setBounds(283, 184, 78, 22);
		contentPane.add(textFieldGreen);
		
		textFieldBlue = new JTextField();
		textFieldBlue.setColumns(10);
		textFieldBlue.setBounds(283, 245, 78, 22);
		contentPane.add(textFieldBlue);
		
		lblNewLabel = new JLabel("R");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(44, 124, 24, 26);
		contentPane.add(lblNewLabel);
		
		lblG = new JLabel("G");
		lblG.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblG.setBounds(44, 184, 24, 26);
		contentPane.add(lblG);
		
		lblB = new JLabel("B");
		lblB.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblB.setBounds(44, 241, 24, 26);
		contentPane.add(lblB);
		
		textArea = new JTextArea();
		textArea.setBounds(407, 64, 249, 228);
		contentPane.add(textArea);
		textArea.setEditable(false);
		
		textFieldNumber16 = new JTextField();
		textFieldNumber16.setColumns(10);
		textFieldNumber16.setBounds(578, 305, 78, 22);
		contentPane.add(textFieldNumber16);
		textFieldNumber16.setEditable(false);
		
		JLabel label = new JLabel("#");
		label.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label.setBounds(561, 301, 16, 26);
		contentPane.add(label);
		
		JLabel lblMoveTheSliders = new JLabel("Move the sliders to change the color. The color tag");
		lblMoveTheSliders.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMoveTheSliders.setBounds(22, 24, 365, 26);
		contentPane.add(lblMoveTheSliders);
		
		JLabel lblNewLabel_1 = new JLabel("will be displayed in the box on the bottom right ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(22, 50, 345, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("so you can use it in other programmes.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(22, 75, 339, 22);
		contentPane.add(lblNewLabel_2);

	}
}

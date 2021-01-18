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

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import java.awt.event.ActionListener;

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
	
	private JSlider sliderRed;
	private JSlider sliderGreen;
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
	
	public void displayColorNumber() {
		String num16 = "";
        num16 += String.format("%02x", sliderRed.getValue());
        num16 += String.format("%02x", sliderGreen.getValue());
        num16 += String.format("%02x", sliderBlue.getValue());
        textFieldNumber16.setText(String.valueOf(num16));
	}
	
	/**
	 * Create the frame.
	 */
	public Colors() {
		setTitle("Colors");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 771, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		sliderRed = new JSlider();
		sliderRed.setValue(0);
		sliderRed.setMaximum(255);
		sliderRed.setBounds(71, 124, 200, 26);
		contentPane.add(sliderRed);
		
		sliderGreen = new JSlider();
		sliderGreen.setValue(0);
		sliderGreen.setMaximum(255);
		sliderGreen.setBounds(71, 184, 200, 26);
		contentPane.add(sliderGreen);
		
		sliderBlue = new JSlider();
		sliderBlue.setValue(0);
		sliderBlue.setMaximum(255);
		sliderBlue.setBounds(71, 261, 200, 26);
		contentPane.add(sliderBlue);		
	    
		textFieldRed = new JTextField();
		textFieldRed.setBounds(283, 124, 78, 22);
		contentPane.add(textFieldRed);
		textFieldRed.setColumns(10);
		textFieldRed.setEditable(false);
		
		textFieldGreen = new JTextField();
		textFieldGreen.setColumns(10);
		textFieldGreen.setBounds(283, 184, 78, 22);
		contentPane.add(textFieldGreen);
		textFieldGreen.setEditable(false);
		
		textFieldBlue = new JTextField();
		textFieldBlue.setColumns(10);
		textFieldBlue.setBounds(283, 265, 78, 22);
		contentPane.add(textFieldBlue);
		textFieldBlue.setEditable(false);
		
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
		lblB.setBounds(44, 261, 24, 26);
		contentPane.add(lblB);
		
		textArea = new JTextArea();
		textArea.setBounds(421, 75, 284, 261);
		contentPane.add(textArea);
		textArea.setEditable(false);
		
		textFieldNumber16 = new JTextField();
		textFieldNumber16.setColumns(10);
		textFieldNumber16.setBounds(627, 349, 78, 22);
		contentPane.add(textFieldNumber16);
		textFieldNumber16.setEditable(false);
		
		JLabel label = new JLabel("#");
		label.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label.setBounds(609, 345, 16, 26);
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
			
		sliderRed.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent event) {
	          int value = sliderRed.getValue();
	          textFieldRed.setText(String.valueOf(value));
	          displayColorNumber();
	          textArea.setBackground(new Color(sliderRed.getValue() ,sliderGreen.getValue(), sliderBlue.getValue()));
	        }
	    });
		
		sliderGreen.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent event) {
	          int value = sliderGreen.getValue();
	          textFieldGreen.setText(String.valueOf(value));
	          displayColorNumber();
	          textArea.setBackground(new Color(sliderRed.getValue() ,sliderGreen.getValue(), sliderBlue.getValue()));
	        }
	    });
		
		sliderBlue.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent event) {
	          int value = sliderBlue.getValue();
	          textFieldBlue.setText(String.valueOf(value));
	          displayColorNumber();
	          textArea.setBackground(new Color(sliderRed.getValue() ,sliderGreen.getValue(), sliderBlue.getValue()));
	        }
	    });
		
		displayColorNumber();
        textArea.setBackground(new Color(sliderRed.getValue() ,sliderGreen.getValue(), sliderBlue.getValue()));
        
        JButton printButton = new JButton("Print color tag");
        printButton.setBounds(22, 328, 174, 25);
        contentPane.add(printButton);
        
        JTextArea printArea = new JTextArea();
        printArea.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 16));
        printArea.setBounds(22, 366, 411, 139);
        contentPane.add(printArea);
        
        printButton.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent arg0) {
        		  //printArea.setText(textFieldNumber16.getText());  
        			boolean alreadyPrinted = false;
        			for (String line : printArea.getText().split("\n")) { //gets all text from textArea and and divides it by rows 
        				if ( line.equals(textFieldNumber16.getText())) { 			//(\n) and line gets each of the previously split values
        					alreadyPrinted = true;
        				}			
        			}
        			
        			if (!alreadyPrinted) {
        				printArea.append(textFieldNumber16.getText() + "\n");
        			}
        		} 
        });
       
        
        //addActionListener(new ActionListener(){  
        	//public void actionPerformed(ActionEvent e) {
	          //int value = sliderRed.getValue();
	         // textFieldRed.setText(String.valueOf(value));
	         // displayColorNumber();
	          //textArea.setBackground(new Color(sliderRed.getValue() ,sliderGreen.getValue(), sliderBlue.getValue()));
	      //  }
	   // });
        
		//textArea.setBackground(new Color(sliderRed.getValue() ,sliderGreen.getValue(), sliderBlue.getValue()));
		
		
		//Color FinalColor = new Color( sliderRed.getValue(), sliderGreen.getValue(), sliderBlue.getValue());
		//String hex = Integer.toHexString(FinalColor.getRGB()).substring(2);
		//String hex = String.format("%02x%02x%02x", sliderRed.getValue(), sliderGreen.getValue(), sliderBlue.getValue()); 
		//textFieldNumber16.setText(String.valueOf(num16));
	}
}

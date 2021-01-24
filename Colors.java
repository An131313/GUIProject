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
import javax.swing.JEditorPane;

public class Colors extends JFrame {
	// TODO Auto-generated method stub
	private JPanel contentPane;
	private JTextField redValue;
	private JTextField greenValue;
	private JTextField blueValue;
	private JLabel lblR;
	private JLabel lblG;
	private JLabel lblB;
	private JTextArea colorRGB;
	
	private JSlider sliderRed;
	private JSlider sliderGreen;
	private JSlider sliderBlue;
	
	private JTextField colorTag;
	private JTextArea firstSavedColor;
	private JTextArea fourthSavedColor;
	private JTextArea secondSavedColor;
	private JTextArea thirdSavedColor;
	private JTextArea fifthSavedColor;
	private JTextArea sixthSavedColor;
	private JLabel fifthSavedColorLabel;
	private JLabel sixthSavedColorLabel;
	private JButton printFifthColorButton;
	private JButton printSixthColorButton;
	private JTextArea textArea_1;
	
	private JLabel coloredTag2;
	private JLabel coloredTag3;
	private JLabel coloredTag1;
	private JLabel coloredTag4;
	private JLabel coloredTag5;
	private JLabel coloredTag6;
	private JLabel coloredTag7;
	private JLabel coloredTag8;
	private JLabel coloredTag9;
	private JTextArea seventhSavedColor;
	private JLabel seventhSavedColorLabel;
	private JButton printSeventhColorButton;
	private JButton printEigthSavedColorButton;
	private JTextArea eigthSavedColor;
	private JLabel eigthSavedColorLabel;
	private JTextField textField;
	private JLabel firstSavedColorLabel;
	private JLabel secondSavedColorLabel;
	private JLabel thirdSavedColorLabel;
	private JLabel fourthSavedColorLabel;
	
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
	 * returns the values form the sliders in the hexadecimal numeral system as a string
	 */
	public String displayColorNumber() {
		String num16 = "";
        num16 += String.format("%02x", sliderRed.getValue()); 
        num16 += String.format("%02x", sliderGreen.getValue());
        num16 += String.format("%02x", sliderBlue.getValue());
        return num16;
	}
	
	/**
	 * Create the frame.
	 */
	public Colors() {
		setTitle("Colors");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 695);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		sliderRed = new JSlider();
		sliderRed.setBackground(Color.WHITE);
		sliderRed.setForeground(Color.BLACK);
		sliderRed.setValue(0);
		sliderRed.setMaximum(255);
		sliderRed.setBounds(39, 69, 252, 26);
		contentPane.add(sliderRed);
		
		sliderGreen = new JSlider();
		sliderGreen.setBackground(Color.WHITE);
		sliderGreen.setForeground(Color.BLACK);
		sliderGreen.setValue(0);
		sliderGreen.setMaximum(255);
		sliderGreen.setBounds(39, 132, 252, 26);
		contentPane.add(sliderGreen);
		
		sliderBlue = new JSlider();
		sliderBlue.setBackground(Color.WHITE);
		sliderBlue.setForeground(Color.BLACK);
		sliderBlue.setValue(0);
		sliderBlue.setMaximum(255);
		sliderBlue.setBounds(39, 199, 252, 26);
		contentPane.add(sliderBlue);		
	    
		redValue = new JTextField();
		redValue.setFont(new Font("Century751 No2 BT", Font.PLAIN, 14));
		redValue.setBounds(303, 69, 35, 22);
		contentPane.add(redValue);
		redValue.setColumns(10);
		redValue.setEditable(false);
		
		greenValue = new JTextField();
		greenValue.setFont(new Font("Century751 No2 BT", Font.PLAIN, 14));
		greenValue.setColumns(10);
		greenValue.setBounds(303, 132, 35, 22);
		contentPane.add(greenValue);
		greenValue.setEditable(false);
		
		blueValue = new JTextField();
		blueValue.setFont(new Font("Century751 No2 BT", Font.PLAIN, 14));
		blueValue.setColumns(10);
		blueValue.setBounds(303, 201, 35, 22);
		contentPane.add(blueValue);
		blueValue.setEditable(false);
		
		lblR = new JLabel("R");
		lblR.setForeground(Color.BLACK);
		lblR.setFont(new Font("Century751 No2 BT", Font.BOLD, 22));
		lblR.setBounds(12, 69, 24, 26);
		contentPane.add(lblR);
		
		lblG = new JLabel("G");
		lblG.setForeground(Color.BLACK);
		lblG.setFont(new Font("Century751 No2 BT", Font.BOLD, 22));
		lblG.setBounds(12, 132, 24, 26);
		contentPane.add(lblG);
		
		lblB = new JLabel("B");
		lblB.setForeground(Color.BLACK);
		lblB.setFont(new Font("Century751 No2 BT", Font.BOLD, 22));
		lblB.setBounds(12, 199, 24, 26);
		contentPane.add(lblB);
		
		colorRGB = new JTextArea(); //the color will be displayed here
		colorRGB.setBounds(350, 14, 276, 261);
		contentPane.add(colorRGB);
		colorRGB.setEditable(false);
		
		colorTag = new JTextField(); //the hexadecimal number of the color will be displayed here
		colorTag.setFont(new Font("Century751 No2 BT", Font.PLAIN, 14));
		colorTag.setText("000000");
		colorTag.setColumns(10);
		colorTag.setBounds(570, 280, 56, 22);
		contentPane.add(colorTag);
		colorTag.setEditable(false);
		
		JLabel label = new JLabel("#");
		label.setFont(new Font("Century751 No2 BT", Font.PLAIN, 17));
		label.setBounds(552, 276, 16, 26);
		contentPane.add(label);
			
		sliderRed.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent event) {
	          int value = sliderRed.getValue();
	          redValue.setText(String.valueOf(value));
	          displayColorNumber();
	          colorRGB.setBackground(new Color(sliderRed.getValue(), sliderGreen.getValue(), sliderBlue.getValue())); //changes the amount of red
	          colorTag.setText(displayColorNumber());
	        }
	    });
		
		sliderGreen.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent event) {
	          int value = sliderGreen.getValue();
	          greenValue.setText(String.valueOf(value));
	          displayColorNumber();
	          colorRGB.setBackground(new Color(sliderRed.getValue(), sliderGreen.getValue(), sliderBlue.getValue())); //changes the amount of green
	          colorTag.setText(displayColorNumber());
	        }
	    });
		
		sliderBlue.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent event) {
	          int value = sliderBlue.getValue();
	          blueValue.setText(String.valueOf(value));
	          displayColorNumber();
	          colorRGB.setBackground(new Color(sliderRed.getValue(), sliderGreen.getValue(), sliderBlue.getValue())); //changes the amount of blue
	          colorTag.setText(displayColorNumber()); 
	        }
	    });
		
        colorRGB.setBackground(new Color(sliderRed.getValue(), sliderGreen.getValue(), sliderBlue.getValue())); //the color will be black on starting the program
        
        //saved colors will be displayed in those 
        firstSavedColor = new JTextArea();
        firstSavedColor.setEditable(false);
        firstSavedColor.setBackground(Color.BLACK);
        firstSavedColor.setBounds(177, 367, 109, 107);
        contentPane.add(firstSavedColor);
        
        secondSavedColor = new JTextArea();
        secondSavedColor.setEditable(false);
        secondSavedColor.setBackground(Color.BLACK);
        secondSavedColor.setBounds(290, 367, 109, 107);
        contentPane.add(secondSavedColor);
        
        thirdSavedColor = new JTextArea();
        thirdSavedColor.setEditable(false);
        thirdSavedColor.setBackground(Color.BLACK);
        thirdSavedColor.setBounds(403, 367, 109, 107);
        contentPane.add(thirdSavedColor);
        
        fourthSavedColor = new JTextArea();
        fourthSavedColor.setEditable(false);
        fourthSavedColor.setBackground(Color.BLACK);
        fourthSavedColor.setBounds(517, 367, 109, 107);
        contentPane.add(fourthSavedColor);
        
        fifthSavedColor = new JTextArea();
        fifthSavedColor.setEditable(false);
        fifthSavedColor.setBackground(Color.BLACK);
        fifthSavedColor.setBounds(177, 477, 109, 107);
        contentPane.add(fifthSavedColor);
        
        sixthSavedColor = new JTextArea();
        sixthSavedColor.setEditable(false);
        sixthSavedColor.setBackground(Color.BLACK);
        sixthSavedColor.setBounds(290, 477, 109, 107);
        contentPane.add(sixthSavedColor);
        
        seventhSavedColor = new JTextArea();
        seventhSavedColor.setEditable(false);
        seventhSavedColor.setBackground(Color.BLACK);
        seventhSavedColor.setBounds(403, 477, 109, 107);
        contentPane.add(seventhSavedColor);
        
        eigthSavedColor = new JTextArea();
        eigthSavedColor.setEditable(false);
        eigthSavedColor.setBackground(Color.BLACK);
        eigthSavedColor.setBounds(516, 477, 109, 107);
        contentPane.add(eigthSavedColor);
        
        //the hexadecimal number of saved colors will be displayed in those 
        firstSavedColorLabel = new JLabel(" ");
        firstSavedColorLabel.setFont(new Font("Century751 No2 BT", Font.PLAIN, 14));
        firstSavedColorLabel.setBounds(208, 345, 56, 16);
        contentPane.add(firstSavedColorLabel);
        
        secondSavedColorLabel = new JLabel(" ");
        secondSavedColorLabel.setFont(new Font("Century751 No2 BT", Font.PLAIN, 14));
        secondSavedColorLabel.setBounds(320, 345, 56, 16);
        contentPane.add(secondSavedColorLabel);
        
        thirdSavedColorLabel = new JLabel(" ");
        thirdSavedColorLabel.setFont(new Font("Century751 No2 BT", Font.PLAIN, 14));
        thirdSavedColorLabel.setBounds(434, 345, 56, 16);
        contentPane.add(thirdSavedColorLabel);
        
        fourthSavedColorLabel = new JLabel(" ");
        fourthSavedColorLabel.setFont(new Font("Century751 No2 BT", Font.PLAIN, 14));
        fourthSavedColorLabel.setBounds(548, 345, 56, 16);
        contentPane.add(fourthSavedColorLabel);
        
        fifthSavedColorLabel = new JLabel(" ");
        fifthSavedColorLabel.setFont(new Font("Century751 No2 BT", Font.PLAIN, 14));
        fifthSavedColorLabel.setBounds(210, 587, 56, 16);
        contentPane.add(fifthSavedColorLabel);
        
        sixthSavedColorLabel = new JLabel(" ");
        sixthSavedColorLabel.setFont(new Font("Century751 No2 BT", Font.PLAIN, 14));
        sixthSavedColorLabel.setBounds(322, 587, 56, 16);
        contentPane.add(sixthSavedColorLabel);
        
        seventhSavedColorLabel = new JLabel(" ");
        seventhSavedColorLabel.setFont(new Font("Century751 No2 BT", Font.PLAIN, 14));
        seventhSavedColorLabel.setBounds(436, 587, 56, 16);
        contentPane.add(seventhSavedColorLabel);
        
        eigthSavedColorLabel = new JLabel(" ");
        eigthSavedColorLabel.setFont(new Font("Century751 No2 BT", Font.PLAIN, 14));
        eigthSavedColorLabel.setBounds(548, 587, 56, 16);
        contentPane.add(eigthSavedColorLabel);
        
        //the saved colors in the boxes can be changed multiple times
        JButton printFirstColorButton = new JButton("Print Color 1");
        printFirstColorButton.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 13));
        printFirstColorButton.setBackground(Color.BLACK);
        printFirstColorButton.setForeground(Color.WHITE);
        printFirstColorButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		firstSavedColor.setBackground(new Color(sliderRed.getValue() ,sliderGreen.getValue(), sliderBlue.getValue())); //uses the current values from the sliders
        		firstSavedColorLabel.setText(colorTag.getText());//directly gets the transformed number 
        	}
        });
        
        printFirstColorButton.setBounds(177, 315, 108, 25);
        contentPane.add(printFirstColorButton);
        
        JButton printSecondColorButton = new JButton("Print Color 2");
        printSecondColorButton.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 13));
        printSecondColorButton.setBackground(Color.BLACK);
        printSecondColorButton.setForeground(Color.WHITE);
        printSecondColorButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		secondSavedColor.setBackground(new Color(sliderRed.getValue() ,sliderGreen.getValue(), sliderBlue.getValue()));
        		secondSavedColorLabel.setText(colorTag.getText());
        	}
        });
        printSecondColorButton.setBounds(290, 315, 108, 25);
        contentPane.add(printSecondColorButton);
        
        JButton printThirdColorButton = new JButton("Print Color 3");
        printThirdColorButton.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 13));
        printThirdColorButton.setBackground(Color.BLACK);
        printThirdColorButton.setForeground(Color.WHITE);
        printThirdColorButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		thirdSavedColor.setBackground(new Color(sliderRed.getValue() ,sliderGreen.getValue(), sliderBlue.getValue()));
        		thirdSavedColorLabel.setText(colorTag.getText());
        	}
        });
        printThirdColorButton.setBounds(403, 315, 108, 25);
        contentPane.add(printThirdColorButton);
        
        JButton printFourthColorButton = new JButton("Print Color 4");
        printFourthColorButton.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 13));
        printFourthColorButton.setBackground(Color.BLACK);
        printFourthColorButton.setForeground(Color.WHITE);
        printFourthColorButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		fourthSavedColor.setBackground(new Color(sliderRed.getValue() ,sliderGreen.getValue(), sliderBlue.getValue()));
        		fourthSavedColorLabel.setText(colorTag.getText());
        	}
        });
        printFourthColorButton.setBounds(518, 315, 108, 25);
        contentPane.add(printFourthColorButton);
        
        printFifthColorButton = new JButton("Print Color 5");
        printFifthColorButton.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 13));
        printFifthColorButton.setBackground(Color.BLACK);
        printFifthColorButton.setForeground(Color.WHITE);
        printFifthColorButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		fifthSavedColor.setBackground(new Color(sliderRed.getValue() ,sliderGreen.getValue(), sliderBlue.getValue()));
        		fifthSavedColorLabel.setText(colorTag.getText());
        	}
        });
        printFifthColorButton.setBounds(178, 610, 108, 25);
        contentPane.add(printFifthColorButton);
        
        printSixthColorButton = new JButton("Print Color 6");
        printSixthColorButton.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 13));
        printSixthColorButton.setBackground(Color.BLACK);
        printSixthColorButton.setForeground(Color.WHITE);
        printSixthColorButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		sixthSavedColor.setBackground(new Color(sliderRed.getValue() ,sliderGreen.getValue(), sliderBlue.getValue()));
        		sixthSavedColorLabel.setText(colorTag.getText());
        	}
        });
        printSixthColorButton.setBounds(290, 610, 108, 25);
        contentPane.add(printSixthColorButton);
        
        printSeventhColorButton = new JButton("Print Color 7");
        printSeventhColorButton.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 13));
        printSeventhColorButton.setBackground(Color.BLACK);
        printSeventhColorButton.setForeground(Color.WHITE);
        printSeventhColorButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		seventhSavedColor.setBackground(new Color(sliderRed.getValue() ,sliderGreen.getValue(), sliderBlue.getValue()));
        		seventhSavedColorLabel.setText(colorTag.getText());
        	}
        });
        printSeventhColorButton.setBounds(404, 610, 108, 25);
        contentPane.add(printSeventhColorButton);
        
        printEigthSavedColorButton = new JButton("Print Color 8");
        printEigthSavedColorButton.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 13));
        printEigthSavedColorButton.setBackground(Color.BLACK);
        printEigthSavedColorButton.setForeground(Color.WHITE);
        printEigthSavedColorButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		eigthSavedColor.setBackground(new Color(sliderRed.getValue() ,sliderGreen.getValue(), sliderBlue.getValue()));
        		eigthSavedColorLabel.setText(colorTag.getText());
        	}
        });
        printEigthSavedColorButton.setBounds(516, 610, 108, 25);
        contentPane.add(printEigthSavedColorButton);
        
        JButton printButton = new JButton("Print color tag");
        printButton.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 13));
        printButton.setForeground(Color.WHITE);
        printButton.setBackground(Color.BLACK);
        printButton.setBounds(12, 314, 148, 25);
        contentPane.add(printButton);

       //the hexadecimal numbers of colors (in the given color) will be displayed in those when printButton is clicked 
        coloredTag1 = new JLabel("");
        coloredTag1.setFont(new Font("Century751 No2 BT", Font.PLAIN, 17));
        coloredTag1.setBounds(59, 358, 74, 26);
        contentPane.add(coloredTag1);
        
        coloredTag2 = new JLabel("");
        coloredTag2.setFont(new Font("Century751 No2 BT", Font.PLAIN, 17));
        coloredTag2.setBounds(59, 387, 74, 26);
        contentPane.add(coloredTag2);
        
        coloredTag3 = new JLabel("");
        coloredTag3.setFont(new Font("Century751 No2 BT", Font.PLAIN, 17));
        coloredTag3.setBounds(59, 415, 74, 26);
        contentPane.add(coloredTag3);
        
        coloredTag4 = new JLabel("");
        coloredTag4.setFont(new Font("Century751 No2 BT", Font.PLAIN, 17));
        coloredTag4.setBounds(59, 445, 74, 26);
        contentPane.add(coloredTag4);
        
        coloredTag5 = new JLabel("");
        coloredTag5.setFont(new Font("Century751 No2 BT", Font.PLAIN, 17));
        coloredTag5.setBounds(59, 474, 74, 26);
        contentPane.add(coloredTag5);
        
        coloredTag6 = new JLabel("");
        coloredTag6.setFont(new Font("Century751 No2 BT", Font.PLAIN, 17));
        coloredTag6.setBounds(59, 502, 74, 26);
        contentPane.add(coloredTag6);
        
        coloredTag7 = new JLabel("");
        coloredTag7.setFont(new Font("Century751 No2 BT", Font.PLAIN, 17));
        coloredTag7.setBounds(59, 534, 74, 26);
        contentPane.add(coloredTag7);
        
        coloredTag8 = new JLabel("");
        coloredTag8.setFont(new Font("Century751 No2 BT", Font.PLAIN, 17));
        coloredTag8.setBounds(59, 563, 74, 26);
        contentPane.add(coloredTag8);
        
        coloredTag9 = new JLabel("");
        coloredTag9.setFont(new Font("Century751 No2 BT", Font.PLAIN, 17));
        coloredTag9.setBounds(59, 591, 74, 26);
        contentPane.add(coloredTag9);
        
        //only for the print area to be distinct from the background
        textField = new JTextField();
        textField.setBackground(Color.WHITE);
        textField.setForeground(Color.WHITE);
        textField.setEditable(false);
        textField.setBounds(12, 350, 148, 277);
        contentPane.add(textField);
        textField.setColumns(10);
        
        printButton.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent arg0) {
          			//checks what's the first empty label is if any and prints the hexadecimal numbers of colors (in the given color) 
        			if( coloredTag1.getText().equals("")) {
        				coloredTag1.setText(colorTag.getText());
            			coloredTag1.setForeground(new Color(sliderRed.getValue() ,sliderGreen.getValue(), sliderBlue.getValue()));
                	} else if (coloredTag2.getText().equals("")) {
                		coloredTag2.setText(colorTag.getText());
            			coloredTag2.setForeground(new Color(sliderRed.getValue() ,sliderGreen.getValue(), sliderBlue.getValue()));
                	} else if (coloredTag3.getText().equals("")) {
                		coloredTag3.setText(colorTag.getText());
            			coloredTag3.setForeground(new Color(sliderRed.getValue() ,sliderGreen.getValue(), sliderBlue.getValue()));
                	} else if(coloredTag4.getText().equals("")) {
                		coloredTag4.setText(colorTag.getText());
            			coloredTag4.setForeground(new Color(sliderRed.getValue() ,sliderGreen.getValue(), sliderBlue.getValue()));
                	} else if(coloredTag5.getText().equals("")) {
                		coloredTag5.setText(colorTag.getText());
            			coloredTag5.setForeground(new Color(sliderRed.getValue() ,sliderGreen.getValue(), sliderBlue.getValue()));
                	} else if(coloredTag6.getText().equals("")) {
                		coloredTag6.setText(colorTag.getText());
            			coloredTag6.setForeground(new Color(sliderRed.getValue() ,sliderGreen.getValue(), sliderBlue.getValue()));
                	} else if(coloredTag7.getText().equals("")) {
                		coloredTag7.setText(colorTag.getText());
            			coloredTag7.setForeground(new Color(sliderRed.getValue() ,sliderGreen.getValue(), sliderBlue.getValue()));
                	} else if(coloredTag8.getText().equals("")) {
                		coloredTag8.setText(colorTag.getText());
            			coloredTag8.setForeground(new Color(sliderRed.getValue() ,sliderGreen.getValue(), sliderBlue.getValue()));
                	}else if(coloredTag9.getText().equals("")) {
                		coloredTag9.setText(colorTag.getText());
            			coloredTag9.setForeground(new Color(sliderRed.getValue() ,sliderGreen.getValue(), sliderBlue.getValue()));
                	}
        	}			
        });
 }
}
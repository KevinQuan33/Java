//*********************************************************** 
// VoteCounterPanel.java 
// 
// Panel for the GUI that tallies votes for two candidates, 
// Joe and Sam. 
//*********************************************************** 

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

public class VoteCounterPanel extends JPanel 
{ 
	private int votesForJoe; 
	private JButton joe; 
	private JLabel labelJoe;
	private JLabel labelWinner;
	private int votesForSam; 
	private JButton sam; 
	private JLabel labelSam;
//------------------------------------------------- 
// Constructor: Sets up the GUI. 
//------------------------------------------------- 

	public VoteCounterPanel() 
	{ 
		votesForJoe = 0; 
		votesForSam = 0; 
		
		joe = new JButton("Vote for Joe"); 
		sam = new JButton("Vote for Sam");
		
		joe.addActionListener(new VoteButtonListener()); 
		sam.addActionListener(new VoteButtonListener()); 
		
		labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
		labelSam = new JLabel("Votes for Sam: " + votesForSam);
		labelWinner = new JLabel("It's tied");
		
		add(joe); 
		add(labelJoe); 
		add(sam); 
		add(labelSam);
		add(labelWinner);
		
		setPreferredSize(new Dimension(300, 40)); 
		setBackground(Color.cyan);
	} 
	//************************************************** 
	// Represents a listener for button push (action) events 
	//************************************************** 
	
	private class VoteButtonListener implements ActionListener { 

		//---------------------------------------------- 
		// Updates the appropriate vote counter when a 
		// button is pushed for one of the candidates. 
		//---------------------------------------------- 
	
		public void actionPerformed(ActionEvent event) 
		{ 
			
			
			if (event.getSource() == joe){
				votesForJoe++;
				labelJoe.setText("Votes for Joe: " + votesForJoe);	
			}
			if (event.getSource() == sam){
				votesForSam++;
				labelSam.setText("Votes for Sam: " + votesForSam);	
			}
			if (votesForJoe > votesForSam) {
				labelWinner.setText("Joe is winning");
			}
			if (votesForSam > votesForJoe){
				labelWinner.setText("Sam is winning");
			}
			if (votesForJoe == votesForSam){
				labelWinner.setText("It's tied");
			}
		} 
	}
} 
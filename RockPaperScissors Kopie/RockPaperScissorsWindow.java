package RockPaperScissors;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;

public class RockPaperScissorsWindow {

	private JFrame frame;
	private String userPick;
	private RockPaperScissors rockPaperScissors = new RockPaperScissors();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RockPaperScissorsWindow window = new RockPaperScissorsWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RockPaperScissorsWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Rock Paper Scissor");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setBounds(148, 31, 224, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel pickLbl = new JLabel("");
		pickLbl.setHorizontalAlignment(SwingConstants.CENTER);
		pickLbl.setBounds(113, 69, 329, 41);
		frame.getContentPane().add(pickLbl);
		
		JLabel resultLbl = new JLabel("Pick a Choice");
		resultLbl.setHorizontalAlignment(SwingConstants.CENTER);
		resultLbl.setBounds(113, 124, 329, 41);
		frame.getContentPane().add(resultLbl);
		
		JButton btnRock = new JButton("Rock");
		btnRock.setBounds(68, 194, 117, 29);
		frame.getContentPane().add(btnRock);
		btnRock.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String userPick = btnRock.getText();
				rockPaperScissors.setPickUser(userPick);
				String pcPick = RockPaperScissors.computer();
				rockPaperScissors.setPickPC(pcPick);
				rockPaperScissors.play();
				pickLbl.setText("You picked " + rockPaperScissors.getPickUser() + " your opponent picked " + rockPaperScissors.getPickPC());
				resultLbl.setText(rockPaperScissors.play());
				
			}
		});
		
		
		JButton btnScissor = new JButton("Scissor");
		btnScissor.setBounds(360, 194, 117, 29);
		frame.getContentPane().add(btnScissor);
		btnScissor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String userPick = btnScissor.getText();
				rockPaperScissors.setPickUser(userPick);
				String pcPick = RockPaperScissors.computer();
				rockPaperScissors.setPickPC(pcPick);
				rockPaperScissors.play();
				pickLbl.setText("You picked " + rockPaperScissors.getPickUser() + " your opponent picked " + rockPaperScissors.getPickPC());
				resultLbl.setText(rockPaperScissors.play());
				
			}
		});
		
		JButton btnPaper = new JButton("Paper");
		btnPaper.setBounds(211, 194, 117, 29);
		frame.getContentPane().add(btnPaper);
		btnPaper.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String userPick = btnPaper.getText();
				rockPaperScissors.setPickUser(userPick);
				String pcPick = RockPaperScissors.computer();
				rockPaperScissors.setPickPC(pcPick);
				rockPaperScissors.play();
				pickLbl.setText("You picked " + rockPaperScissors.getPickUser() + " your opponent picked " + rockPaperScissors.getPickPC());
				resultLbl.setText(rockPaperScissors.play());
				
			}
		});
		
		
		
		
		
	}
}

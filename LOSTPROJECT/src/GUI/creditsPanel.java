package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.SwingUtilities;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;

public class creditsPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public creditsPanel() {
		setForeground(Color.WHITE);
		setBackground(Color.BLACK);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		Component verticalGlue = Box.createVerticalGlue();
		add(verticalGlue);
		
		JLabel creditsLabel = new JLabel("CREDITS");
		creditsLabel.setBackground(Color.BLACK);
		creditsLabel.setForeground(Color.WHITE);
		creditsLabel.setFont(new Font("Chiller", Font.BOLD, 59));
		creditsLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(creditsLabel);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		add(verticalGlue_1);
		
		JLabel creatorsLabel = new JLabel("Creators of LOST");
		creatorsLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 17));
		creatorsLabel.setForeground(Color.CYAN);
		creatorsLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(creatorsLabel);
		
		Component verticalGlue_5 = Box.createVerticalGlue();
		add(verticalGlue_5);
		
		JLabel erenLabel = new JLabel("Eren Bilalo\u011Flu");
		erenLabel.setBackground(Color.BLACK);
		erenLabel.setForeground(Color.WHITE);
		erenLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(erenLabel);
		
		JLabel gunduzLabel = new JLabel("G\u00FCnd\u00FCz H\u00FCseynli");
		gunduzLabel.setBackground(Color.BLACK);
		gunduzLabel.setForeground(Color.WHITE);
		gunduzLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(gunduzLabel);
		
		JLabel onurLabel = new JLabel("Onur S\u00F6nmez");
		onurLabel.setBackground(Color.BLACK);
		onurLabel.setForeground(Color.WHITE);
		onurLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(onurLabel);
		
		JLabel yasinLabel = new JLabel("Yasin \u0130lka\u011Fan Tepeli");
		yasinLabel.setBackground(Color.BLACK);
		yasinLabel.setForeground(Color.WHITE);
		yasinLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(yasinLabel);
		
		Component verticalGlue_4 = Box.createVerticalGlue();
		add(verticalGlue_4);
		
		Component verticalGlue_3 = Box.createVerticalGlue();
		add(verticalGlue_3);
		
		JButton mainBtn = new JButton("Go Back");
		mainBtn.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				JFrame mainFrame= (JFrame) SwingUtilities.getRoot(mainBtn.getParent());
				if(mainFrame.getName()=="popUpFrame"){
					mainFrame.dispose();
				}
				else{
					CardLayout layout = (CardLayout)mainFrame.getContentPane().getLayout();
					layout.show(mainFrame.getContentPane(), "main");
					mainFrame.validate();
					mainFrame.setVisible(true);
				}
			}
		});
		
		//asdasdsadsadadasd
		mainBtn.setFont(new Font("Sitka Text", Font.BOLD, 15));
		mainBtn.setForeground(Color.WHITE);
		mainBtn.setContentAreaFilled(false);
		mainBtn.setBackground(Color.BLACK);
		mainBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(mainBtn);
		
		Component verticalGlue_2 = Box.createVerticalGlue();
		add(verticalGlue_2);

	}

}

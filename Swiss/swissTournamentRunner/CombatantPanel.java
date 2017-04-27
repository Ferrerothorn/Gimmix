package swissTournamentRunner;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CombatantPanel extends JPanel {

	public CombatantPanel(ArrayList<Battle> currentBattles) {
		setLayout(new java.awt.GridLayout(currentBattles.size(), 2));
		for (Battle b : currentBattles) {
			JButton playerButton = new JButton(b.getP1().getName());
			playerButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println(playerButton.getText());
				}
			});
			add(playerButton);
		}
	}
}
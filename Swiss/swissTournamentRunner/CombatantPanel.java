package swissTournamentRunner;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class CombatantPanel extends JPanel {

	public CombatantPanel(ArrayList<Battle> currentBattles, Tournament t) {
		setLayout(new MigLayout("wrap 2", "[grow,fill]"));
		for (Battle b : currentBattles) {
			JButton playerButton = new JButton(b.getP1().getName());
			playerButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					t.parseLine(playerButton.getText());
				}
			});
			add(playerButton, "fill");
		}
		this.setVisible(true);
	}
}
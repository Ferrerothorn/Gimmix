package swissTournamentRunner;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class GUI extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final static String newline = "\n";
	public static Tournament tourney;
	public static JTextField textField;
	public static JTextArea textArea;
	public static JFrame frame = new JFrame("BTC");

	public GUI(Tournament t) {
		super(new GridBagLayout());
		tourney = t;

		textArea = new JTextArea(30, 40);
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("monospaced", Font.PLAIN, 16));

		JScrollPane scrollPane = new JScrollPane(textArea);
		JPanel inputArea = new JPanel();
		inputArea.setLayout(new BorderLayout());
		JLabel inputLabel = new JLabel(" Enter options here: ");
		textField = new JTextField(90);
		textField.addActionListener(this);
		inputArea.add(inputLabel, "West");
		inputArea.add(textField, "Center");

		GridBagConstraints c = new GridBagConstraints();
		c.gridwidth = GridBagConstraints.REMAINDER;
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1.0;
		c.weighty = 1.0;
		add(scrollPane, c);
		c.fill = GridBagConstraints.HORIZONTAL;
		add(inputArea, c);
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		String text = textField.getText();
		tourney.setUserSelection(text);
		if (text.length() > 0) {
			textArea.append(" " + text + newline);
			textField.setText(null);
			textArea.setCaretPosition(textArea.getDocument().getLength());
		}
	}

	public static String getTextFromArea() {
		return textArea.getText();
	}

	public static void createAndShowGUI(Boolean show) {
		frame.setSize(600, 450);
		frame.add(new GUI(tourney));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(show);
	}

	public static void postString(String s) {
		textArea.append(s + newline);
		textArea.setCaretPosition(textArea.getDocument().getLength());
	}

	public static void postString() {
		textArea.append(newline);
		textArea.setCaretPosition(textArea.getDocument().getLength());
	}

	public static void wipePane() {
		textArea.setText("");
		textArea.setCaretPosition(textArea.getDocument().getLength());
	}

	public static String generateInDepthRankings(ArrayList<Player> ps) {
		String participantString = "";
		int longestPlayerNameLength = 0;

		for (Player p : ps) {
			if (p.getName().length() > longestPlayerNameLength) {
				longestPlayerNameLength = p.getName().length();
			}
		}

		if (tourney.topCutThreshold != 0) {
			participantString += "===Rankings - Top Cut===" + "\n";
			for (int i = 1; i <= tourney.topCutThreshold; i++) {
				if (!ps.get(i - 1).getName().equals("BYE")) {

					String pScore = Integer.toString(ps.get(i - 1).getScore());
					String pTB = Integer.toString(ps.get(i - 1).getTB());
					String pOWR = Integer.toString(ps.get(i - 1).getOppWr()) + "%";
					String pOOWR = Integer.toString(ps.get(i - 1).getOppOppWr()) + "%";

					participantString += Utils.rpad(
							"" + i + ") " + ps.get(i - 1).getName() + "                         ",
							longestPlayerNameLength + 7)
							+ Utils.rpad("Score: " + pScore + "                         ", 15) + "   "
							+ Utils.rpad("TB: " + pTB + "                         ", 8) + "   "
							+ Utils.rpad(("Opp WR: " + pOWR + "  "), 14) + "  "
							+ Utils.rpad("Opp Opp WR: " + pOOWR + "  ", 18) + "  "
							+ Utils.rpad("STB: " + ps.get(i - 1).oppositionTBSum, 9) + '\n';
				}
			}
			participantString += "==Rankings - Qualifiers==" + "\n";
		} else {
			participantString += "-=-=-=-Rankings-=-=-=-" + '\n';
		}

		for (int j = tourney.topCutThreshold + 1; j <= ps.size(); j++) {
			if (!ps.get(j - 1).getName().equals("BYE")) {

				String pScore = Integer.toString(ps.get(j - 1).getScore());
				String pTB = Integer.toString(ps.get(j - 1).getTB());
				String pOWR = Integer.toString(ps.get(j - 1).getOppWr()) + "%";
				String pOOWR = Integer.toString(ps.get(j - 1).getOppOppWr()) + "%";

				participantString += Utils.rpad("" + j + ") " + ps.get(j - 1).getName() + "                         ",
						longestPlayerNameLength + 7) + "   "
						+ Utils.rpad("Score: " + pScore + "                         ", 15) + "   "
						+ Utils.rpad("TB: " + pTB + "                         ", 8) + "   "
						+ Utils.rpad("Opp WR: " + pOWR + "                         ", 12) + "    "
						+ Utils.rpad("Opp Opp WR: " + pOOWR + "                         ", 16) + "  "
						+ Utils.rpad("STB: " + ps.get(j - 1).oppositionTBSum, 9) + '\n';
				;
			}
		}
		return participantString;
	}

	public static void printCurrentBattles(ArrayList<Battle> battles, String roundString) {
		int longestPlayerNameLength = 0;
		for (Battle b : battles) {
			if (b.getP1().getName().length() > longestPlayerNameLength) {
				longestPlayerNameLength = b.getP1().getName().length();
			}
			if (b.getP2().getName().length() > longestPlayerNameLength) {
				longestPlayerNameLength = b.getP2().getName().length();
			}
		}

		postString(roundString);
		for (Battle b : battles) {
			String playerOneString = b.getP1().getName() + " (" + b.getP1().getPositionInRankings()
					+ ")                          ";
			String playerTwoString = b.getP2().getName() + " (" + b.getP2().getPositionInRankings()
					+ ")                          ";

			postString(Utils.rpad("Table " + b.getTableNumber() + ") ", 11)
					+ Utils.rpad(playerOneString, longestPlayerNameLength + 8) + "vs.    "
					+ Utils.rpad(playerTwoString, longestPlayerNameLength + 8));
		}
		TntFileManager.saveTournament(tourney);
	}
}
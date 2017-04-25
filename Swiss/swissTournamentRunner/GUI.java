package swissTournamentRunner;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

import net.miginfocom.swing.MigLayout;

public class GUI implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final static String newline = "\n";
	public static Tournament tourney;
	public static JTextField textField;
	public static JTextArea pairingsBox;
	public static JTextArea resultsBox;
	public static JFrame frame = new JFrame("BTC");

	public GUI(Tournament t) {
		tourney = t;
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setLayout(new MigLayout("wrap 1", "[grow,fill]"));

		JPanel outputArea = new JPanel(new MigLayout());

		pairingsBox = new JTextArea(20, 40);
		pairingsBox.setEditable(false);
		pairingsBox.setLineWrap(true);
		pairingsBox.setFont(new Font("monospaced", Font.PLAIN, 16));

		resultsBox = new JTextArea(20, 20);
		resultsBox.setEditable(false);
		resultsBox.setLineWrap(false);
		resultsBox.setFont(new Font("monospaced", Font.PLAIN, 14));

		JScrollPane pairingsPane = new JScrollPane(pairingsBox);
		JScrollPane resultsPane = new JScrollPane(resultsBox);

		JPanel overallOutputArea = new JPanel(new MigLayout("wrap 3", "[grow,fill]"));
		overallOutputArea.add(pairingsPane, "span 2, grow");
		overallOutputArea.add(resultsPane);

		JPanel inputArea = new JPanel(new MigLayout("wrap 1", "[grow,fill]"));
		JLabel inputLabel = new JLabel(" Enter options here: ");
		textField = new JTextField(40);
		textField.addActionListener(this);
		inputArea.add(inputLabel);
		inputArea.add(textField);

		frame.add(overallOutputArea, "wrap, grow");
		frame.add(inputArea, "grow");
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		String text = textField.getText();
		tourney.setUserSelection(text);
		if (text.length() > 0) {
			pairingsBox.append(" " + text + newline);
			textField.setText(null);
			pairingsBox.setCaretPosition(pairingsBox.getDocument().getLength());
		}
	}

	public static String getTextFromArea() {
		return pairingsBox.getText();
	}

	public static void createAndShowGUI(Boolean show) {
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(show);
	}

	public static void postString(String s) {
		pairingsBox.append(s + newline);
		pairingsBox.setCaretPosition(pairingsBox.getDocument().getLength());
	}

	public static void postString() {
		pairingsBox.append(newline);
		pairingsBox.setCaretPosition(pairingsBox.getDocument().getLength());
	}

	public static void wipePane() {
		pairingsBox.setText("");
		pairingsBox.setCaretPosition(pairingsBox.getDocument().getLength());
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
					String pTR = Integer.toString(ps.get(i - 1).getTrashRating());

					participantString += Utils.rpad(
							"" + i + ") " + ps.get(i - 1).getName() + "                         ",
							longestPlayerNameLength + 7)
							+ Utils.rpad("Score: " + pScore + "                         ", 15) + "   "
							+ Utils.rpad("TB: " + pTB + "                         ", 8) + "   "
							+ Utils.rpad(("Opp WR: " + pOWR + "  "), 14) + "  "
							+ Utils.rpad("Opp Opp WR: " + pOOWR + "  ", 18) + "  "
							+ Utils.rpad("TR: " + pTR + "             ", 10) + '\n';
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
				String pTR = Integer.toString(ps.get(j - 1).getTrashRating());

				participantString += Utils.rpad("" + j + ") " + ps.get(j - 1).getName() + "                         ",
						longestPlayerNameLength + 7) + "   "
						+ Utils.rpad("Score: " + pScore + "                         ", 15) + "   "
						+ Utils.rpad("TB: " + pTB + "                         ", 8) + "   "
						+ Utils.rpad("Opp WR: " + pOWR + "                         ", 12) + "    "
						+ Utils.rpad("Opp Opp WR: " + pOOWR + "                         ", 16) + "  "
						+ Utils.rpad("TR: " + pTR + "                         ", 10) + '\n';
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
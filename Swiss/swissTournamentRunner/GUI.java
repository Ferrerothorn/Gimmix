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

		textArea = new JTextArea(25, 35);
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
		frame.setSize(500, 400);
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
		String participantString = "-=-=-=-Rankings-=-=-=-" + '\n';
		int longestPlayerNameLength = 0;

		for (Player p : ps) {
			if (p.getName().length() > longestPlayerNameLength) {
				longestPlayerNameLength = p.getName().length();
			}
		}

		for (int i = 1; i <= ps.size(); i++) {
			if (!ps.get(i - 1).getName().equals("BYE")) {
				participantString += Utils.rpad("" + i + ") " + ps.get(i - 1).getName() + "                         ",
						longestPlayerNameLength + 7) + "   "
						+ Utils.rpad("Score: " + ps.get(i - 1).getScore() + "                         ", 15) + "   "
						+ Utils.rpad("TB: " + ps.get(i - 1).getTB() + "                         ", 8) + "   "
						+ Utils.rpad("Opp WR: " + ps.get(i - 1).getOppWr() + "                         ", 12) + "    "
						+ Utils.rpad("Opp Opp WR: " + ps.get(i - 1).getOppOppWr() + "                         ", 16) + "  "
						+ Utils.rpad("TR: " + ps.get(i - 1).getTrashRating() + "                         ", 10) + '\n';
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
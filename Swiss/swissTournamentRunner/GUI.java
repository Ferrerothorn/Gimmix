package swissTournamentRunner;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final static String newline = "\n";
	public static Tournament tourney;
	public JTextField textField;
	public static JTextArea textArea;

	public GUI(Tournament t) {
		super(new GridBagLayout());
		tourney = t;
		
		textArea = new JTextArea(25, 35);
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("monospaced", Font.PLAIN, 14));

		JScrollPane scrollPane = new JScrollPane(textArea);
		textField = new JTextField(50);
		textField.addActionListener(this);

		GridBagConstraints c = new GridBagConstraints();
		c.gridwidth = GridBagConstraints.REMAINDER;
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1.0;
		c.weighty = 1.0;
		add(scrollPane, c);
		c.fill = GridBagConstraints.HORIZONTAL;
		add(textField, c);
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

	public static void createAndShowGUI() {
		JFrame frame = new JFrame("BTBTC");
		frame.setSize(500, 400);
		
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("/nak.png"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new GUI(tourney));
		frame.pack();
		frame.setVisible(true);
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
	}
}
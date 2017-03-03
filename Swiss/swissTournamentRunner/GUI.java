package swissTournamentRunner;
 
/* TextDemo.java requires no other files. */
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class GUI extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	protected JTextField textField;
    protected JTextArea textArea;
    private final static String newline = "\n";
 
    public GUI() {
        super(new GridBagLayout());
 
        textArea = new JTextArea(15, 25);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
 
        textField = new JTextField(40);
        textField.addActionListener(this);
 
        
        //Add Components to this panel.
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
        textArea.append(" " + text + newline);
        textField.selectAll();
 
        //Make sure the new text is visible, even if there
        //was a selection in the text area.
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
 
    public static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("TextDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Add contents to the window.
        frame.add(new GUI());
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public void postString (String s) {
        textArea.append(s + newline);
    }

}
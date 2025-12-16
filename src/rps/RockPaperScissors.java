package rps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class RockPaperScissors extends JPanel
        implements ActionListener {

    // JFrame Radio Buttons
    static String rockString = "Rock";
    static String paperString = "Paper";
    static String scissorsString = "Scissors";

    // Label to display text
    static JLabel label;

    public RockPaperScissors() {
        super(new BorderLayout());

        //Create the radio buttons.
        JRadioButton rockButton = new JRadioButton(rockString);
        rockButton.setMnemonic(KeyEvent.VK_R);
        rockButton.setActionCommand(rockString);
        rockButton.setSelected(true);

        JRadioButton paperButton = new JRadioButton(paperString);
        paperButton.setMnemonic(KeyEvent.VK_P);
        paperButton.setActionCommand(paperString);

        JRadioButton scissorsButton = new JRadioButton(scissorsString);
        scissorsButton.setMnemonic(KeyEvent.VK_S);
        scissorsButton.setActionCommand(scissorsString);

        //Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(rockButton);
        group.add(paperButton);
        group.add(scissorsButton);

        //Register a listener for the radio buttons.
        rockButton.addActionListener(this);
        paperButton.addActionListener(this);
        scissorsButton.addActionListener(this);

        //Put the radio buttons in a column in a panel.
        JPanel radioPanel = new JPanel(new GridLayout(4, 0));
        radioPanel.add(label);
        radioPanel.add(rockButton);
        radioPanel.add(paperButton);
        radioPanel.add(scissorsButton);


        add(radioPanel, BorderLayout.LINE_START);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    }

    /** Listens to the radio buttons. */
    public void actionPerformed(ActionEvent e) {
        e.getActionCommand();
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Rock Paper Scissors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating a label to display text
        label = new JLabel("Choose rock, paper or scissors");

        //Create and set up the content pane.
        JComponent newContentPane = new RockPaperScissors();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}



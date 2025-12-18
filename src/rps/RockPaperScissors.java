/*
https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/uiswing/examples/components/RadioButtonDemoProject/src/components/RadioButtonDemo.java
*/

package rps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class RockPaperScissors extends JPanel
        implements ActionListener {

    // JFrame Radio Buttons
    static String rockString = "Rock";
    static String paperString = "Paper";
    static String scissorsString = "Scissors";

    // Label to display text
    private JLabel informationLabel;
    private JLabel playerChoiceLabel;
    private JLabel cpuChoiceLabel;
    private JLabel resultLabel;

    public RockPaperScissors() {
        super(new BorderLayout());

        //Create the radio buttons.
        JRadioButton rockButton = new JRadioButton(rockString);
        rockButton.setMnemonic(KeyEvent.VK_R);
        rockButton.setActionCommand(rockString);

        JRadioButton paperButton = new JRadioButton(paperString);
        paperButton.setMnemonic(KeyEvent.VK_P);
        paperButton.setActionCommand(paperString);

        JRadioButton scissorsButton = new JRadioButton(scissorsString);
        scissorsButton.setMnemonic(KeyEvent.VK_S);
        scissorsButton.setActionCommand(scissorsString);

        // Select one by default
        //rockButton.setSelected(true);

        //Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(rockButton);
        group.add(paperButton);
        group.add(scissorsButton);

        //Register a listener for the radio buttons.
        rockButton.addActionListener(this);
        paperButton.addActionListener(this);
        scissorsButton.addActionListener(this);

        // Creating a label to display text
        informationLabel = new JLabel("Choose rock, paper or scissors");
        playerChoiceLabel = new JLabel("Player chose:");
        cpuChoiceLabel = new JLabel("CPU chose:");
        resultLabel = new JLabel("Winner:");

        //Put the radio buttons and label in a column in a panel.
        JPanel radioPanel = new JPanel(new GridLayout(0, 1));
        radioPanel.add(informationLabel);
        radioPanel.add(rockButton);
        radioPanel.add(paperButton);
        radioPanel.add(scissorsButton);
        radioPanel.add(playerChoiceLabel);
        radioPanel.add(cpuChoiceLabel);
        radioPanel.add(resultLabel);

        add(radioPanel, BorderLayout.LINE_START);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    }

    /** Listens to the radio buttons. */
    public void actionPerformed(ActionEvent e) {
        String playerChoice = e.getActionCommand();
        System.out.println("Player chose" + playerChoice);

        playerChoiceLabel.setText("Player chose " + playerChoice);

        String[] cpuChoiceList = {rockString,paperString,scissorsString};

        Random random = new Random();

        int randomIndex = random.nextInt(cpuChoiceList.length);
        String cpuChoice = cpuChoiceList[randomIndex];
        System.out.println("CPU chose " + playerChoice);
        cpuChoiceLabel.setText("CPU chose " + cpuChoice);

        if(playerChoice.equals(cpuChoice)){
            resultLabel.setText("It's a Draw.");
        }
        else if ( playerChoice.equals(rockString) && cpuChoice.equals(scissorsString) ||
                    playerChoice.equals(paperString) && cpuChoice.equals(rockString) ||
                    playerChoice.equals(scissorsString) && cpuChoice.equals(paperString)) {
            resultLabel.setText("Player wins.");
        }
        else {
            resultLabel.setText("CPU wins.");
        }

    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("R-P-S");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);

        //Create and set up the content pane.
        JComponent newContentPanel = new RockPaperScissors();
        newContentPanel.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPanel);

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



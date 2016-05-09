package Day4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by student on 06/05/2016.
 */
public class CharacterIndexingProgram implements ActionListener {

    static JFrame frame = new JFrame();
    static JButton button = new JButton("Execute");
    JLabel label = new JLabel("Enter a string");
    JTextField textField = new JTextField(40);

    CharacterIndexingProgram(){

        frame.setLayout(new FlowLayout());
        frame.getContentPane().add(label);
        frame.getContentPane().add(textField);
        textField.setSize(200, 200);
        frame.getContentPane().add(button);
        button.setSize(100,50);
        frame.setVisible(true);
        frame.setSize(300,300);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new CharacterIndexingProgram();
    }


}

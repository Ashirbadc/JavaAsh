package Day3.Swing;

/**
 * Created by student on 05/05/2016.
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SimpleGUI implements ActionListener {
    static JFrame frame = new JFrame("My first Application");
    static JButton button = new JButton("Click Me");

    public static void main(String[] args)
    {


        SimpleGUI gui = new SimpleGUI();
        gui.go();

    }

    public void go()
    {
        frame.getContentPane().add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

        button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent  event){
        button.setText("YOU CLICKED ME!!");
    }

}


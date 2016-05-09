package Day3.Swing;

/**
 * Created by student on 05/05/2016.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;


public class CouponApplication extends JFrame {
    public static void main(String[] args) {
        new CouponApplication();
    }
    public CouponApplication() {
        super("coupon application");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Coupon[] coupons = new Coupon[]{new Coupon("Thai Satay", 4.00),
                                            new Coupon("Maccaroons", 1.00)};

        //combobox
        JComboBox comboBox = new JComboBox (coupons);
        getContentPane().add(comboBox);

        //create a button to save to file
        JButton button = new JButton("Save to file");
        button.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){
               Object item = comboBox.getSelectedItem();

                if(item == null)
                {
                    showMessage("Please select a coupon");
                }
                else{
                    //cast item to coupon
                    Coupon coupon = (Coupon) item;
                    try{
                        coupon.saveToAFile("coupon.txt");
                        showMessage("The file has been successfully saved");
                    }
                    catch (FileNotFoundException e1){
                        showMessage("Cannot find the MAN!!");
                    }
                }

            }


        });

        getContentPane().add(button);
        setVisible(true);
    }
    private void showMessage(String message)
    {
        JOptionPane.showMessageDialog(this, message);
    }


}

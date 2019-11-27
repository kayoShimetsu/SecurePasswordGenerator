import javax.swing.*;
import java.awt.*;


/**
 * Class that creates a frame
 * @author IwonaD
 */

public class MyFrame extends JFrame {
    MyFrame() {
        super("Generator Bezpiecznych Haseł"); //Secure Password Generator
        setSize(550, 380);
        setMinimumSize(new Dimension(550, 380));
        setPreferredSize(new Dimension(550, 380));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(true);

        Dimension dimOfWindow = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        setLocation((dimOfWindow.width - this.getSize().width)/2, (dimOfWindow.height - this.getSize().height)/2);

        initComponents();

        pack();
    }

    /**
     * Initializes components from form
     */
    public void initComponents() {
        MyForm myForm = new MyForm();
        setContentPane(myForm.jPanel);
    }
}

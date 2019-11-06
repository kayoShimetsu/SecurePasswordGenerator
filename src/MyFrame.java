import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        super("Generator Bezpiecznych Haseł"); //Secure Password Generator
        //setJMenuBar(new JMenuBar());
        setSize(700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(true);

        Dimension dimOfWindow = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        setLocation((dimOfWindow.width - this.getSize().width)/2, (dimOfWindow.height - this.getSize().height)/2);

        initComponents();

        pack();
    }

    public void initComponents(){
        MyForm myForm = new MyForm();
        setContentPane(myForm.jPanel);
    }
}

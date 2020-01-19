import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;


/**
 * Class that creates a frame
 * @author IwonaD
 */

public class MyFrame extends JFrame {
    MyFrame() {
        super("Generator Bezpiecznych Haseł"); //Secure Password Generator
        setSize(550, 395);
        setMinimumSize(new Dimension(550, 395));
        setPreferredSize(new Dimension(550, 395));
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        Dimension dimOfWindow = new Dimension(Toolkit
                                              .getDefaultToolkit()
                                              .getScreenSize());
        setLocation((dimOfWindow.width - this.getSize().width)/2,
                    (dimOfWindow.height - this.getSize().height)/2);


        initComponents();

        pack();

        //creates option pane asking if user is sure to clean system clipboard
        // and close application
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                int value = JOptionPane.showConfirmDialog(null,
                        "Zamykając program zgadzasz się na wyczyszczenie " +
                                "zawartości systemowego schowka." +
                                "\nWybierz OK by zamknąć program", "Zamknąć okno?",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE);
                if(value == 0) {
                    Toolkit.getDefaultToolkit().getSystemClipboard()
                            .setContents(new StringSelection(""), null);
                    System.exit(0);
                }
            }
        });
    }

    /**
     * Initializes components from form
     */
    public void initComponents() {
        MyForm myForm = new MyForm();
        setContentPane(myForm.jPanel);
    }
}

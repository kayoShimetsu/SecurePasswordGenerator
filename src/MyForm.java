import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyForm {
    public JPanel jPanel;
    private JTabbedPane tabbedPane1;
    private JSlider passLengthSlider;
    private JCheckBox aZCheckBox;
    private JCheckBox aZCheckBox2;
    private JCheckBox a09CheckBox;
    private JCheckBox sPolishCharsCheckBox;
    private JCheckBox bPolishCharsCheckBox;
    private JCheckBox checkBoxL1C1;
    private JCheckBox checkBoxL1C2;
    private JCheckBox checkBoxL1C3;
    private JCheckBox checkBoxL1C4;
    private JCheckBox checkBoxL1C5;
    private JCheckBox checkBoxL1C6;
    private JCheckBox checkBoxL1C7;
    private JCheckBox checkBoxL1C8;
    private JButton allL1Button;
    private JCheckBox checkBoxL2C1;
    private JCheckBox checkBoxL2C2;
    private JCheckBox checkBoxL2C3;
    private JCheckBox checkBoxL2C4;
    private JCheckBox checkBoxL2C5;
    private JCheckBox checkBoxL2C6;
    private JCheckBox checkBoxL2C7;
    private JCheckBox checkBoxL2C8;
    private JButton allL2Button;
    private JCheckBox checkBoxL3C1;
    private JCheckBox checkBoxL3C2;
    private JCheckBox checkBoxL3C3;
    private JCheckBox checkBoxL3C4;
    private JCheckBox checkBoxL3C5;
    private JCheckBox checkBoxL3C6;
    private JCheckBox checkBoxL3C7;
    private JCheckBox checkBoxL3C8;
    private JButton allL3Button;
    private JCheckBox checkBoxL4C1;
    private JCheckBox checkBoxL4C2;
    private JCheckBox checkBoxL4C3;
    private JCheckBox checkBoxL4C4;
    private JCheckBox checkBoxL4C5;
    private JCheckBox checkBoxL4C6;
    private JCheckBox checkBoxL4C7;
    private JCheckBox checkBoxL4C8;
    private JButton allL4Button;
    private JLabel passLengthLabel;
    private JLabel charsLabel;
    private JLabel sliderValueLabel;
    private JButton generateButton;
    private JProgressBar progressBar1;
    private JLabel genInfoLabel;
    private JTextPane generatedPassTextPane;
    private JButton copyGeneratedPassButton;
    private JLabel creatorInfoJLabel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JLabel oldPassSthenghtLabel;
    private JButton enhancePassButton;
    private JTextPane enhancedPassTextPane;
    private JTextPane ogólnieWyjaśnieniePoCoTextPane;
    private JButton copyCreatedPassButton;
    private JTextPane createdPassTextPane;
    private JButton copyEnhancedPassButton;
    private JLabel generatedPassStrengthLabel;
    private JButton createButton;
    private JLabel createdPassStrengthLabel;
    private JLabel enhancedPassStrengthLabel;


    public MyForm() {
        //TODO set panel components visibility

        //**********GENERATOR**********//

        //shows slider value
        passLengthSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                sliderValueLabel.setText("" + passLengthSlider.getValue());
            }
        });

        //checks/unchecks all checkBoxes from first line
        allL1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkBoxL1C1.isSelected()
                       && checkBoxL1C2.isSelected()
                       && checkBoxL1C3.isSelected()
                       && checkBoxL1C4.isSelected()
                       && checkBoxL1C5.isSelected()
                       && checkBoxL1C6.isSelected()
                       && checkBoxL1C7.isSelected()
                       && checkBoxL1C8.isSelected())
                {
                    checkBoxL1C1.setSelected(false);
                    checkBoxL1C2.setSelected(false);
                    checkBoxL1C3.setSelected(false);
                    checkBoxL1C4.setSelected(false);
                    checkBoxL1C5.setSelected(false);
                    checkBoxL1C6.setSelected(false);
                    checkBoxL1C7.setSelected(false);
                    checkBoxL1C8.setSelected(false);
                }
                else
                {
                    checkBoxL1C1.setSelected(true);
                    checkBoxL1C2.setSelected(true);
                    checkBoxL1C3.setSelected(true);
                    checkBoxL1C4.setSelected(true);
                    checkBoxL1C5.setSelected(true);
                    checkBoxL1C6.setSelected(true);
                    checkBoxL1C7.setSelected(true);
                    checkBoxL1C8.setSelected(true);
                }
            }
        });

        //checks/unchecks all checkBoxes from second line
        allL2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkBoxL2C1.isSelected()
                        && checkBoxL2C2.isSelected()
                        && checkBoxL2C3.isSelected()
                        && checkBoxL2C4.isSelected()
                        && checkBoxL2C5.isSelected()
                        && checkBoxL2C6.isSelected()
                        && checkBoxL2C7.isSelected()
                        && checkBoxL2C8.isSelected())
                {
                    checkBoxL2C1.setSelected(false);
                    checkBoxL2C2.setSelected(false);
                    checkBoxL2C3.setSelected(false);
                    checkBoxL2C4.setSelected(false);
                    checkBoxL2C5.setSelected(false);
                    checkBoxL2C6.setSelected(false);
                    checkBoxL2C7.setSelected(false);
                    checkBoxL2C8.setSelected(false);
                }
                else
                {
                    checkBoxL2C1.setSelected(true);
                    checkBoxL2C2.setSelected(true);
                    checkBoxL2C3.setSelected(true);
                    checkBoxL2C4.setSelected(true);
                    checkBoxL2C5.setSelected(true);
                    checkBoxL2C6.setSelected(true);
                    checkBoxL2C7.setSelected(true);
                    checkBoxL2C8.setSelected(true);
                }
            }
        });

        //checks/unchecks all checkBoxes from third line
        allL3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkBoxL3C1.isSelected()
                        && checkBoxL3C2.isSelected()
                        && checkBoxL3C3.isSelected()
                        && checkBoxL3C4.isSelected()
                        && checkBoxL3C5.isSelected()
                        && checkBoxL3C6.isSelected()
                        && checkBoxL3C7.isSelected()
                        && checkBoxL3C8.isSelected())
                {
                    checkBoxL3C1.setSelected(false);
                    checkBoxL3C2.setSelected(false);
                    checkBoxL3C3.setSelected(false);
                    checkBoxL3C4.setSelected(false);
                    checkBoxL3C5.setSelected(false);
                    checkBoxL3C6.setSelected(false);
                    checkBoxL3C7.setSelected(false);
                    checkBoxL3C8.setSelected(false);
                }
                else
                {
                    checkBoxL3C1.setSelected(true);
                    checkBoxL3C2.setSelected(true);
                    checkBoxL3C3.setSelected(true);
                    checkBoxL3C4.setSelected(true);
                    checkBoxL3C5.setSelected(true);
                    checkBoxL3C6.setSelected(true);
                    checkBoxL3C7.setSelected(true);
                    checkBoxL3C8.setSelected(true);
                }
            }
        });

        //checks/unchecks all checkBoxes from fourth line
        allL4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkBoxL4C1.isSelected()
                        && checkBoxL4C2.isSelected()
                        && checkBoxL4C3.isSelected()
                        && checkBoxL4C4.isSelected()
                        && checkBoxL4C5.isSelected()
                        && checkBoxL4C6.isSelected()
                        && checkBoxL4C7.isSelected()
                        && checkBoxL4C8.isSelected())
                {
                    checkBoxL4C1.setSelected(false);
                    checkBoxL4C2.setSelected(false);
                    checkBoxL4C3.setSelected(false);
                    checkBoxL4C4.setSelected(false);
                    checkBoxL4C5.setSelected(false);
                    checkBoxL4C6.setSelected(false);
                    checkBoxL4C7.setSelected(false);
                    checkBoxL4C8.setSelected(false);
                }
                else
                {
                    checkBoxL4C1.setSelected(true);
                    checkBoxL4C2.setSelected(true);
                    checkBoxL4C3.setSelected(true);
                    checkBoxL4C4.setSelected(true);
                    checkBoxL4C5.setSelected(true);
                    checkBoxL4C6.setSelected(true);
                    checkBoxL4C7.setSelected(true);
                    checkBoxL4C8.setSelected(true);
                }
            }
        });

        //actions to generate pass
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO add information if there is no checkboxes checked

                //TODO asynchronic generation and painting progress bar
                genInfoLabel.setVisible(true);
                progressBar1.setVisible(true);
                copyGeneratedPassButton.setEnabled(true);
                generatedPassTextPane.setText(new Generator().generatePass());
                generatedPassStrengthLabel.setText(new PassStrenghtAnalyzer().passStrength());
                }
        });

        //copies generated password to clipboard
        copyGeneratedPassButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringSelection stringToClipboard = new StringSelection(generatedPassTextPane.getText());
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringToClipboard,null);
            }
        });


        //**********CREATOR**********//

        //actions to create pass
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO add info if there is no words to create from

                copyCreatedPassButton.setEnabled(true);
                createdPassTextPane.setText(new Creator().createPass());
                createdPassStrengthLabel.setText(new PassStrenghtAnalyzer().passStrength());
            }
        });

        //copies created password to clipboard
        copyCreatedPassButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringSelection stringToClipboard = new StringSelection(createdPassTextPane.getText());
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringToClipboard,null);
            }
        });


        //**********ENHANCER**********//

        //actions to enhance pass
        enhancePassButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO add info if there is no pass to enhance

                copyEnhancedPassButton.setEnabled(true);
                enhancedPassTextPane.setText(new Enhancer().enhancePass());
                enhancedPassStrengthLabel.setText(new PassStrenghtAnalyzer().passStrength());
                oldPassSthenghtLabel.setText(new PassStrenghtAnalyzer().passStrength());
            }
        });

        //copies enhanced password to clipboard
        copyEnhancedPassButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringSelection stringToClipboard = new StringSelection(enhancedPassTextPane.getText());
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringToClipboard,null);
            }
        });

    }

}

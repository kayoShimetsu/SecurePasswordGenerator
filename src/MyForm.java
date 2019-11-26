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
    private JLabel genInfoLabel;
    private JTextPane generatedPassTextPane;
    private JButton copyGeneratedPassButton;
    private JLabel creatorInfoJLabel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JLabel oldPassStrenghtLabel;
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
    private JTextField passToEnhanceTextField;


    public MyForm() {
        //TODO set panel components visibility

        //----------GENERATOR----------//

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
                if (checkBoxL1C1.isSelected()
                        && checkBoxL1C2.isSelected()
                        && checkBoxL1C3.isSelected()
                        && checkBoxL1C4.isSelected()
                        && checkBoxL1C5.isSelected()
                        && checkBoxL1C6.isSelected()
                        && checkBoxL1C7.isSelected()
                        && checkBoxL1C8.isSelected()) {
                    checkBoxL1C1.setSelected(false);
                    checkBoxL1C2.setSelected(false);
                    checkBoxL1C3.setSelected(false);
                    checkBoxL1C4.setSelected(false);
                    checkBoxL1C5.setSelected(false);
                    checkBoxL1C6.setSelected(false);
                    checkBoxL1C7.setSelected(false);
                    checkBoxL1C8.setSelected(false);
                } else {
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
                if (checkBoxL2C1.isSelected()
                        && checkBoxL2C2.isSelected()
                        && checkBoxL2C3.isSelected()
                        && checkBoxL2C4.isSelected()
                        && checkBoxL2C5.isSelected()
                        && checkBoxL2C6.isSelected()
                        && checkBoxL2C7.isSelected()
                        && checkBoxL2C8.isSelected()) {
                    checkBoxL2C1.setSelected(false);
                    checkBoxL2C2.setSelected(false);
                    checkBoxL2C3.setSelected(false);
                    checkBoxL2C4.setSelected(false);
                    checkBoxL2C5.setSelected(false);
                    checkBoxL2C6.setSelected(false);
                    checkBoxL2C7.setSelected(false);
                    checkBoxL2C8.setSelected(false);
                } else {
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
                if (checkBoxL3C1.isSelected()
                        && checkBoxL3C2.isSelected()
                        && checkBoxL3C3.isSelected()
                        && checkBoxL3C4.isSelected()
                        && checkBoxL3C5.isSelected()
                        && checkBoxL3C6.isSelected()
                        && checkBoxL3C7.isSelected()
                        && checkBoxL3C8.isSelected()) {
                    checkBoxL3C1.setSelected(false);
                    checkBoxL3C2.setSelected(false);
                    checkBoxL3C3.setSelected(false);
                    checkBoxL3C4.setSelected(false);
                    checkBoxL3C5.setSelected(false);
                    checkBoxL3C6.setSelected(false);
                    checkBoxL3C7.setSelected(false);
                    checkBoxL3C8.setSelected(false);
                } else {
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
                if (checkBoxL4C1.isSelected()
                        && checkBoxL4C2.isSelected()
                        && checkBoxL4C3.isSelected()
                        && checkBoxL4C4.isSelected()
                        && checkBoxL4C5.isSelected()
                        && checkBoxL4C6.isSelected()
                        && checkBoxL4C7.isSelected()
                        && checkBoxL4C8.isSelected()) {
                    checkBoxL4C1.setSelected(false);
                    checkBoxL4C2.setSelected(false);
                    checkBoxL4C3.setSelected(false);
                    checkBoxL4C4.setSelected(false);
                    checkBoxL4C5.setSelected(false);
                    checkBoxL4C6.setSelected(false);
                    checkBoxL4C7.setSelected(false);
                    checkBoxL4C8.setSelected(false);
                } else {
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

                Generator generator = new Generator(passLengthSlider.getValue(),
                        aZCheckBox.isSelected(),
                        aZCheckBox2.isSelected(),
                        a09CheckBox.isSelected(),
                        sPolishCharsCheckBox.isSelected(),
                        bPolishCharsCheckBox.isSelected(),
                        getSpecialChars());

                try {
                    generatedPassTextPane.setText("naciśnij generuj aby wygenerować hasło");
                    generatedPassStrengthLabel.setText("Siła hasła: ");
                    copyGeneratedPassButton.setEnabled(false);

                    generatedPassTextPane.setText(generator.generatePass());
                    copyGeneratedPassButton.setEnabled(true);
                    generatedPassStrengthLabel.setText(new PassStrenghtAnalyzer(generatedPassTextPane.getText()).passStrength());
                }
                catch(Exception ex)
                {
                    generatedPassTextPane.setText("Nie zaznaczono znaków!");
                }
            }
        });

        //copies generated password to clipboard
        copyGeneratedPassButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringSelection stringToClipboard = new StringSelection(generatedPassTextPane.getText());
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringToClipboard, null);
            }
        });


        //----------CREATOR----------//

        //actions to create pass
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textField1.getText().equals("")
                        && textField2.getText().equals("")
                        && textField3.getText().equals("")
                        && textField4.getText().equals("")
                        && textField5.getText().equals("")) {
                    createdPassTextPane.setText("wypełnij przynajmniej jedno pole");
                    createdPassStrengthLabel.setText("Siła hasła: ");
                    copyCreatedPassButton.setEnabled(false);
                }
                else {
                    createdPassTextPane.setText(new Creator(textField1.getText(),
                            textField2.getText(),
                            textField3.getText(),
                            textField4.getText(),
                            textField5.getText())
                            .createPass());
                    createdPassStrengthLabel.setText(new PassStrenghtAnalyzer(createdPassTextPane.getText()).passStrength());
                    copyCreatedPassButton.setEnabled(true);
                }
            }
        });

        //copies created password to clipboard
        copyCreatedPassButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringSelection stringToClipboard = new StringSelection(createdPassTextPane.getText());
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringToClipboard, null);
            }
        });


        //----------ENHANCER----------//

        //actions to enhance pass
        enhancePassButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO add info if there is no pass to enhance

                if(passToEnhanceTextField.getText().equals("")) {
                    enhancedPassTextPane.setText("wypełnij pole tekstowe");
                    copyEnhancedPassButton.setEnabled(false);
                    enhancedPassStrengthLabel.setText("Siła hasła: ");
                    oldPassStrenghtLabel.setText("Siła hasła: ");
                }
                else {
                    enhancedPassTextPane.setText(new Enhancer(passToEnhanceTextField.getText()).enhancePass());
                    copyEnhancedPassButton.setEnabled(true);
                    enhancedPassStrengthLabel.setText(new PassStrenghtAnalyzer(enhancedPassTextPane.getText()).passStrength());
                    oldPassStrenghtLabel.setText(new PassStrenghtAnalyzer(passToEnhanceTextField.getText()).passStrength());
                }
            }
        });

        //copies enhanced password to clipboard
        copyEnhancedPassButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringSelection stringToClipboard = new StringSelection(enhancedPassTextPane.getText());
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringToClipboard, null);
            }
        });

    }

    String getSpecialChars() {
        String special = "";

        if (checkBoxL1C1.isSelected()) special += checkBoxL1C1.getText();
        if (checkBoxL1C2.isSelected()) special += checkBoxL1C2.getText();
        if (checkBoxL1C3.isSelected()) special += checkBoxL1C3.getText();
        if (checkBoxL1C4.isSelected()) special += checkBoxL1C4.getText();
        if (checkBoxL1C5.isSelected()) special += checkBoxL1C5.getText();
        if (checkBoxL1C6.isSelected()) special += checkBoxL1C6.getText();
        if (checkBoxL1C7.isSelected()) special += checkBoxL1C7.getText();
        if (checkBoxL1C8.isSelected()) special += checkBoxL1C8.getText();
        if (checkBoxL2C1.isSelected()) special += checkBoxL2C1.getText();
        if (checkBoxL2C2.isSelected()) special += checkBoxL2C2.getText();
        if (checkBoxL2C3.isSelected()) special += checkBoxL2C3.getText();
        if (checkBoxL2C4.isSelected()) special += checkBoxL2C4.getText();
        if (checkBoxL2C5.isSelected()) special += checkBoxL2C5.getText();
        if (checkBoxL2C6.isSelected()) special += checkBoxL2C6.getText();
        if (checkBoxL2C7.isSelected()) special += checkBoxL2C7.getText();
        if (checkBoxL2C8.isSelected()) special += checkBoxL2C8.getText();
        if (checkBoxL3C1.isSelected()) special += checkBoxL3C1.getText();
        if (checkBoxL3C2.isSelected()) special += checkBoxL3C2.getText();
        if (checkBoxL3C3.isSelected()) special += checkBoxL3C3.getText();
        if (checkBoxL3C4.isSelected()) special += checkBoxL3C4.getText();
        if (checkBoxL3C5.isSelected()) special += checkBoxL3C5.getText();
        if (checkBoxL3C6.isSelected()) special += checkBoxL3C6.getText();
        if (checkBoxL3C7.isSelected()) special += checkBoxL3C7.getText();
        if (checkBoxL3C8.isSelected()) special += checkBoxL3C8.getText();
        if (checkBoxL4C1.isSelected()) special += checkBoxL4C1.getText();
        if (checkBoxL4C2.isSelected()) special += checkBoxL4C2.getText();
        if (checkBoxL4C3.isSelected()) special += checkBoxL4C3.getText();
        if (checkBoxL4C4.isSelected()) special += checkBoxL4C4.getText();
        if (checkBoxL4C5.isSelected()) special += checkBoxL4C5.getText();
        if (checkBoxL4C6.isSelected()) special += checkBoxL4C6.getText();
        if (checkBoxL4C7.isSelected()) special += checkBoxL4C7.getText();
        if (checkBoxL4C8.isSelected()) special += checkBoxL4C8.getText();

        return special;
    }

    /*{
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
   /* private void $$$setupUI$$$() {
        jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout(0, 0));
        jPanel.setEnabled(true);
        tabbedPane1 = new JTabbedPane();
        jPanel.add(tabbedPane1, BorderLayout.CENTER);
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout(0, 0));
        tabbedPane1.addTab("Generator losowy", panel1);
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridBagLayout());
        panel1.add(panel2, BorderLayout.NORTH);
        passLengthSlider = new JSlider();
        passLengthSlider.setInverted(false);
        passLengthSlider.setMajorTickSpacing(7);
        passLengthSlider.setMaximum(50);
        passLengthSlider.setMinimum(8);
        passLengthSlider.setMinorTickSpacing(0);
        passLengthSlider.setPaintLabels(true);
        passLengthSlider.setPaintTicks(true);
        passLengthSlider.setSnapToTicks(false);
        passLengthSlider.setToolTipText("Wskazuje ilość znaków generowanego hasła");
        passLengthSlider.setValue(8);
        passLengthSlider.setValueIsAdjusting(false);
        passLengthSlider.putClientProperty("JSlider.isFilled", Boolean.TRUE);
        passLengthSlider.putClientProperty("Slider.paintThumbArrowShape", Boolean.FALSE);
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel2.add(passLengthSlider, gbc);
        final JPanel spacer1 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel2.add(spacer1, gbc);
        final JPanel spacer2 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(spacer2, gbc);
        final JPanel spacer3 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(spacer3, gbc);
        final JPanel spacer4 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel2.add(spacer4, gbc);
        passLengthLabel = new JLabel();
        passLengthLabel.setText("długość hasła");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel2.add(passLengthLabel, gbc);
        final JPanel spacer5 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(spacer5, gbc);
        charsLabel = new JLabel();
        charsLabel.setText("znaków");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel2.add(charsLabel, gbc);
        final JPanel spacer6 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(spacer6, gbc);
        sliderValueLabel = new JLabel();
        sliderValueLabel.setPreferredSize(new Dimension(16, 16));
        sliderValueLabel.setText("8");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 1;
        panel2.add(sliderValueLabel, gbc);
        final JPanel spacer7 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(spacer7, gbc);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridBagLayout());
        panel1.add(panel3, BorderLayout.CENTER);
        aZCheckBox = new JCheckBox();
        aZCheckBox.setRequestFocusEnabled(false);
        aZCheckBox.setText("a-z");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        panel3.add(aZCheckBox, gbc);
        sPolishCharsCheckBox = new JCheckBox();
        sPolishCharsCheckBox.setRequestFocusEnabled(false);
        sPolishCharsCheckBox.setText("ą-ż");
        gbc = new GridBagConstraints();
        gbc.gridx = 10;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        panel3.add(sPolishCharsCheckBox, gbc);
        a09CheckBox = new JCheckBox();
        a09CheckBox.setRequestFocusEnabled(false);
        a09CheckBox.setText("0-9");
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        panel3.add(a09CheckBox, gbc);
        aZCheckBox2 = new JCheckBox();
        aZCheckBox2.setRequestFocusEnabled(false);
        aZCheckBox2.setText("A-Z");
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        panel3.add(aZCheckBox2, gbc);
        final JPanel spacer8 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        panel3.add(spacer8, gbc);
        final JPanel spacer9 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(spacer9, gbc);
        final JPanel spacer10 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        panel3.add(spacer10, gbc);
        final JPanel spacer11 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        panel3.add(spacer11, gbc);
        checkBoxL1C3 = new JCheckBox();
        checkBoxL1C3.setRequestFocusEnabled(false);
        checkBoxL1C3.setText("#");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL1C3, gbc);
        checkBoxL1C4 = new JCheckBox();
        checkBoxL1C4.setRequestFocusEnabled(false);
        checkBoxL1C4.setText("$");
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL1C4, gbc);
        checkBoxL1C5 = new JCheckBox();
        checkBoxL1C5.setRequestFocusEnabled(false);
        checkBoxL1C5.setText("%");
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL1C5, gbc);
        checkBoxL1C6 = new JCheckBox();
        checkBoxL1C6.setRequestFocusEnabled(false);
        checkBoxL1C6.setText("^");
        gbc = new GridBagConstraints();
        gbc.gridx = 10;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL1C6, gbc);
        checkBoxL1C2 = new JCheckBox();
        checkBoxL1C2.setRequestFocusEnabled(false);
        checkBoxL1C2.setText("@");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL1C2, gbc);
        checkBoxL1C1 = new JCheckBox();
        checkBoxL1C1.setRequestFocusEnabled(false);
        checkBoxL1C1.setText("!");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL1C1, gbc);
        checkBoxL1C8 = new JCheckBox();
        checkBoxL1C8.setRequestFocusEnabled(false);
        checkBoxL1C8.setText("*");
        gbc = new GridBagConstraints();
        gbc.gridx = 14;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL1C8, gbc);
        checkBoxL1C7 = new JCheckBox();
        checkBoxL1C7.setRequestFocusEnabled(false);
        checkBoxL1C7.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL1C7, gbc);
        bPolishCharsCheckBox = new JCheckBox();
        bPolishCharsCheckBox.setRequestFocusEnabled(false);
        bPolishCharsCheckBox.setText("Ą-Ż");
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        panel3.add(bPolishCharsCheckBox, gbc);
        final JPanel spacer12 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(spacer12, gbc);
        final JPanel spacer13 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(spacer13, gbc);
        final JPanel spacer14 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 13;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(spacer14, gbc);
        final JPanel spacer15 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(spacer15, gbc);
        checkBoxL2C1 = new JCheckBox();
        checkBoxL2C1.setRequestFocusEnabled(false);
        checkBoxL2C1.setText("(");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL2C1, gbc);
        checkBoxL2C2 = new JCheckBox();
        checkBoxL2C2.setRequestFocusEnabled(false);
        checkBoxL2C2.setText(")");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL2C2, gbc);
        checkBoxL2C3 = new JCheckBox();
        checkBoxL2C3.setRequestFocusEnabled(false);
        checkBoxL2C3.setText("[");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL2C3, gbc);
        checkBoxL2C4 = new JCheckBox();
        checkBoxL2C4.setRequestFocusEnabled(false);
        checkBoxL2C4.setText("]");
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL2C4, gbc);
        checkBoxL2C5 = new JCheckBox();
        checkBoxL2C5.setRequestFocusEnabled(false);
        checkBoxL2C5.setText("{");
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL2C5, gbc);
        checkBoxL2C6 = new JCheckBox();
        checkBoxL2C6.setRequestFocusEnabled(false);
        checkBoxL2C6.setText("}");
        gbc = new GridBagConstraints();
        gbc.gridx = 10;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL2C6, gbc);
        checkBoxL2C7 = new JCheckBox();
        checkBoxL2C7.setRequestFocusEnabled(false);
        checkBoxL2C7.setText("<");
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL2C7, gbc);
        checkBoxL2C8 = new JCheckBox();
        checkBoxL2C8.setRequestFocusEnabled(false);
        checkBoxL2C8.setText(">");
        gbc = new GridBagConstraints();
        gbc.gridx = 14;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL2C8, gbc);
        checkBoxL3C1 = new JCheckBox();
        checkBoxL3C1.setRequestFocusEnabled(false);
        checkBoxL3C1.setText(";");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL3C1, gbc);
        checkBoxL4C1 = new JCheckBox();
        checkBoxL4C1.setRequestFocusEnabled(false);
        checkBoxL4C1.setText("~");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL4C1, gbc);
        checkBoxL3C2 = new JCheckBox();
        checkBoxL3C2.setRequestFocusEnabled(false);
        checkBoxL3C2.setText(":");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL3C2, gbc);
        checkBoxL4C2 = new JCheckBox();
        checkBoxL4C2.setRequestFocusEnabled(false);
        checkBoxL4C2.setSelected(false);
        checkBoxL4C2.setText("-");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL4C2, gbc);
        checkBoxL3C3 = new JCheckBox();
        checkBoxL3C3.setRequestFocusEnabled(false);
        checkBoxL3C3.setText("'");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL3C3, gbc);
        checkBoxL4C3 = new JCheckBox();
        checkBoxL4C3.setRequestFocusEnabled(false);
        checkBoxL4C3.setText("_");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL4C3, gbc);
        checkBoxL3C4 = new JCheckBox();
        checkBoxL3C4.setRequestFocusEnabled(false);
        checkBoxL3C4.setText("\"");
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL3C4, gbc);
        checkBoxL4C4 = new JCheckBox();
        checkBoxL4C4.setRequestFocusEnabled(false);
        checkBoxL4C4.setText("=");
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL4C4, gbc);
        checkBoxL3C5 = new JCheckBox();
        checkBoxL3C5.setRequestFocusEnabled(false);
        checkBoxL3C5.setText(",");
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL3C5, gbc);
        checkBoxL4C5 = new JCheckBox();
        checkBoxL4C5.setRequestFocusEnabled(false);
        checkBoxL4C5.setText("+");
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL4C5, gbc);
        checkBoxL3C6 = new JCheckBox();
        checkBoxL3C6.setRequestFocusEnabled(false);
        checkBoxL3C6.setText(".");
        gbc = new GridBagConstraints();
        gbc.gridx = 10;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL3C6, gbc);
        checkBoxL4C6 = new JCheckBox();
        checkBoxL4C6.setRequestFocusEnabled(false);
        checkBoxL4C6.setText("\\");
        gbc = new GridBagConstraints();
        gbc.gridx = 10;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL4C6, gbc);
        checkBoxL4C7 = new JCheckBox();
        checkBoxL4C7.setRequestFocusEnabled(false);
        checkBoxL4C7.setText("/");
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL4C7, gbc);
        checkBoxL3C7 = new JCheckBox();
        checkBoxL3C7.setRequestFocusEnabled(false);
        checkBoxL3C7.setText("`");
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL3C7, gbc);
        checkBoxL3C8 = new JCheckBox();
        checkBoxL3C8.setRequestFocusEnabled(false);
        checkBoxL3C8.setText("?");
        gbc = new GridBagConstraints();
        gbc.gridx = 14;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL3C8, gbc);
        checkBoxL4C8 = new JCheckBox();
        checkBoxL4C8.setRequestFocusEnabled(false);
        checkBoxL4C8.setText("|");
        gbc = new GridBagConstraints();
        gbc.gridx = 14;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBoxL4C8, gbc);
        allL1Button = new JButton();
        allL1Button.setFocusPainted(false);
        allL1Button.setFocusable(true);
        allL1Button.setMargin(new Insets(2, 2, 2, 2));
        allL1Button.setMaximumSize(new Dimension(76, 23));
        allL1Button.setMinimumSize(new Dimension(76, 23));
        allL1Button.setPreferredSize(new Dimension(76, 23));
        allL1Button.setText("wszystkie");
        allL1Button.setVisible(true);
        gbc = new GridBagConstraints();
        gbc.gridx = 16;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(allL1Button, gbc);
        allL2Button = new JButton();
        allL2Button.setFocusPainted(false);
        allL2Button.setFocusable(true);
        allL2Button.setMargin(new Insets(2, 2, 2, 2));
        allL2Button.setMaximumSize(new Dimension(76, 23));
        allL2Button.setMinimumSize(new Dimension(76, 23));
        allL2Button.setPreferredSize(new Dimension(76, 23));
        allL2Button.setText("wszystkie");
        allL2Button.setVisible(true);
        gbc = new GridBagConstraints();
        gbc.gridx = 16;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(allL2Button, gbc);
        allL3Button = new JButton();
        allL3Button.setFocusPainted(false);
        allL3Button.setFocusable(true);
        allL3Button.setMargin(new Insets(2, 2, 2, 2));
        allL3Button.setMaximumSize(new Dimension(76, 23));
        allL3Button.setMinimumSize(new Dimension(76, 23));
        allL3Button.setPreferredSize(new Dimension(76, 23));
        allL3Button.setText("wszystkie");
        allL3Button.setVisible(true);
        gbc = new GridBagConstraints();
        gbc.gridx = 16;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(allL3Button, gbc);
        allL4Button = new JButton();
        allL4Button.setFocusPainted(false);
        allL4Button.setFocusable(true);
        allL4Button.setMargin(new Insets(2, 2, 2, 2));
        allL4Button.setMaximumSize(new Dimension(76, 23));
        allL4Button.setMinimumSize(new Dimension(76, 23));
        allL4Button.setPreferredSize(new Dimension(76, 23));
        allL4Button.setText("wszystkie");
        allL4Button.setVisible(true);
        gbc = new GridBagConstraints();
        gbc.gridx = 16;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(allL4Button, gbc);
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new GridBagLayout());
        panel4.setEnabled(true);
        panel4.setMaximumSize(new Dimension(456, 142));
        panel4.setMinimumSize(new Dimension(456, 142));
        panel4.setPreferredSize(new Dimension(456, 142));
        panel1.add(panel4, BorderLayout.SOUTH);
        generateButton = new JButton();
        generateButton.setFocusPainted(false);
        generateButton.setHideActionText(true);
        generateButton.setText("GENERUJ");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.ipadx = 90;
        panel4.add(generateButton, gbc);
        final JPanel spacer16 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel4.add(spacer16, gbc);
        genInfoLabel = new JLabel();
        genInfoLabel.setEnabled(false);
        genInfoLabel.setText("UWAGA! By wspomóc generowanie hasła, poruszaj kursorem w oknie generatora.");
        genInfoLabel.setVisible(false);
        genInfoLabel.putClientProperty("html.disable", Boolean.FALSE);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        panel4.add(genInfoLabel, gbc);
        progressBar1 = new JProgressBar();
        progressBar1.setVisible(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel4.add(progressBar1, gbc);
        copyGeneratedPassButton = new JButton();
        copyGeneratedPassButton.setEnabled(false);
        copyGeneratedPassButton.setFocusPainted(false);
        copyGeneratedPassButton.setText("kopiuj");
        copyGeneratedPassButton.setVisible(true);
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.ipadx = 25;
        panel4.add(copyGeneratedPassButton, gbc);
        final JPanel spacer17 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel4.add(spacer17, gbc);
        final JPanel spacer18 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel4.add(spacer18, gbc);
        generatedPassTextPane = new JTextPane();
        generatedPassTextPane.setEditable(false);
        generatedPassTextPane.setText("naciśnij generuj aby wygenerować hasło");
        generatedPassTextPane.setVisible(true);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.weightx = 1.0;
        panel4.add(generatedPassTextPane, gbc);
        final JPanel spacer19 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel4.add(spacer19, gbc);
        final JPanel spacer20 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel4.add(spacer20, gbc);
        final JPanel spacer21 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel4.add(spacer21, gbc);
        generatedPassStrengthLabel = new JLabel();
        generatedPassStrengthLabel.setText("Siła hasła: ");
        generatedPassStrengthLabel.setVisible(true);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        panel4.add(generatedPassStrengthLabel, gbc);
        final JPanel panel5 = new JPanel();
        panel5.setLayout(new GridBagLayout());
        panel5.setOpaque(true);
        panel5.setPreferredSize(new Dimension(300, 206));
        tabbedPane1.addTab("Kreator", panel5);
        creatorInfoJLabel = new JLabel();
        creatorInfoJLabel.setText("Wpisz składowe hasła");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel5.add(creatorInfoJLabel, gbc);
        textField1 = new JTextField();
        textField1.setColumns(0);
        textField1.setHorizontalAlignment(0);
        textField1.setMaximumSize(new Dimension(250, 24));
        textField1.setMinimumSize(new Dimension(250, 24));
        textField1.setPreferredSize(new Dimension(250, 24));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        panel5.add(textField1, gbc);
        textField2 = new JTextField();
        textField2.setColumns(0);
        textField2.setHorizontalAlignment(0);
        textField2.setMaximumSize(new Dimension(250, 24));
        textField2.setMinimumSize(new Dimension(250, 24));
        textField2.setPreferredSize(new Dimension(250, 24));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        panel5.add(textField2, gbc);
        textField3 = new JTextField();
        textField3.setColumns(0);
        textField3.setHorizontalAlignment(0);
        textField3.setInheritsPopupMenu(false);
        textField3.setMaximumSize(new Dimension(250, 24));
        textField3.setMinimumSize(new Dimension(250, 24));
        textField3.setPreferredSize(new Dimension(250, 24));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        panel5.add(textField3, gbc);
        textField4 = new JTextField();
        textField4.setColumns(0);
        textField4.setHorizontalAlignment(0);
        textField4.setMaximumSize(new Dimension(250, 24));
        textField4.setMinimumSize(new Dimension(250, 24));
        textField4.setPreferredSize(new Dimension(250, 24));
        textField4.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.weightx = 1.0;
        panel5.add(textField4, gbc);
        textField5 = new JTextField();
        textField5.setColumns(0);
        textField5.setDragEnabled(false);
        textField5.setHorizontalAlignment(0);
        textField5.setMaximumSize(new Dimension(250, 24));
        textField5.setMinimumSize(new Dimension(250, 24));
        textField5.setOpaque(true);
        textField5.setPreferredSize(new Dimension(250, 24));
        textField5.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 10;
        gbc.weightx = 1.0;
        panel5.add(textField5, gbc);
        final JPanel spacer22 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel5.add(spacer22, gbc);
        final JPanel spacer23 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel5.add(spacer23, gbc);
        final JPanel spacer24 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel5.add(spacer24, gbc);
        final JPanel spacer25 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel5.add(spacer25, gbc);
        final JPanel spacer26 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 9;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel5.add(spacer26, gbc);
        final JPanel spacer27 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel5.add(spacer27, gbc);
        final JPanel spacer28 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel5.add(spacer28, gbc);
        final JPanel panel6 = new JPanel();
        panel6.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 11;
        panel5.add(panel6, gbc);
        createButton = new JButton();
        createButton.setFocusPainted(false);
        createButton.setHideActionText(true);
        createButton.setText("KREUJ");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.ipadx = 90;
        panel6.add(createButton, gbc);
        final JPanel spacer29 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel6.add(spacer29, gbc);
        copyCreatedPassButton = new JButton();
        copyCreatedPassButton.setEnabled(false);
        copyCreatedPassButton.setFocusPainted(false);
        copyCreatedPassButton.setText("kopiuj");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 25;
        panel6.add(copyCreatedPassButton, gbc);
        final JPanel spacer30 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel6.add(spacer30, gbc);
        final JPanel spacer31 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel6.add(spacer31, gbc);
        createdPassTextPane = new JTextPane();
        createdPassTextPane.setEditable(false);
        createdPassTextPane.setMaximumSize(new Dimension(400, 22));
        createdPassTextPane.setMinimumSize(new Dimension(300, 22));
        createdPassTextPane.setPreferredSize(new Dimension(300, 22));
        createdPassTextPane.setText("miejsce na wykreowane hasło");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        panel6.add(createdPassTextPane, gbc);
        final JPanel spacer32 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel6.add(spacer32, gbc);
        final JPanel spacer33 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel6.add(spacer33, gbc);
        createdPassStrengthLabel = new JLabel();
        createdPassStrengthLabel.setText("Siła hasła: ");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        panel6.add(createdPassStrengthLabel, gbc);
        final JPanel spacer34 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel6.add(spacer34, gbc);
        final JPanel panel7 = new JPanel();
        panel7.setLayout(new GridBagLayout());
        tabbedPane1.addTab("Wzmacniacz", panel7);
        final JPanel spacer35 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel7.add(spacer35, gbc);
        final JPanel spacer36 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel7.add(spacer36, gbc);
        final JPanel spacer37 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.ipady = 30;
        panel7.add(spacer37, gbc);
        final JLabel label1 = new JLabel();
        label1.setText("Wpisz hasło");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel7.add(label1, gbc);
        passToEnhanceTextField = new JTextField();
        passToEnhanceTextField.setColumns(0);
        passToEnhanceTextField.setHorizontalAlignment(0);
        passToEnhanceTextField.setMaximumSize(new Dimension(250, 24));
        passToEnhanceTextField.setMinimumSize(new Dimension(250, 24));
        passToEnhanceTextField.setPreferredSize(new Dimension(250, 24));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        panel7.add(passToEnhanceTextField, gbc);
        final JPanel spacer38 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel7.add(spacer38, gbc);
        oldPassStrenghtLabel = new JLabel();
        oldPassStrenghtLabel.setText("Siła hasła: ");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel7.add(oldPassStrenghtLabel, gbc);
        final JPanel panel8 = new JPanel();
        panel8.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        panel7.add(panel8, gbc);
        enhancePassButton = new JButton();
        enhancePassButton.setFocusPainted(false);
        enhancePassButton.setHideActionText(true);
        enhancePassButton.setText("WZMOCNIJ");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.ipadx = 90;
        panel8.add(enhancePassButton, gbc);
        final JPanel spacer39 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.ipady = 35;
        panel8.add(spacer39, gbc);
        copyEnhancedPassButton = new JButton();
        copyEnhancedPassButton.setEnabled(false);
        copyEnhancedPassButton.setFocusPainted(false);
        copyEnhancedPassButton.setText("kopiuj");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 25;
        panel8.add(copyEnhancedPassButton, gbc);
        final JPanel spacer40 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel8.add(spacer40, gbc);
        final JPanel spacer41 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel8.add(spacer41, gbc);
        enhancedPassTextPane = new JTextPane();
        enhancedPassTextPane.setEditable(false);
        enhancedPassTextPane.setMaximumSize(new Dimension(400, 22));
        enhancedPassTextPane.setMinimumSize(new Dimension(300, 22));
        enhancedPassTextPane.setPreferredSize(new Dimension(300, 22));
        enhancedPassTextPane.setText("miejsce na wzmocnione hasło");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        panel8.add(enhancedPassTextPane, gbc);
        final JPanel spacer42 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel8.add(spacer42, gbc);
        final JPanel spacer43 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel8.add(spacer43, gbc);
        enhancedPassStrengthLabel = new JLabel();
        enhancedPassStrengthLabel.setText("Siła hasła: ");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        panel8.add(enhancedPassStrengthLabel, gbc);
        final JPanel spacer44 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel8.add(spacer44, gbc);
        final JPanel panel9 = new JPanel();
        panel9.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPane1.addTab("Info", panel9);
        final JSeparator separator1 = new JSeparator();
        panel9.add(separator1, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JScrollPane scrollPane1 = new JScrollPane();
        scrollPane1.setHorizontalScrollBarPolicy(30);
        scrollPane1.setVerticalScrollBarPolicy(20);
        panel9.add(scrollPane1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        scrollPane1.setBorder(BorderFactory.createTitledBorder("Jak korzystać? "));
        ogólnieWyjaśnieniePoCoTextPane = new JTextPane();
        ogólnieWyjaśnieniePoCoTextPane.setEditable(false);
        ogólnieWyjaśnieniePoCoTextPane.setText("Ogólnie wyjaśnienie po co i do czego, jak korzystać z każdego komponentu, oraz tip'y jak posługiwać się hasłami.");
        ogólnieWyjaśnieniePoCoTextPane.putClientProperty("JEditorPane.w3cLengthUnits", Boolean.FALSE);
        scrollPane1.setViewportView(ogólnieWyjaśnieniePoCoTextPane);
        final JScrollPane scrollPane2 = new JScrollPane();
        panel9.add(scrollPane2, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        scrollPane2.setBorder(BorderFactory.createTitledBorder("Informacje o aplikacji"));
        final JLabel label2 = new JLabel();
        label2.setText("Secure Password Generator v 1.0");
        scrollPane2.setViewportView(label2);
    }

    /**
     * @noinspection ALL
     */
    /*public JComponent $$$getRootComponent$$$() {
        return jPanel;
    } */
}

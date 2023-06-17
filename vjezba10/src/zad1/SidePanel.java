package zad1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class SidePanel extends JPanel {

    private JButton submitButton;
    private SidePanelListener sidePanelListener;
    private JTextField textField;
    private JButton resetButton;

    public SidePanel(){
        initPanelComps();
        layoutComps();
    }

    private void initPanelComps(){
        Dimension dim = this.getPreferredSize();
        dim.width = 150;
        submitButton = new JButton("Submit text");
        textField = new JTextField(10);
        resetButton = new JButton("Reset");
    }

    private void layoutComps(){
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.gridy = 0;
        gc.gridx = 0;
        add(new JLabel("Text"), gc);
        gc.gridy++;
        add(textField, gc);
        gc.gridy++;
        Component bx = Box.createVerticalStrut(250);
        add(bx, gc);
        add(submitButton, gc);
        gc.gridy++;
        Component bx2 = Box.createVerticalStrut(10);
        add(bx2, gc);
        add(resetButton, gc);

    }

    public void setSidePanelListener(SidePanelListener spl){
        this.sidePanelListener = spl;
    }

    public void activateSidePanel(){
        if (sidePanelListener != null) {
            submitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text = textField.getText();
                    if (Objects.equals(text, "")){
                        String message = "You have entered nothing!";
                        String title = "No entry alert";
                        JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    SidePanelEvent spe = new SidePanelEvent(this, text + "\n");
                    sidePanelListener.submitButtonEventOccurred(spe);
                    spe.setSubmitClicked(true);
                    resetForm();
                }
            });
            resetButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    SidePanelEvent spe = new SidePanelEvent(this, "");
                    spe.setResetClicked(true);
                    sidePanelListener.resetButtonEventOccurred(spe);
                    resetForm();
                }
            });
        }
    }

    public void resetForm(){
        textField.setText("");
    }
}


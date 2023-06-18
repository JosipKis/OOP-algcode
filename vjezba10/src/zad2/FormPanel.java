package zad2;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class FormPanel extends JPanel implements ActionListener {

    private JTextField kredit;
    private JTextField godina;
    private JComboBox<String> comboBox;
    private JRadioButton monthlyButton;
    private JRadioButton quarterlyButton;
    private JButton display;
    private JButton calculate;
    private DefaultComboBoxModel<String> comboBoxModel;
    private ButtonGroup radioGroup;
    private FormListener formPanelListener;

    public FormPanel() {

        setPreferredSize(new Dimension(MainFrame.WIDTH/2, MainFrame.HEIGHT));
        initComps();
        layoutComps();
        activateFrame();
    }
    private void initComps() {

        kredit = new JTextField();
        godina = new JTextField();
        comboBox = new JComboBox<>();
        monthlyButton = new JRadioButton("Monthly Payment");
        quarterlyButton = new JRadioButton("Quarterly Payment");
        display = new JButton("Display");
        calculate = new JButton("Calculate");
        comboBoxModel = new DefaultComboBoxModel<>();
        radioGroup = new ButtonGroup();
        radioGroup.add(monthlyButton);
        radioGroup.add(quarterlyButton);
        monthlyButton.setSelected(true);

        String[] arrStope = {"5%", "6%", "7%", "8%", "9%", "10%", "11%"};
        comboBox.setModel(comboBoxModel);
        comboBoxModel.addAll(List.of(arrStope));
        comboBox.setSelectedIndex(-1);
    }
    private void layoutComps() {

        setLayout(new MigLayout("insets 40 40 40 10", "[]20[]20[]", "[]20[]20[]"));
        add(new JLabel("Credit amount:"), "cell 0 0, align right");
        add(kredit, "cell 1 0, growx");
        add(new JLabel("Credit time:"), "cell 0 1");
        add(godina, "cell 1 1, wrap, gapbottom 40, growx");
        add(new JLabel("Rate"), "cell 1 2, align center, wrap");
        add(comboBox, "cell 1 3, align center, wrap, gapbottom 40");
        add(monthlyButton, "cell 1 4, wrap");
        add(quarterlyButton, "cell 1 5, wrap, gapbottom 200");
        add(display, "cell 0 6, align center, growx");
        add(calculate, "cell 2 6, align center");
    }

    private void activateFrame() {
        display.addActionListener(this);
        calculate.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (kredit.getText().isEmpty() || godina.getText().isEmpty() || comboBox.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this, "Niste unijeli sve podatke!", "Prazno polje", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Float.parseFloat(kredit.getText());
            Integer.parseInt(godina.getText());
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Kredit i godina moraju biti broj!", "It was a missinput!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String kamataString = (String) comboBox.getSelectedItem();
        float kredit = Float.parseFloat(this.kredit.getText());
        float kamata = Float.parseFloat(kamataString.replaceAll("[^0-9]", ""));
        int godina = Integer.parseInt(this.godina.getText());
        int nacin;
        if (monthlyButton.isSelected()){
            nacin = 1;
        } else {
            nacin = 3;
        }
        if (e.getSource() == display){
            formPanelListener.displayText(new Calculation(kredit, kamata, godina, nacin).toString());
        } else if (e.getSource() == calculate){
            formPanelListener.calculateKredit(Calculation.calculate(kredit, kamata, godina, nacin));
        }
    }

    public void setFormPanelListener(FormListener formPanelListener) {
        this.formPanelListener = formPanelListener;
    }
}
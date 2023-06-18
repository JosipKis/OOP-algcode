package zad2;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private DataPanel dataPanel;
    private FormPanel formPanel;
    private FormListener formPanelListener;

    public static final int WIDTH = 1000;
    public static final int HEIGHT = 800;

    public MainFrame() {
        super("Credit Calculator");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        initComps();
        layoutComps();
        activateFrame();
    }

    private void initComps() {
        dataPanel = new DataPanel();
        dataPanel.setBorder(BorderFactory.createLineBorder(Color.lightGray));

        formPanel = new FormPanel();
        formPanel.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    }

    private void layoutComps() {
        setLayout(new MigLayout("", "[grow, fill][grow, fill]", "[grow, fill]"));
        add(dataPanel, "east");
        add(formPanel, "west");
    }


    private void activateFrame() {
        formPanelListener = new FormListener() {
            @Override
            public void displayText(String text) {
                dataPanel.setData(text);
            }
            @Override
            public void calculateKredit(double totalAmount) {
                dataPanel.setRata(totalAmount);
            }
        };
        formPanel.setFormPanelListener(formPanelListener);
    }
}
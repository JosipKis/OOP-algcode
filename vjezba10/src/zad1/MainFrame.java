package zad1;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private TextArea textArea;
    private SidePanel sidePanel;

    public MainFrame(){
        setTitle("Zadatak 1");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        add(new JPanel());
        createComps();
        compsLayout();
        activateApp();
    }

    private void createComps(){
        textArea = new TextArea();
        sidePanel = new SidePanel();
    }

    private void compsLayout(){
        setLayout(new BorderLayout());
        add(textArea, BorderLayout.CENTER);
        add(sidePanel, BorderLayout.WEST);
    }

    private void activateApp(){
        sidePanel.setSidePanelListener(new SidePanelListener() {
            @Override
            public void submitButtonEventOccurred(SidePanelEvent spe) {
                String text = spe.getText();
                System.out.println(spe.getText());
                textArea.setTextAreaText(text);
            }

            @Override
            public void resetButtonEventOccurred(SidePanelEvent spe) {
                textArea.clearALl();
            }
        });
        sidePanel.activateSidePanel();
    }

}

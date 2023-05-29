package pckg_gui1_29_5;

import javax.swing.*;
import java.awt.*;

public class ToolBarPanel extends JPanel {

    private JButton clearButton;
    private JButton readFileButton;

    public ToolBarPanel(){
        initComps();
        layoutComps();
    }

    private void initComps(){
        clearButton = new JButton("Clear all");
        readFileButton = new JButton("Read from file");
    }

    private void layoutComps(){
        add(clearButton);
        add(readFileButton);
    }
}

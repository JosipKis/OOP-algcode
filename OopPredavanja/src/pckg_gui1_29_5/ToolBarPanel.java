package pckg_gui1_29_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBarPanel extends JPanel {

    private JButton clearButton;
    private JButton readFileButton;
    private ToolBarListener toolBarListener;

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

    public void setToolBarListener(ToolBarListener tbl){
        this.toolBarListener = tbl;
    }

    public void activateToolBar(){
        if (toolBarListener != null) {
            clearButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ToolBarEvent tbe = new ToolBarEvent(this);
                    tbe.setClearClicked(true);
                    tbe.setReadClicked(false);
                    toolBarListener.clearButtonEventOccurred(tbe);
                }
            });
            readFileButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ToolBarEvent tbe = new ToolBarEvent(this);
                    tbe.setReadClicked(true);
                    tbe.setClearClicked(false);
                    toolBarListener.readFromFileButtonEventOccurred(tbe);
                }
            });
        }
    }
}

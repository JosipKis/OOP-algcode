package pckg_gui1_29_5;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private ViewPanel viewPanel;
    private BottomPanel bottomPanel;
    private ToolBarPanel toolBarPanel;

    public MainFrame(){
        super("Simple GUI app");
        setSize(670, 400);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComps();
        layoutComps();
        activateApp();
    }

    private void initComps(){
        viewPanel = new ViewPanel();
        bottomPanel = new BottomPanel();
        toolBarPanel = new ToolBarPanel();
    }

    private void layoutComps(){
        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
        add(toolBarPanel, BorderLayout.NORTH);
    }

    private void activateApp(){
        bottomPanel.setBottomPanelListener(new BottomPanelListener() {
            @Override
            public void bottomPanelEventOccurred(BottomPanelEvent bpe) {
                String msg = bpe.getButtonMsg();
                viewPanel.setTextOnTextArea(msg);
            }
        });
        bottomPanel.activateComps();
    }
}

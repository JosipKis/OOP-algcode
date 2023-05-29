package pckg_gui1_29_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BottomPanel extends JPanel {

    private JButton clickButton;
    private BottomPanelListener bottomPanelListener;

    public BottomPanel(){
        initComps();
        layoutComps();
    }

    private void initComps(){
        clickButton = new JButton("Click me");
    }

    private void layoutComps(){
        setLayout(new BorderLayout());
        add(clickButton, BorderLayout.CENTER);
    }

    public void setBottomPanelListener(BottomPanelListener bpl){
        this.bottomPanelListener = bpl;
        System.out.println("Bottom panel listener: "+ (bpl != null));
    }

    public void activateComps(){
        System.out.println("Bottom panel listener: "+ (this.bottomPanelListener != null));
        if (bottomPanelListener != null){
            clickButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String msg = "Button clicked!!!";
                    BottomPanelEvent bpe = new BottomPanelEvent(this, msg);
                    bottomPanelListener.bottomPanelEventOccurred(bpe);
                    System.out.println(msg);
                }
            });
        }
    }
}

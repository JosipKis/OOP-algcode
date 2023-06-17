package zad1;

import javax.swing.*;
import java.awt.*;

public class TextArea extends JPanel{

    private JTextArea textArea;

    public TextArea(){
        initPanelComps();
        layoutComps();
    }

    private void initPanelComps(){
        textArea = new JTextArea();
        textArea.setEditable(false);
    }

    private void layoutComps(){
        setLayout(new BorderLayout());
        add(textArea, BorderLayout.CENTER);
    }

    public void setTextAreaText(String text){
        textArea.append(text );
    }

    public void clearALl(){
        textArea.setText("");
    }
}

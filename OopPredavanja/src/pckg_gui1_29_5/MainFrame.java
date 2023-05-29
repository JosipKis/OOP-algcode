package pckg_gui1_29_5;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.*;

public class MainFrame extends JFrame {

    private ViewPanel viewPanel;
    private BottomPanel bottomPanel;
    private ToolBarPanel toolBarPanel;
    private JFileChooser fileChooser;

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
        fileChooser = new JFileChooser();
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("txt files", "txt"));
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
                String name = bpe.getName();
                String surname = bpe.getSurname();
                String progIn = bpe.getProgrammingIn();
                viewPanel.setTextOnTextArea(name);
                viewPanel.setTextOnTextArea(surname);
                viewPanel.setTextOnTextArea(progIn);
                viewPanel.setTextOnTextArea("------------------------------------------------------");
            }
        });
        bottomPanel.activateComps();

        toolBarPanel.setToolBarListener(new ToolBarListener() {
            @Override
            public void clearButtonEventOccurred(ToolBarEvent tbe) {
                viewPanel.clearAll();
            }

            @Override
            public void readFromFileButtonEventOccurred(ToolBarEvent tbe) {
                int value = fileChooser.showOpenDialog(MainFrame.this);
                if (value == JFileChooser.APPROVE_OPTION){
                    File file = fileChooser.getSelectedFile();
                    try (BufferedReader br = new BufferedReader(new FileReader(file))){
                        String line;
                        while ((line = br.readLine()) != null){
                            viewPanel.setTextOnTextArea(line +"\n");
                        }
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        toolBarPanel.activateToolBar();
    }
}

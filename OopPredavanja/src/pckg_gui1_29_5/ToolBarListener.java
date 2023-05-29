package pckg_gui1_29_5;

import java.util.EventListener;

public interface ToolBarListener extends EventListener {

    void clearButtonEventOccurred(ToolBarEvent tbe);
    void readFromFileButtonEventOccurred(ToolBarEvent tbe);
}

package pckg_gui1_29_5;

import java.util.EventObject;

public class BottomPanelEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    private String buttonMsg;

    public BottomPanelEvent(Object source, String msg) {
        super(source);
        this.buttonMsg = msg;
    }

    public String getButtonMsg() {
        return buttonMsg;
    }
}

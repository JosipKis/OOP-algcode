package zad1;

import java.util.EventObject;

public class SidePanelEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    private boolean submitClicked;
    private boolean resetClicked;
    private String text;

    public SidePanelEvent(Object source, String text) {
        super(source);
        this.text = text;
    }

    public void setSubmitClicked(boolean submitClicked) {
        this.submitClicked = submitClicked;
    }

    public boolean isSubmitClicked(){
        return submitClicked;
    }

    public boolean isResetClicked() {
        return resetClicked;
    }

    public void setResetClicked(boolean resetClicked) {
        this.resetClicked = resetClicked;
    }

    public void setText(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }
}

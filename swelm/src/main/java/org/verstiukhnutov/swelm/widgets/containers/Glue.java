package org.verstiukhnutov.swelm.widgets.containers;

import java.awt.Component;

import javax.swing.Box;

import org.verstiukhnutov.swelm.app.IWidgetCollection;
import org.verstiukhnutov.swelm.widgets.Widget;

public class Glue extends Widget {

    public enum Orientation {
        Horizontal,
        Vertical,
    };

    private Component glue;

    public Glue(IWidgetCollection widgets, String widgetName, Orientation orienation) {
        super(widgets, widgetName);
        switch (orienation) {
            case Horizontal:
                glue = Box.createHorizontalGlue();
                break;
        
            case Vertical:
                glue = Box.createVerticalGlue();
                break;
        }
    }

    @Override
    public void setVisible(boolean visible) {
        glue.setVisible(visible);
    }

    @Override
    public Glue visible(boolean visible) {
        setVisible(visible);
        return this;
    }

    @Override
    public Component component() {
        return glue;
    }
    
}

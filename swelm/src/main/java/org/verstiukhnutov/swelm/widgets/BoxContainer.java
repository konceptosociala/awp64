package org.verstiukhnutov.swelm.widgets;

import java.awt.Component;
import javax.swing.Box;
import javax.swing.BoxLayout;
import org.verstiukhnutov.swelm.app.IWidgetCollection;

public class BoxContainer extends Widget {

    public enum BoxAlign {
        Horizontal,
        Vertical,
    }

    Box box;

    public <Msg> BoxContainer(IWidgetCollection widgets, String widgetName) {
        super(widgets, widgetName);
        box = new Box(BoxLayout.X_AXIS);
    }

    public BoxContainer align(BoxAlign align) {
        switch (align) {        
            default:
                break;

            case Vertical:
                box = Box.createVerticalBox();
                break;
        }
        return this;
    }

    public BoxContainer children(Widget[] children) {
        for (Widget widget : children) {
            box.add(widget.component());
        }
        return this;
    }

    @Override
    public Component component() {
        return box;
    }

}
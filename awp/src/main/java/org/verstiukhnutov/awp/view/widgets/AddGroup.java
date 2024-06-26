package org.verstiukhnutov.awp.view.widgets;

import org.verstiukhnutov.awp.msg.AwpMsg;
import org.verstiukhnutov.awp.msg.NewGroupMsg;
import org.verstiukhnutov.awp.view.AwpApp;
import org.verstiukhnutov.swelm.utils.Size;
import org.verstiukhnutov.swelm.widgets.ConstructWidget;
import org.verstiukhnutov.swelm.widgets.Widget;

public class AddGroup extends ConstructWidget<AwpMsg> {
    private final AwpApp app;
    private final String widgetName;

    public AddGroup(AwpApp app, String widgetName) {
        super(app, widgetName);
        this.app = app;
        this.widgetName = widgetName;
    }

    @Override
    public Widget build() {
        return new Card(app, widgetName + "_card",
                new Icon(app, widgetName + "_icon")
                        .type(Icon.IconType.Plus)
                        .size(new Size(90, 100))
                        .clicked(app, new NewGroupMsg())
        ).build();
    }
}

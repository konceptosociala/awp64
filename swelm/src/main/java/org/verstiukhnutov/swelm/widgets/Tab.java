package org.verstiukhnutov.swelm.widgets;

public class Tab {

    private final String label;
    private Panel panel;
    private ScrollablePanel scrollablePanel;

    public Tab(String label, Panel panel) {
        this.label = label;
        this.panel = panel;
    }

    public Tab(String label, ScrollablePanel scrollablePanel) {
        this.label = label;
        this.scrollablePanel = scrollablePanel;
    }

    public String getLabel() {
        return label;
    }

    public Widget getPanel() {
        if (panel != null) {
            return panel;
        } else {
            return scrollablePanel;
        }
    }
}

package org.verstiukhnutov.swelm.widgets;

import java.awt.*;

import org.verstiukhnutov.swelm.app.IWidgetCollection;
import org.verstiukhnutov.swelm.utils.Color;
import org.verstiukhnutov.swelm.utils.Pos;
import org.verstiukhnutov.swelm.utils.Size;
import org.verstiukhnutov.swelm.widgets.swing.JPlaceholderTextField;
import org.verstiukhnutov.swelm.widgets.ui.SwelmTextFieldUI;

import javax.swing.border.Border;

public class TextField extends Widget {

    private final JPlaceholderTextField textField;

    public TextField(IWidgetCollection widgets, String widgetName){
        super(widgets, widgetName);
        textField = new JPlaceholderTextField();
        textField.setUI(new SwelmTextFieldUI());
    }

    public TextField text(String text) {
        setText(text);
        return this;
    }
    
    public TextField placeholder(String placeholder) {
        setPlaceholder(placeholder);
        return this;
    }

    public TextField backgroundColor(Color color) {
        setBackgroundColor(color);
        return this;
    }

    public TextField minimumSize(Size size) {
        setMinimumSize(size);
        return this;
    }

    public void setText(String text) {
        textField.setText(text);
    }

    public void setPlaceholder(String placeholder) {
        textField.setPlaceholder(placeholder);
    }

    public void setBackgroundColor(Color color) {
        textField.setBackground(color);
    }

    public void setMinimumSize(Size size) {
        textField.setMinimumSize(new Dimension(size.width, size.height));
    }

    public String getText() {
        return textField.getText();
    }

    @Override
    public void setSize(Size size) {
        textField.setSize(size.width, size.height);
        textField.setPreferredSize(new Dimension(size.width, size.height));
        textField.setMaximumSize(new Dimension(size.width, size.height));
    }

    @Override
    public void setPosition(Pos pos) {
        textField.setLocation(pos.x, pos.y);
    }

    @Override
    public void setBackground(Color color) {
        textField.setBackground(color);
    }

    @Override
    public void setForeground(Color color) {
        textField.setForeground(color);
    }

    @Override
    public void setBorder(Border border) {
        textField.setBorder(border);
    }

    @Override
    public void setAlignmentX(float alignmentX) {
        textField.setAlignmentX(alignmentX);
    }

    @Override
    public void setVisible(boolean visible) {
        textField.setVisible(visible);
    }

    @Override
    public TextField size(Size size) {
        setSize(size);
        return this;
    }

    @Override
    public TextField position(Pos pos) {
        setPosition(pos);
        return this;
    }

    @Override
    public TextField background(Color color) {
        setBackground(color);
        return this;
    }

    @Override
    public TextField foreground(Color color) {
        setForeground(color);
        return this;
    }

    @Override
    public TextField border(Border border) {
        setBorder(border);
        return this;
    }

    @Override
    public TextField alignmentX(float alignmentX) {
        setAlignmentX(alignmentX);
        return this;
    }

    @Override
    public TextField visible(boolean visible) {
        setVisible(visible);
        return this;
    }

    @Override
    public JPlaceholderTextField component() {
        return textField;
    }

}

package com.example.sprinbootdbtwiter;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;


@Route("pigeon-view")
public class PigeonAddView extends VerticalLayout {

    public PigeonAddView() {


        TextField labelField = new TextField();
        labelField.setLabel("name");

        Button leftButton = new Button("Powitac", new Icon(VaadinIcon.ENVELOPE_O));

        Label label = new Label();
        Image image = new Image("https://media.tenor.co/images/c0d8a2d63bf0cdd8fa455f781ec50313/tenor.gif", "");


        leftButton.addClickListener(click -> {
            label.setText("Hello " + labelField.getValue());
            add(image);
        });

        add(labelField, leftButton, label);
    }
}

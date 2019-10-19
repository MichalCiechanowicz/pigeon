package com.example.sprinbootdbtwiter;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("add-pigeon")
public class PigeonAddDb extends HorizontalLayout {

    private PiegonRepo piegonRepo;

    @Autowired
    public PigeonAddDb(PiegonRepo piegonRepo) {
        this.piegonRepo = piegonRepo;

        TextField labelFieldName = new TextField();
        TextField labelFieldColor = new TextField();
        TextField labelFieldNumber = new TextField();
        labelFieldName.setLabel("name");
        labelFieldColor.setLabel("color");
        labelFieldNumber.setLabel("number");

        Button leftButton2 = new Button("Save Ptaka", new Icon(VaadinIcon.ENVELOPE_O));
        leftButton2.addClickListener(click -> {
            Pigeon pigeon = new Pigeon(
                    labelFieldName.getValue(),
                    labelFieldColor.getValue(),
                    labelFieldNumber.getValue());
            piegonRepo.save(pigeon);
        });

        add(labelFieldName, labelFieldColor, labelFieldNumber, leftButton2);

    }
}


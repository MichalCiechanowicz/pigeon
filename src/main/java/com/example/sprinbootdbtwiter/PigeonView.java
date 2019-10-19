package com.example.sprinbootdbtwiter;


import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.util.List;

@Route("pigeons")
public class PigeonView extends VerticalLayout {

    private PiegonRepo piegonRepo;

    public PigeonView(PiegonRepo piegonRepo) {
        this.piegonRepo = piegonRepo;

        List<Pigeon> pigeonList = piegonRepo.findAll();

        Grid<Pigeon> grid = new Grid<>(Pigeon.class);
        grid.setItems(pigeonList);

        add(grid);
        grid.setColumns("id", "name", "color", "number");

    }

}

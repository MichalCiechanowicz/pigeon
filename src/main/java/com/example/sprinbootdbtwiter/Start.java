package com.example.sprinbootdbtwiter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Start {

    private PiegonRepo piegonRepo;

    @Autowired
    public Start(PiegonRepo piegonRepo) {
        this.piegonRepo = piegonRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void get() {

        Pigeon pigeon = new Pigeon("Beksa", "Red", "LC12@");
        piegonRepo.save(pigeon);
    }
}

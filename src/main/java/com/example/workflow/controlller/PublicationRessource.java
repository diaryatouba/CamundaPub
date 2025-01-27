package com.example.workflow.controlller;

import com.example.workflow.service.PublicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicationRessource {
    //gyefbbfftgvebnfzsbsd

    private PublicationService service;

    public PublicationRessource(PublicationService service) {
        this.service = service;
    }

    @GetMapping("/demarrer-process")
    public ResponseEntity<String> demarrerProcess() {
        service.demarrerProcess();
        return ResponseEntity.ok("Le process a demarrer");
    }
    @GetMapping("/video-editee")
    public ResponseEntity<String> notifieeVideoeEditee() {
        service.notifierMessage();
        return ResponseEntity.ok("La notification a ete envoyee");
    }
}


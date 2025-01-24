package com.example.workflow.service;

import org.camunda.bpm.engine.ProcessEngine;
import org.springframework.stereotype.Service;

@Service
public class PublicationService {

    private ProcessEngine processEngine;

    public PublicationService(ProcessEngine processEngine) {
        this.processEngine = processEngine;
    }

    public void demarrerProcess() {
        processEngine.getRuntimeService()
                .startProcessInstanceByMessage("NouvelleIdee", "pub-1");
    }

    public void notifierMessage() {
        processEngine.getRuntimeService()
                .correlateMessage("videoEditee", "pub-1");
    }
}

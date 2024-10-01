package project.shimozukuri.dataanalysermicroservise.service;

import project.shimozukuri.dataanalysermicroservise.model.Data;

public interface KafkaDataService {

    void handle(Data data);
}

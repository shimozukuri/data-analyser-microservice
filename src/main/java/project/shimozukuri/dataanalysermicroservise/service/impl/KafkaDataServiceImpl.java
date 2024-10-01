package project.shimozukuri.dataanalysermicroservise.service.impl;

import org.springframework.stereotype.Service;
import project.shimozukuri.dataanalysermicroservise.model.Data;
import project.shimozukuri.dataanalysermicroservise.service.KafkaDataService;

@Service
public class KafkaDataServiceImpl implements KafkaDataService {

    @Override
    public void handle(Data data) {
        System.out.println("Data object is received: " + data.toString());
    }
}

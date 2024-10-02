package project.shimozukuri.dataanalysermicroservise.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import project.shimozukuri.dataanalysermicroservise.model.Data;
import project.shimozukuri.dataanalysermicroservise.repository.DataRepository;
import project.shimozukuri.dataanalysermicroservise.service.KafkaDataService;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaDataServiceImpl implements KafkaDataService {

    private final DataRepository dataRepository;

    @Override
    public void handle(Data data) {
        log.info("Data object {} was saved", data);

        dataRepository.save(data);
    }
}

package project.shimozukuri.dataanalysermicroservise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.shimozukuri.dataanalysermicroservise.model.Data;

@Repository
public interface DataRepository extends JpaRepository<Data, Long> {
}

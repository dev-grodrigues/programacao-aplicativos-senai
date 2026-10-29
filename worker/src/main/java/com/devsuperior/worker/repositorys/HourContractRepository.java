package com.devsuperior.worker.repositorys;

import com.devsuperior.worker.entities.HourContract;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

@Configuration
public interface HourContractRepository extends JpaRepository<HourContract, Long> {
}

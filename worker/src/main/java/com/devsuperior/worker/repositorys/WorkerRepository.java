package com.devsuperior.worker.repositorys;

import com.devsuperior.worker.entities.Worker;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

@Configuration
public interface WorkerRepository extends JpaRepository<Worker, Long> {

}

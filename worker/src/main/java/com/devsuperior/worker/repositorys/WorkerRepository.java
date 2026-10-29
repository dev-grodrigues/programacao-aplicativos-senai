package com.devsuperior.worker.repositorys;

import com.devsuperior.worker.entities.Worker;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


@Configuration
public interface WorkerRepository extends JpaRepository<Worker, Long> {

}

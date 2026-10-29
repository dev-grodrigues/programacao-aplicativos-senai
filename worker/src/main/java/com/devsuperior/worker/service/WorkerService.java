package com.devsuperior.worker.service;

import com.devsuperior.worker.entities.Worker;
import com.devsuperior.worker.repositorys.WorkerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {

    private final WorkerRepository repository;

    public WorkerService(WorkerRepository repository) {
        this.repository = repository;
    }

    public List<Worker> findAll() {
        return repository.findAll();
    }
}

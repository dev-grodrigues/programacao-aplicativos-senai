package com.devsuperior.worker.service;

import com.devsuperior.worker.entities.Worker;
import com.devsuperior.worker.repositorys.WorkerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerService {

    private final WorkerRepository repository;

    public WorkerService(WorkerRepository repository) {
        this.repository = repository;
    }

    public List<Worker> findAll() {
        return repository.findAll();
    }

    public Worker findById(Long id){
        Optional<Worker> obj = repository.findById(id);
        return obj.orElseThrow(() -> new RuntimeException("Worker not find"));
    }
}

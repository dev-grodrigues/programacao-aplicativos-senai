package com.devsuperior.worker.controllers;
import com.devsuperior.worker.dto.WorkerIncomeDTO;
import com.devsuperior.worker.entities.Worker;
import com.devsuperior.worker.repositorys.WorkerRepository;
import com.devsuperior.worker.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {

    @Autowired
    private WorkerRepository workerRepository;

    private final WorkerService service;


    @GetMapping(value = "/{id}/income/{year}/{month}")
    public WorkerIncomeDTO getIncome(@PathVariable Long id, @PathVariable Integer year, @PathVariable Integer month) {
        Worker worker = workerRepository.findById(id).get();
        return new WorkerIncomeDTO(worker.getName(), worker.getDepartment().getName(), worker.income(year, month));
    }


    public WorkerController(WorkerService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Worker>> getAllWorkers() {
        List<Worker> list = service.findAll();
        return ResponseEntity.ok(list);
    }
    @GetMapping(value = "/{id}")
    public  ResponseEntity<Worker> getWorkerById(@PathVariable Long id){
        Worker obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}

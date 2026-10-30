package com.devsuperior.worker.config;

import com.devsuperior.worker.entities.Department;
import com.devsuperior.worker.entities.HourContract;
import com.devsuperior.worker.entities.Worker;
import com.devsuperior.worker.entities.enums.WorkerLevel;
import com.devsuperior.worker.repositorys.DepartmentRepository;
import com.devsuperior.worker.repositorys.HourContractRepository;
import com.devsuperior.worker.repositorys.WorkerRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Configuration
public class SeedingConfig implements CommandLineRunner {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private WorkerRepository workerRepository;

    @Autowired
    private HourContractRepository hourContractRepository;

    @Transactional
    @Override
    public void run(String... args) throws Exception {

        Department dept = new Department("AWS");
        dept = departmentRepository.save(dept);

        Worker worker = new Worker("Gabriel", WorkerLevel.JUNIOR,1200.0, dept);
        worker = workerRepository.save(worker);

        Worker worker2 = new Worker("Augusto",WorkerLevel.MID_LEVEL,3000.0,dept);
        worker2 = workerRepository.save(worker2);

        Worker worker3 = new Worker("Maikinho",WorkerLevel.MID_LEVEL,3000.0,dept);
        worker3 = workerRepository.save(worker3);
        Worker worker4 = new Worker("Samuel",WorkerLevel.MID_LEVEL,3000.0,dept);
        worker4 = workerRepository.save(worker4);
        Worker worker5 = new Worker("Westn",WorkerLevel.SENIOR,3000.0,dept);
        worker5 = workerRepository.save(worker5);


        HourContract contract1 = new HourContract(LocalDate.of(2016,8,20), 50.0,20);
        HourContract contract2 = new HourContract(LocalDate.of(2016,6,13), 30.0,18);
        HourContract contract3 = new HourContract(LocalDate.of(2016,8,15), 80.0,10);

        HourContract contract4 = new HourContract(LocalDate.of(2026,9,15), 50.0,10);
        HourContract contract5 = new HourContract(LocalDate.of(2026,8,15), 30.0,10);
        HourContract contract6 = new HourContract(LocalDate.of(2026,7,15), 80.0,10);

        HourContract contract7 = new HourContract(LocalDate.of(2026,9,15), 50.0,10);
        HourContract contract8 = new HourContract(LocalDate.of(2026,8,15), 30.0,10);
        HourContract contract9 = new HourContract(LocalDate.of(2026,7,15), 80.0,10);

        worker.addContract(contract1);
        worker.addContract(contract2);
        worker.addContract(contract3);

        worker2.addContract(contract4);
        worker2.addContract(contract5);
        worker2.addContract(contract6);

        worker3.addContract(contract7);
        worker3.addContract(contract8);
        worker3.addContract(contract9);

    }
}

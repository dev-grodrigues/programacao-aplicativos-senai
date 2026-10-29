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

        HourContract contract1 = new HourContract(LocalDate.of(2018,8,20), 50.0,20);
        HourContract contract2 = new HourContract(LocalDate.of(2018,6,13), 30.0,18);
        HourContract contract3 = new HourContract(LocalDate.of(2018,8,15), 80.0,10);

        worker.addContract(contract1);
        worker.addContract(contract2);
        worker.addContract(contract3);

    }
}

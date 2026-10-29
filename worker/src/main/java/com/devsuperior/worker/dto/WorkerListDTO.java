package com.devsuperior.worker.dto;

import com.devsuperior.worker.entities.HourContract;
import com.devsuperior.worker.entities.enums.WorkerLevel;

public record WorkerListDTO(

        Integer id_Worker,
        String name,
        WorkerLevel level,
        Double baseSalary,
        String department,
        HourContract contracts
        ) {
}

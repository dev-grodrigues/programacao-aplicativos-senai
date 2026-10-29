package com.devsuperior.worker.repositorys;

import com.devsuperior.worker.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {


}

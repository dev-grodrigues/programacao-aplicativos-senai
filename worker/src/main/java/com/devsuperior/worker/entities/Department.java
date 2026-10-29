package com.devsuperior.worker.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Department;
    private String name;

    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId_Department() {
        return id_Department;
    }

    public void setId_Department(Long id_Department) {
        this.id_Department = id_Department;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(id_Department, that.id_Department);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id_Department);
    }
}

package com.devsuperior.worker.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;


import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "tb_hour_contract")
public class HourContract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_HourContract;
    private LocalDate date;
    private Double valuePerHour;
    private Integer hours;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "worker_id")
    private Worker worker;

    public HourContract() {
    }

    public HourContract(LocalDate date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Long getId_HourContract() {
        return id_HourContract;
    }

    public void setId_HourContract(Long id_HourContract) {
        this.id_HourContract = id_HourContract;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public double totalValue(){
        return valuePerHour * hours;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        HourContract that = (HourContract) o;
        return Objects.equals(id_HourContract, that.id_HourContract);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id_HourContract);
    }
}

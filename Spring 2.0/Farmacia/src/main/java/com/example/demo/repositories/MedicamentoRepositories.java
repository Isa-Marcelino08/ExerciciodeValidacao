package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Medicamento;

public interface MedicamentoRepositories extends JpaRepository<Medicamento, Long> {

}
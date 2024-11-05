package com.exo1.exo1.repository;

import com.exo1.exo1.entity.Projet;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.domain.Pageable;

public interface ProjetRepository extends JpaRepository<Projet, Long> {
    @Override
    @Query("SELECT p FROM Projet p JOIN FETCH p.users JOIN FETCH p.tasks")
    Page<Projet> findAll(Pageable pageable);
}
package com.restApi.springboot.springbootpostgresdocker.repository;

import com.restApi.springboot.springbootpostgresdocker.model.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Projetrepository extends JpaRepository<Projet,Integer> {
}

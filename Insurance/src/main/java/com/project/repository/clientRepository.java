package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Entity.Client;

@Repository
public interface clientRepository extends JpaRepository<Client, Long>{

}

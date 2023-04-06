package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Entity.Claim;


@Repository
public interface claimRepository extends JpaRepository<Claim, Long> {

}

package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Entity.Insurance;


@Repository
public interface insuranceRepository extends JpaRepository<Insurance,Long> {

}

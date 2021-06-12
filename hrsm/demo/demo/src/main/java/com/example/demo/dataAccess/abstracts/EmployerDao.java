package com.example.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{

}

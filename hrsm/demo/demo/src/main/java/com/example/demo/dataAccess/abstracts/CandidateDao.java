package com.example.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer>{
//Candidate findByNationalityId(String nationalityNumber);
//	Candidate findByTckn(String tckn);
//
//	Candidate findByEmail(String email);
}

package com.example.demo.dataAccess.abstracts;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.concretes.ActivationCode;

public interface ActivationCodeDao extends JpaRepository<ActivationCode, Integer> {
//	ActivationCode getActivationCode(String verifyCode);
//
//	boolean existByVerifyCode(String verifyCode);
//	@Modifying(clearAutomatically = true)
//	@Transactional
//	@Query("Update ActivationCode Set isConfirmed = true, dateConfirm=:date where id=:id")	
//	void updateDateConfirm(@Param("id") int id, @Param("date") LocalDate date);

}

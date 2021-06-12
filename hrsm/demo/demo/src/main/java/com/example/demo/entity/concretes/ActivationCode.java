package com.example.demo.entity.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "activation_codes")
@AllArgsConstructor
@NoArgsConstructor
public class ActivationCode {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "activation_code_id")
	private int activation_code_id;

	@Column(name = "activatio_code")
	private String activatio_code;
	@Column(name = "is_confirmed")
	private boolean is_confirmed;
	@Column(name = "confirm_date")
	private String confirm_date;
	
}

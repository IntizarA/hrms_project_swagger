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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "activationcode_employees")
public class EmployeeActivation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "activation_code_id")
	private int activation_code_id;
	@Column(name = "employee_user_id")
	private int employee_user_id;
	@Column(name = "is_confirm")
	private boolean is_confirm;
}

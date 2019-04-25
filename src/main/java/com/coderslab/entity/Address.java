package com.coderslab.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "addressId")
	private Long addressId;

	@Column(name = "addressLine1", length = 255)
	private String addressLine1;

	@Column(name = "addressLine2", length = 255)
	private String addressLine2;
}

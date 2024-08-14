package com.marcelmariani.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Customer {

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private String id;
	@Id
	@Column(name = "documentId")
	@JsonProperty("document_id")
	private String documentId;
	
	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "email")
	private String email;



}
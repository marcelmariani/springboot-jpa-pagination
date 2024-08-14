package com.marcelmariani.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@RedisHash("customer")
public class CustomerRedis {
	
	@Id
	@Indexed
	@Column(name = "documentId")
	@JsonProperty("document_id")
	private String documentId;	
//	private Integer id;
	private String name;
	private String email;


}

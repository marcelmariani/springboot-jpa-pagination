package com.marcelmariani.controller.dto.filter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerFilter {

	private String documentId;
//	private String id;
	private String name;
	private String email;

}
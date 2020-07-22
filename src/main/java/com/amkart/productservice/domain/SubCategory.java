package com.amkart.productservice.domain;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Field;

public class SubCategory {

	@Field("id")
	private String id;
	
	@Field("title")
	private String title;
	
	@Field("desc")
	private String desc;
	
	@Field("children")
	private List<SubCategory> children;
	
	@Field("filters")
	private List<String> filters;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<SubCategory> getChildren() {
		return children;
	}

	public void setChildren(List<SubCategory> children) {
		this.children = children;
	}

	public List<String> getFilters() {
		return filters;
	}

	public void setFilters(List<String> filters) {
		this.filters = filters;
	}
	

}

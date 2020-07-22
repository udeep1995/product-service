package com.amkart.productservice.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="category")
public class Category {

	@Id
	private String id;
	
	@Field("title")
	private String title;
	
	
	@Field("desc")
	private String desc;
	
	
	@Field("children")
	private List<SubCategory> children;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
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

	public List<SubCategory> getChildren() {
		return children;
	}

	public void setChildren(List<SubCategory> children) {
		this.children = children;
	}
	
}

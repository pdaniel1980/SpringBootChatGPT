package com.pdaniel.springbootchatgpt.model;

import lombok.Data;

@Data
public class SearchRequest {
	
	private String query;

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

}

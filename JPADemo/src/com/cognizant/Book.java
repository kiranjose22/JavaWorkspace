package com.cognizant;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "publishdate")
	private Date publishdate;
	@Column(name = "author")
	private String author;
	@Column(name = "version")
	private int version;
	
	public Book() {
		super();
	}

	public Book(int id, String name, Date publishdate, String author, int version) {
		super();
		this.id = id;
		this.name = name;
		this.publishdate = publishdate;
		this.author = author;
		this.version = version;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return publishdate;
	}

	public void setDate(Date publishdate) {
		this.publishdate = publishdate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	
	
	
	

}

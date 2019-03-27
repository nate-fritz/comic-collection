package org.wecancodeit.comiccollection.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Item {

	@Id
	@GeneratedValue
	private Long id;
	private String itemName;
	private int rating;
	
	@Lob
	private String description;
	
	@ManyToOne
	@JsonIgnore
	private Publisher publisher;
	
	@ManyToMany
	private Collection<Tag> tags;
	
	
	public Item() {}

	public Item(String itemName, String description, int rating, Publisher publisher, Tag ...tags) {
		super();
		this.itemName = itemName;
		this.description = description;
		this.rating = rating;
		this.publisher = publisher;

		this.tags = Arrays.asList(tags);
	}

	public Long getId() {
		return id;
	}

	public String getItemName() {
		return itemName;
	}

	public String getDescription() {
		return description;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public int getRating() {
		return rating;
	}




	
	

	
}

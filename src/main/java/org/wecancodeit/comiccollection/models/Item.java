package org.wecancodeit.comiccollection.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Item {

	@Id
	@GeneratedValue
	private Long id;
	private String itemName;
	
	@Lob
	private String description;
	
	@ManyToOne
	@JsonIgnore
	private Publisher publisher;
	
	@ElementCollection
	@CollectionTable
	private Collection<Creator> creators;
	
	public Item() {}

	public Item(String itemName, String description, Publisher publisher) {
		super();
		this.itemName = itemName;
		this.description = description;
		this.publisher = publisher;
		this.creators = new ArrayList<Creator>();
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

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", description=" + description + "]";
	}
	
	
	

	
}

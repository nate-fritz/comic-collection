package org.wecancodeit.comiccollection.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Item {

	@Id
	@GeneratedValue
	private Long id;
	private String itemName;
	private String description;
	
	@ManyToOne
	@JsonIgnore
	private Publisher publisher;
	
	public Item() {}

	/**
	 * @param itemName
	 * @param description
	 * @param publisher
	 */
	public Item(String itemName, String description, Publisher publisher) {
		super();
		this.itemName = itemName;
		this.description = description;
		this.publisher = publisher;
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

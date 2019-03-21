package org.wecancodeit.comiccollection.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Publisher {

	@Id
	@GeneratedValue
	private Long id;
	private String publisherName;
	
	@OneToMany(mappedBy="publisher")
	private Collection<Item> items;
	
	@ElementCollection
	@CollectionTable
	private Collection<Creator> creators;

	public Publisher() {}

	public Publisher(String publisherName) {
		this.publisherName = publisherName;
		this.items = new ArrayList<Item>();
		this.creators = new ArrayList<Creator>();
	}

	public Long getId() {
		return id;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public Collection<Item> getItems() {
		return items;
	}

	public Collection<Creator> getCreators() {
		return creators;
	}

	
	
	@Override
	public String toString() {
		return "Publisher [id=" + id + ", publisherName=" + publisherName + ", items=" + items + ", creators="
				+ creators + "]";
	}
	
	
	

	
}

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
	private String rating;
	

	
	@OneToMany
	private Collection<Item> items;
	
	@ElementCollection
	@CollectionTable
	private Collection<Series> creators;

	public Publisher() {}

	
	public Publisher(String publisherName, String rating) {

		this.publisherName = publisherName;
		this.rating = rating;
		this.items = new ArrayList<Item>();
	}

	
	
	public Long getId() {
		return id;
	}


	public String getPublisherName() {
		return publisherName;
	}


	public String getRating() {
		return rating;
	}





	public Collection<Item> getItems() {
		return items;
	}


	public Collection<Series> getCreators() {
		return creators;
	}


	@Override
	public String toString() {
		return "Publisher [id=" + id + ", publisherName=" + publisherName + ", rating=" + rating + ",  items=" + items + ", creators=" + creators + "]";
	}



	
	
	

	
}

package org.wecancodeit.comiccollection.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {

	@Id
	@GeneratedValue
	private Long id;
	private String tagName;
	
	@ManyToMany
	private Collection<Tag> tags;
	
	public Tag() {
	}

	public Tag(String tagName) {
		this.tagName = tagName;
	}

	public Long getId() {
		return id;
	}

	public String getTagName() {
		return tagName;
	}

	@Override
	public String toString() {
		return "Tag [id=" + id + ", tagName=" + tagName + "]";
	}

}

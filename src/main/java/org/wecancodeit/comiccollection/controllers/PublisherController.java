package org.wecancodeit.comiccollection.controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.wecancodeit.comiccollection.models.Publisher;
import org.wecancodeit.comiccollection.repositories.PublisherRepository;


@RestController
@RequestMapping("/publishers")
public class PublisherController {

	@Resource
	PublisherRepository publisherRepo;
	
	@GetMapping("")
	public Collection<Publisher> getPublishers() {
		return (Collection<Publisher>) publisherRepo.findAll();
	}

	@PostMapping("/add")
	public Collection<Publisher> addPublisher(@RequestBody String body) throws JSONException {
		JSONObject json = new JSONObject(body);
		String publisherName = json.getString("publisherName");
		String rating = json.getString("rating");
		
		publisherRepo.save(new Publisher(publisherName, rating));
		
		return (Collection<Publisher>) publisherRepo.findAll();
		
	}
}



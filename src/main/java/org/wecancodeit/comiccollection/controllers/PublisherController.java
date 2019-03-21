package org.wecancodeit.comiccollection.controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
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
}

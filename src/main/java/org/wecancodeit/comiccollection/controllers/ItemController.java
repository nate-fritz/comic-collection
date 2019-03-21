package org.wecancodeit.comiccollection.controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.comiccollection.models.Item;
import org.wecancodeit.comiccollection.repositories.ItemRepository;

@RestController
@RequestMapping("/items")
public class ItemController {
	
	@Resource
	ItemRepository itemRepo;
	
	@GetMapping("")
	public Collection<Item> getItems() {
		return (Collection<Item>) itemRepo.findAll();	
		}

}

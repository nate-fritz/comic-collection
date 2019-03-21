package org.wecancodeit.comiccollection;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.comiccollection.models.Item;
import org.wecancodeit.comiccollection.models.Publisher;
import org.wecancodeit.comiccollection.repositories.ItemRepository;
import org.wecancodeit.comiccollection.repositories.PublisherRepository;

@Service
public class Initializer implements CommandLineRunner {

	@Resource
	ItemRepository itemRepo;
	
	@Resource
	PublisherRepository publisherRepo;

	@Override
	public void run(String... args) throws Exception {
		Publisher marvel = publisherRepo.save(new Publisher("Marvel"));
		Publisher dccomics = publisherRepo.save(new Publisher("DC Comics"));
		Publisher image = publisherRepo.save(new Publisher("Image"));
		Publisher darkhorse = publisherRepo.save(new Publisher("Dark Horse"));
		
		itemRepo.save(new Item("Secret Warriors Omnibus", "Nick Fury has gathered a special team of Secret Warriors, but these young heroes have a lot to learn in a very short time when they uncover a conspiracy that reaches from the Oval Office to the temples of Japan - and even beyond death. The Leviathan organization is awakening, their tendrils wrapped deep inside the US government. And when a shadow war breaks out between Leviathan and the ruthless Hydra, it's up to Fury and his Secret Warriors to put the pieces together and take them both out. Jonathan Hickman (with Brian Michael Bendis)'s shadow-ops masterpiece is collected in one oversized volume! Collecting: Mighty Avengers 13, 18; Secret Warriors 1-28; Dark Reign: The List Secret Warriors; Siege: Secret Warriors; material from Dark Reign: New Nation", marvel));
		itemRepo.save(new Item("Kingdom Come", "Set just after the dawn of the 21st Century in a world spinning inexorably out of control comes this grim tale of youth versus experience, tradition versus change and what defines a hero. KINGDOM COME is a riveting story pitting the old guard—Superman, Batman, Wonder Woman and their peers—against a new uncompromising generation and ultimately in the final war against each other to determine nothing less than the future of the planet.", dccomics));
	}
	
}

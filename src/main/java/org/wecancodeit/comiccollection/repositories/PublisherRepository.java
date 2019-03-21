package org.wecancodeit.comiccollection.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.comiccollection.models.Publisher;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

	
}

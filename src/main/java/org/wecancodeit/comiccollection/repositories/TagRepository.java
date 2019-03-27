package org.wecancodeit.comiccollection.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.comiccollection.models.Tag;



	@Repository
	public interface TagRepository extends CrudRepository<Tag, Long> {
	
}

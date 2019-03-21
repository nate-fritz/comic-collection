package org.wecancodeit.comiccollection.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.comiccollection.models.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

}

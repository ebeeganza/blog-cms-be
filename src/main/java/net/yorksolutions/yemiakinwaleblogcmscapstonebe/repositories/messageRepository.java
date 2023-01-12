package net.yorksolutions.yemiakinwaleblogcmscapstonebe.repositories;

import net.yorksolutions.yemiakinwaleblogcmscapstonebe.models.Blog;
import net.yorksolutions.yemiakinwaleblogcmscapstonebe.models.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {
}

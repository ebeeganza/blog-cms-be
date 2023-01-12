package net.yorksolutions.yemiakinwaleblogcmscapstonebe.repositories;

import net.yorksolutions.yemiakinwaleblogcmscapstonebe.models.Blog;
import net.yorksolutions.yemiakinwaleblogcmscapstonebe.models.Blogger;
import org.springframework.data.repository.CrudRepository;

public interface BloggerRepository extends CrudRepository<Blogger, Long> {
}

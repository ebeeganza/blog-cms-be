package net.yorksolutions.yemiakinwaleblogcmscapstonebe.repositories;

import net.yorksolutions.yemiakinwaleblogcmscapstonebe.models.Blog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BlogRepository extends CrudRepository<Blog, Long> {

    Optional<Blog> findByAuthor(String author);
}

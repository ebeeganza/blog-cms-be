package net.yorksolutions.yemiakinwaleblogcmscapstonebe.repositories;

import net.yorksolutions.yemiakinwaleblogcmscapstonebe.models.Blog;
import net.yorksolutions.yemiakinwaleblogcmscapstonebe.models.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long> {
}

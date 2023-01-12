package net.yorksolutions.yemiakinwaleblogcmscapstonebe.services;

import net.yorksolutions.yemiakinwaleblogcmscapstonebe.repositories.BlogRepository;
import net.yorksolutions.yemiakinwaleblogcmscapstonebe.repositories.BloggerRepository;
import org.springframework.stereotype.Service;

@Service
public class BloggerService {

    private final BloggerRepository bloggerRepository;

    private final BlogRepository blogRepository;

    public BloggerService(BloggerRepository bloggerRepository, BlogRepository blogRepository) {
        this.bloggerRepository = bloggerRepository;
        this.blogRepository = blogRepository;
    }


}

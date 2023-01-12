package net.yorksolutions.yemiakinwaleblogcmscapstonebe.services;

import net.yorksolutions.yemiakinwaleblogcmscapstonebe.models.Blog;
import net.yorksolutions.yemiakinwaleblogcmscapstonebe.repositories.BlogRepository;
import net.yorksolutions.yemiakinwaleblogcmscapstonebe.repositories.BloggerRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class BlogService {

    private final BlogRepository blogRepository;
    private final BloggerRepository bloggerRepository;

    public BlogService(BlogRepository blogRepository, BloggerRepository bloggerRepository) {
        this.blogRepository = blogRepository;
        this.bloggerRepository = bloggerRepository;
    }


    public Iterable <Blog> getAllBlogs() {return blogRepository.findAll();}


    public Blog createBlog(Blog blog) throws Exception {
        return blogRepository.save(blog);

    }

    public Blog updateBlog(Long id, Blog blog) throws Exception {
        if (blogRepository.findById(id).isEmpty())
            throw new Exception();
        final var updateBlog = blogRepository.findById(id).orElseThrow();
        blog.title = blog.title;
        updateBlog.body = blog.body;
        blog.author = blog.author;
        blog.createdDate = blog.createdDate;
        updateBlog.updatedDate = new Date();

        return blogRepository.save(updateBlog);

    }

    public void deleteBlog(Long id) throws Exception {
        Optional <Blog> blogToDelete = this.blogRepository.findById(id);
        if (blogToDelete.isEmpty()) {
            throw new Exception();
        }
        blogRepository.deleteById(id);
    }


}

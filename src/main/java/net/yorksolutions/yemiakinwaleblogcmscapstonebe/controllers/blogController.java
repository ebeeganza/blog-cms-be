package net.yorksolutions.yemiakinwaleblogcmscapstonebe.controllers;

import net.yorksolutions.yemiakinwaleblogcmscapstonebe.models.Blog;

import net.yorksolutions.yemiakinwaleblogcmscapstonebe.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/blog")
@CrossOrigin
public class BlogController {
    private final BlogService service;

    @Autowired
    public BlogController(BlogService service) { this.service = service;}

    @GetMapping
    public Iterable <Blog> getAllBlogs() { return service.getAllBlogs(); }


//    @GetMapping
//    public Blog getByAuthor(@RequestParam String author) {
//
//        final var blog = service.getByAuthor(author);
//
//        if (author == null)
//            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED);
//
//        return blog;
//    }

    @PostMapping
    public Blog createBlog(@RequestBody Blog blog) {
        try {
            return service.createBlog(blog);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }
    }

    @PutMapping("/{id}")
    public Blog updateBlog(@PathVariable Long id, @RequestBody Blog blog) {
        try {
          return  service.updateBlog(id, blog);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.PRECONDITION_FAILED);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteBlog(@PathVariable Long id, @RequestBody Blog blog) {
        try {
            service.deleteBlog(id);
        } catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

}

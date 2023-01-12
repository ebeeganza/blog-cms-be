package net.yorksolutions.yemiakinwaleblogcmscapstonebe.controllers;

import net.yorksolutions.yemiakinwaleblogcmscapstonebe.models.Blogger;
import net.yorksolutions.yemiakinwaleblogcmscapstonebe.services.BloggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin
public class BloggerController {

    private final BloggerService service;

    @Autowired
    public BloggerController(BloggerService service) { this.service = service;}

//    @GetMapping
//    public Iterable <Blogger> getAllBlogger() {
//        return service.getAllBlogger();
}

